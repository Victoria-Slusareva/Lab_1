package Task_2;
import java.util.*;

public class Address
{
    public String country;
    public String region;
    public String city;
    public String street;
    public String house;
    public String building;
    public String apartment;

    public Address(){};

    public void setAddress(String country, String region, String city, String street, String house, String building, String apartment)
    {
        this.country=country;
        this.region=region;
        this.city=city;
        this.street=street;
        this.house=house;
        this.building=building;
        this.apartment=apartment;
    }

    public void StringSplit(String address)
    {
        String[] str = address.split(",");
        setAddress(str[0], str[1], str[2], str[3], str[4], str[5], str[6]);
    }

    public void StringTokenizer(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ",.;-");
        String[] str = new String[7];
        for (int i = 0; i < 7; i++)
        {
            String temp = tokenizer.nextToken();
            str[i] = temp;
        }
        setAddress(str[0], str[1], str[2], str[3], str[4], str[5], str[6]);
    }

    @Override
    public String toString()
    {
        return ("\nСтрана: "+country+"\nРегион: "+region+"\nГород: "+city
                +"\nУлица: "+street+"\nДом: "+house+"\nКорпус: "+building
                +"\nКвартира: "+apartment);
    }

}
