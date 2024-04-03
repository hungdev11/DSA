import java.util.List;

public class HouseRobber {
    private List<House> houses;

    HouseRobber(List<House> houses) {
        this.houses = houses;
    }

    public int maxValueHouse(int currentHouse) {
        if (currentHouse > houses.size() - 1) {
            return 0;
        } else {
            int stealFirstHouse = houses.get(currentHouse).getValue() + maxValueHouse(currentHouse + 2);
            int skipFirstHouse = maxValueHouse(currentHouse + 1);
            return Math.max(stealFirstHouse, skipFirstHouse);
        }
    }
}
