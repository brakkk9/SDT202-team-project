import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelector {
    public static List<Activity> select(List<Activity> activities) {
        List<Activity> sorted = new ArrayList<>(activities);
        sorted.sort(Comparator.comparingInt(Activity::finish));

        List<Activity> selected = new ArrayList<>();
        int lastFinish = Integer.MIN_VALUE;

        for (Activity a : sorted) {
            if (a.start() >= lastFinish) {
                selected.add(a);
                lastFinish = a.finish();
            }
        }
        return selected;
    }
}
