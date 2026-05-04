package model;

public class Game {

    private int id;
    private String name;
    private float price;

    // DB-dən oxuyarkən istifadə olunur (id məlum olur)
    public Game(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Yeni oyun yaradarkən istifadə olunur (id DB tərəfindən verilir)
    public Game(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public int getId()            { return id; }
    public String getName()       { return name; }
    public float getPrice()       { return price; }

    public void setName(String name)   { this.name = name; }
    public void setPrice(float price)  { this.price = price; }

    @Override
    public String toString() {
        return "ID : " + id + " | Name : " + name + " | Price : " + price;
    }
}
