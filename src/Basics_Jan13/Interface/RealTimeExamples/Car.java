package src.Basics_Jan13.Interface.RealTimeExamples;

public class Car implements Engine, Break{

    public void start() {
        System.out.println("Started the car");
        startEngine();
        breaks();
    }

    @Override
    public void startEngine() {
        System.out.println("Started the Engine");
    }

    @Override
    public void breaks() {
        System.out.println("Break is working fine");
    }
}
