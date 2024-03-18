package commands;

import models.StudyGroup;
import utility.Answer;
import utility.CollectionManager;
import utility.Console;
import utility.StandartConsole;

public class Add extends Command {
    private StandartConsole console;
    private CollectionManager collectionManager;

    public Add(Console console, CollectionManager collectionManager) throws Answer.AnswerBreak {
        super("add {element}", "добавить новый элемент в коллекцию");
//        this.console =console;
//        this.commandManager = commandManager;
        Integer count = collectionManager.getCollection().size();
        collectionManager.add(Answer.ansStudyGroup(console, collectionManager.getFreeId()));
        Integer count2 = collectionManager.getCollection().size();
        if (count.equals(count2)){
            System.out.println("элемент НЕ добавлен");
        }else{
            System.out.println("элемент добавлен");
        }
    }

}
