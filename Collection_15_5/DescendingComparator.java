package thisIsJava.Collection_15_5;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit fruit, Fruit t1) {
        if(fruit.price<t1.price) return 1;
        else if(fruit.price == t1.price) return 0;
        else return -1;
    }
}
