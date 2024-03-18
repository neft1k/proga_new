package commands;

import utility.CollectionManager;
import utility.Console;

import java.time.LocalDateTime;

public class Help extends Command{

    public Help(Console console, CommandManager commandManager) {
        super("help", "вывести справку по доступным командам");
    }
    public static void execution(Console console, CollectionManager collectionManager){
        System.out.println("help: вывести справку по доступным командам \n" +
                "add {element}: добавить новый элемент в коллекцию \n" +
                "average_of_students_count: вывести значения поля groupAdmin в порядке убывания \n" +
                "clear: очистить коллекцию \n" +
                "info: выводит информацию о коллекции \n" +
                "print_descending: Сортирует элементы в порядке убывания \n" +
                "print_field_descending_group_admin: Выводит значение поля GroupAdmin в порядке убывания \n" +
                "remove_by_id: удалить элемент по id \n" +
                "remove_first: удалить первый элемент коллекции \n" +
                "remove_lower: удалить все элементы меньшие данного \n" +
                "save: сохраняет коллекцию в файл \n" +
                "show: все элементы коллекции в строковом представлении \n" +
                "shuffle: перемешать элементы коллекции в случайном порядке \n" +
                "update id: обновить значение элемента коллекции , id которого равен данному \n" +
                "execute_skript: делает полный ужас, который мешает нормально жить");
    }

}
