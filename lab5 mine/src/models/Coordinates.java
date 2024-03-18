package models;

public class Coordinates {
    private int x;
    private long y;
    public Coordinates(int x, long y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return x + ";" + y;
    }
}