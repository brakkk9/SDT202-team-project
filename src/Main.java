/*
    a) Bohdan Rak, Ankudinov Artem
    b) SDT 202 Principles of Programming
    c) 20 Oct by 1:00pm
    d) 1 hour
    e) The most basic implementation of the Activity Selection problem.
    f) -
    g) -
    h) AI was not used to generate any code.
*/

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Activity> activities = List.of(
                new Activity("C", 3, 6),
                new Activity("A", 1, 3),
                new Activity("D", 6, 8),
                new Activity("B", 2, 5)
        );

        System.out.println("Activities: " + activities);
        System.out.println("Selected:   " + ActivitySelector.select(activities));
    }
}
