
package commands;
import utility.Answer;
import utility.CollectionManager;
import utility.Console;

import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {
    private Map<String, Runnable> commandMap;
    private Integer commandId;
    private String[] command;
    public CommandProcessor(Console console, CollectionManager collectionManager) {
        commandMap = new HashMap<>();
        commandMap.put("add", () -> {try {new Add(console, collectionManager);} catch (Answer.AnswerBreak ignored) {}});
        commandMap.put("info", () -> {Info.execution(console, collectionManager);});
        commandMap.put("show", () -> {Show.execution(console, collectionManager);});
        commandMap.put("clear", () -> {Clear.execution(console, collectionManager);});
        commandMap.put("shuffle", () -> {Shuffle.execution(console, collectionManager);});
        commandMap.put("remove_first", () -> {Remove_First.execution(console, collectionManager);});
        commandMap.put("print_descending", () -> {Print_descending.execution(console, collectionManager);});
        commandMap.put("remove_lower", () -> {try {Remove_lower.execution(console, collectionManager);} catch (Answer.AnswerBreak ignored) {}});
        commandMap.put("remove_by_id", () -> {Remove_by_id.execution(console, collectionManager, commandId);});
        commandMap.put("average_of_students_count", () -> {Average_of_students_count.execution(console, collectionManager);});
        commandMap.put("update", () -> {try {Update_id.execution(console, collectionManager, commandId);} catch (Answer.AnswerBreak ignored) {}});
        commandMap.put("save", () -> {Save.execution(console, collectionManager);});
        commandMap.put("print_field_descending_group_admin", () -> {Print_field_descending_group_admin.execution(console, collectionManager);});
        commandMap.put("help", () -> {Help.execution(console, collectionManager);});
    }

    public Boolean processCommand(String[] command) {
        command[1] = command[1].trim();
        command[2] = command[2].trim();
        if (!command[0].equals("execute_skript")) {
            try {
                this.commandId = Integer.parseInt(command[1]);
                Runnable action = commandMap.get(command[0]);
                if (action != null) {
                    action.run();
                } else {
                    System.out.println("Неизвестная команда");
                }
            } catch (Exception e) {
                System.out.println("Вводите нормальное id (число)");
            }
        }
        return null;
    }
}