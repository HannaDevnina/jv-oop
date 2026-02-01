package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public  void doWork() {
        System.out.println("Bulldozeris working");
    }

    @Override
    public  void stopWork() {
        System.out.println("Truck stopped working");
    }
}
