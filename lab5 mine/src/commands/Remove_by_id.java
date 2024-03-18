package commands;

import models.StudyGroup;
import utility.CollectionManager;
import utility.Console;

public class Remove_by_id extends Command{
    public Remove_by_id(String name, String description) {
        super("remove_by_id", "удалить элемент по id");
    }
    public static void execution(Console console, CollectionManager collectionManager, Integer id){
        if (!collectionManager.getCollection().isEmpty()) {
            collectionManager.getCollection().remove(collectionManager.byId(id));
        }else{
            System.out.println("В коллекции пусто");
        }
    }
}
