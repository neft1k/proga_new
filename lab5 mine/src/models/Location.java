package models;

import utility.Validatable;

public class Location implements Validatable {
    private int x;
    private int y;
    private String name; //Поле может быть null
    public Location(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Location: " + name + "(" + x + ";" + y + ")";
    }

    @Override
    public Boolean validate() {
        if (name == null) return false;
        return true;
    }
}