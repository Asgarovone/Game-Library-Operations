package model;

public class Game {
    private static int idCounter;
    private String name;
    private float price;

    private final int id = idCounter;

    public Game(String name, float price) {
        this.name = name;
        this.price = price;
        idCounter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID : " + id + " | Name : " + name + " | Price : " + price;
    }
}
