package commands;

import models.StudyGroup;
import utility.CollectionManager;
import utility.Console;

public class Clear extends Command{
    public Clear(String name, String description) {
        super("clear", "очистить коллекцию");
    }
    public static void execution(Console console, CollectionManager collectionManager){
        collectionManager.getCollection().clear();
        System.out.println("Коллекция очистилась");
    }
}
