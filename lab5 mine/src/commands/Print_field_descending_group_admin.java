package commands;

import models.StudyGroup;
import utility.CollectionManager;
import utility.Console;

import java.util.Collections;

public class Print_field_descending_group_admin extends Command{
    public Print_field_descending_group_admin(String name, String description) {
        super("print_field_descending_group_admin", "Выводит значение поля GroupAdmin в порядке убывания");
    }
    public static void execution(Console console, CollectionManager collectionManager){
        Collections.sort(collectionManager.getCollection(), Collections.reverseOrder());
        System.out.println("Коллекция по убыванию:");
        for (StudyGroup i: collectionManager.getCollection()){
            System.out.println(i.getGroupAdmin());
        }
    }
}
