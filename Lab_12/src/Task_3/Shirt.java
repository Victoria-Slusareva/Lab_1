package Task_3;

public class Shirt {
    public String code;
    public String name;
    public String color;
    public String size;

    public Shirt(String shirt)
    {
        String[] str = shirt.split(",");
        this.code = str[0];
        this.name = str[1];
        this.color = str[2];
        this.size = str[3];
    }

    @Override
    public String toString() {
        return "Код: " + code + "\tНаименование: " + name +
                "\tЦвет: " + color + "\tРазмер: " + size;
    }
}
