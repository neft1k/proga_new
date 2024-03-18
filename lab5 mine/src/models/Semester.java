package models;

public enum Semester {
    THIRD,
    FOURTH,
    FIFTH,
    SIXTH;
    public static String names() {
        StringBuilder nameList = new StringBuilder();
        for (var semester : values()) {
            nameList.append(semester.name()).append(", ");
        }
        return nameList.substring(0, nameList.length()-2);
    }
}