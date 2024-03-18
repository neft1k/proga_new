package models;

public enum HairColor {
    BLACK,
    YELLOW,
    ORANGE,
    WHITE;
    public static String names() {
        StringBuilder nameList = new StringBuilder();
        for (var colors : values()) {
            nameList.append(colors.name()).append(", ");
        }
        return nameList.substring(0, nameList.length()-2);
    }
}