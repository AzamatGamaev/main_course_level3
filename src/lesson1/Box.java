package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box <C extends Fruit>{

    private final List<C> fruitBox;

    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    public float getWeight() {
        double sum = 0.0;
        for (C c : fruitBox) {
            double weight = c.getWeight();
            sum += weight;
        }
        return (float) sum;
    }

    public void put(C fruit) {
        fruitBox.add(fruit);
    }

    public boolean compare(Box<?> box) {
        return Float.compare(this.getWeight(), box.getWeight()) == 0;
    }

    public void transfer(Box<C> box) {
        for (C c : fruitBox) {
            box.put(c);
        }
        fruitBox.clear();
    }
}


