package commands;

import utility.CollectionManager;
import utility.Console;
import utility.StandartConsole;

import java.time.LocalDateTime;

public class Info extends Command{

    private StandartConsole console;
    private CollectionManager collectionManager;
    public Info(String name, String description) {
        super("info", "выводит информацию о коллекции");
    }
    public static void execution(Console console, CollectionManager collectionManager){
        LocalDateTime lastInitTime = collectionManager.getLastInitTime();
        LocalDateTime lastSaveTime = collectionManager.getLastSaveTime();
        Integer size = collectionManager.getCollection().size();
        String type = collectionManager.getCollection().getClass().toString();
        System.out.println("Информация о коллекции" + "\n" +
                "Тип коллекции: " + type + "\n" +
                "Размер коллекции:" + size + "\n" +
                "Последнее время инициализации: " + lastInitTime + "\n" +
                "Последнее время сохранения: " + lastSaveTime);
    }
}
