import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public static void activitySelection(List<Activity> activityList) {
        Comparator finishTimeComp = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getFinishTime() - o2.getFinishTime();
            }
        };
        Collections.sort(activityList, finishTimeComp);
        Activity prevActivity = activityList.get(0);
        System.out.println(prevActivity);
        for (int i = 1; i < activityList.size(); i++) {
            if (activityList.get(i).getStartTime() >= prevActivity.getFinishTime()) {
                System.out.println(activityList.get(i));
                prevActivity = activityList.get(i);
            }
        }
    }
}
