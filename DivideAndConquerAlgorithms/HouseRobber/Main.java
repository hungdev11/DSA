import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House h1 = new House(6);
        House h2 = new House(7);
        House h3 = new House(1);
        House h4 = new House(30);
        House h5 = new House(8);
        House h6 = new House(2);
        House h7 = new House(4);
        List<House> houses = new ArrayList<>();
        houses.add(h1);
        houses.add(h2);
        houses.add(h3);
        houses.add(h4);
        houses.add(h5);
        houses.add(h6);
        houses.add(h7);
        HouseRobber hr = new HouseRobber(houses);
        System.out.println(hr.maxValueHouse(0));
    }
}