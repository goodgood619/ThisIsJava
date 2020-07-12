package thisIsJava.Collection_15_5;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(90);

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (int score : descendingSet) {
            System.out.print(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet(); // 오름차순으로 하려면 descendingSet을 두번하면 된다

        for (int score : ascendingSet) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}
