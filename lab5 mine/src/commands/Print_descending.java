package commands;

import models.StudyGroup;
import utility.CollectionManager;
import utility.Console;

import java.util.Collections;

public class Print_descending extends Command{
    public Print_descending(String name, String description) {
        super("print_descending", "Сортирует элементы в порядке убывания");
    }
    public static void execution(Console console, CollectionManager collectionManager){
        Collections.sort(collectionManager.getCollection(), Collections.reverseOrder());
        System.out.println("Коллекция по убыванию:");
        for (StudyGroup i: collectionManager.getCollection()){
            System.out.println(i);
        }
    }
}
