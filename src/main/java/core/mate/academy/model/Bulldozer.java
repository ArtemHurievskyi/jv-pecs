package core.mate.academy.model;

import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    public Bulldozer() {
        super("Bulldozer", "red");
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer());
    }
}
