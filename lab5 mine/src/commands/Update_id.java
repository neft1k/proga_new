package commands;

import utility.Answer;
import utility.CollectionManager;
import utility.Console;

import java.util.Collections;

public class Update_id extends Command{
    public Update_id(String name, String description) {
        super("update id", "обновить значение элемента коллекции , id которого равен данному");
    }
    public static void execution(Console console, CollectionManager collectionManager, Integer id) throws Answer.AnswerBreak {

        collectionManager.getCollection().set(collectionManager.getCollection().indexOf(collectionManager.byId(id)), Answer.ansStudyGroup(console, id));
        System.out.println("Обновился значение элемента коллекции id которого равен данному");
    }
}
