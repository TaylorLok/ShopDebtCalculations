package shop.com;

public class Shop {

    private String name;
    private int id;

    public Shop(String n, int i)
    {
        name = n;
        id = i;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
