package models;

public enum Country {
    UNITED_KINGDOM,
    GERMANY,
    CHINA,
    JAPAN;
    public static String names() {
        StringBuilder nameList = new StringBuilder();
        for (var colors : values()) {
            nameList.append(colors.name()).append(", ");
        }
        return nameList.substring(0, nameList.length()-2);
    }
}