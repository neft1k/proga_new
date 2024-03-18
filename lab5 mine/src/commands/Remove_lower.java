package commands;

import models.StudyGroup;
import utility.Answer;
import utility.CollectionManager;
import utility.Console;

public class Remove_lower extends Command{
    public Remove_lower(String name, String description) {
        super("remove_lower", "удалить все элементы меньшие данного");
    }
    public static void execution(Console console, CollectionManager collectionManager) throws Answer.AnswerBreak {

        StudyGroup element = Answer.ansStudyGroup(console, collectionManager.getFreeId());
        System.out.println("Удалено " + collectionManager.getCollection().size() + " элементов коллекции");
        collectionManager.getCollection().clear();

//        int index = collectionManager.getCollection().indexOf(element);
//        if (index > 0) {
//            collectionManager.getCollection().subList(0, index).clear();
//        }

    }
}
