package commands;

import utility.CollectionManager;
import utility.Console;

import java.util.Collections;

public class Shuffle extends Command {

    public Shuffle(String name, String description) {
        super("shuffle", "перемешать элементы коллекции в случайном порядке");
    }
    public static void execution(Console console, CollectionManager collectionManager){
        Collections.shuffle(collectionManager.getCollection());
        System.out.println("элементы коллекции перемешаны в случайном порядке");
    }
}
