package Shop;

import java.util.Comparator;

public class ProductComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return Integer.compare(((Product) o).getCost(), ((Product) t1).getCost());
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
