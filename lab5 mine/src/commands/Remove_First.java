package commands;

import models.StudyGroup;
import utility.CollectionManager;
import utility.Console;

public class Remove_First extends Command{
    public Remove_First(String name, String description) {
        super("remove_first", "удалить первый элемент коллекции");
    }

    public static void execution(Console console, CollectionManager collectionManager){
        if (!collectionManager.getCollection().isEmpty()){
            collectionManager.getCollection().remove(0);
            System.out.println("первый элемент удален");
        }else{
            System.out.println("В коллекции ничего нет");
        }
    }
}
