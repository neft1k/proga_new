package commands;

import models.StudyGroup;
import utility.CollectionManager;
import utility.Console;

import java.util.Collections;

public class Average_of_students_count extends Command{
    public Average_of_students_count(String name, String description) {
        super("average_of_students_count", "вывести значения поля groupAdmin в порядке убывания");
    }
    public static void execution(Console console, CollectionManager collectionManager){
        Long sum = 0L;
        for (StudyGroup i: collectionManager.getCollection()){
            sum = sum + i.getStudentsCount();
        }
        if (collectionManager.getCollection().size() > 0){
            Float a = (float) sum / collectionManager.getCollection().size();
            System.out.println("Среднее значение количсетва учеников:" + a);
        }else {
            System.out.println("В коллекции пусто");
        }
    }
}
