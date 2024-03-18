package commands;

import models.StudyGroup;
import utility.CollectionManager;
import utility.Console;

import java.time.LocalDateTime;

public class Show extends Command{
    public Show(String name, String description) {
        super("show", "все элементы коллекции в строковом представлении");
    }
    public static void execution(Console console, CollectionManager collectionManager){
        if (!collectionManager.getCollection().isEmpty()){
            for (StudyGroup i: collectionManager.getCollection()){
                System.out.println(i);
            }
        }else {
            System.out.println("В коллекции пусто");
        }
    }
}
