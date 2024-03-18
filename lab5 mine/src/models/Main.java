package models;

import commands.CommandProcessor;

import utility.CollectionManager;
import utility.DumpManager;
import utility.StandartConsole;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        var console = new StandartConsole();
//        String inputString = "";
//        System.out.println("Введите название файла: ");
        if (args.length == 0) {
            console.println(
                    "Введите имя загружаемого файла как аргумент командной строки");
            System.exit(1);
        }
//        while (userScanner.hasNext()) {
//            inputString = userScanner.nextLine().trim();
//            File file = new File(inputString);
//            if (file.isFile()) {
//                break;
//            }else{
//                System.out.println("Нет такого файла");
//            }
//            System.out.println("Введите название файла: ");
//        }

        String inputString = args[0];
        DumpManager dumpManager = new DumpManager(inputString, console);
        var collectionManager = new CollectionManager(dumpManager);
        CommandProcessor processor = new CommandProcessor(console, collectionManager);
        collectionManager.loadCollection();
        Vector<StudyGroup> a  = (Vector<StudyGroup>) collectionManager.getCollection().clone();
        for (StudyGroup i: a){
            if (!i.validate()){
                collectionManager.getCollection().remove(i);
            }
        }

        Set<String> uniqueStrings = new HashSet<>();
        try {
            while (true) {
                if (console.getFileScanner() == null) {
                    System.out.print("Введите команду: ");
                }
                String[] userCommand = (console.readln().trim() + " 1 1 s ").split(" ", 4);
                if (userCommand[0].equals("exit")) {
                    System.out.println("Выход из программы");
                    break;
                }
                if (userCommand[0].equals("execute_skript")){
                    while (console.isCanReadln()) {
                        inputString = console.readln().trim();
                        File file = new File(inputString);
                        if (file.isFile()) {
                            break;
                        }else{
                            System.out.println("Нет такого файла");
                        }
                        System.out.println("Введите название файла: ");
                    }
                    console.selectFileScanner(new Scanner(new FileReader(new File(inputString))));
                    if (!uniqueStrings.contains(inputString)) {
                        uniqueStrings.add(inputString);

                    }else {
                        console.selectConsoleScanner();
                        uniqueStrings.clear();
                        System.out.println("Произошло зацикливание скрипта");
//                        System.exit(1);
                    }

                }
                if (!console.isCanReadln()){
                    console.selectConsoleScanner();

                }
                processor.processCommand(userCommand);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Напоминаю: у меня столько проблем вызвала эта дурацкая обработка CTRL + D, не нажимайте пожалуйста(((" );
        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла");
        }


    }
}