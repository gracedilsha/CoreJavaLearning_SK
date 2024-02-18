package src.Basics_Jan14.InnerClass;

public class Lab152 {

    public static void main(String[] args) {

        Car c = new Car("Lambo 137");

        Car.Engine eng = c.new Engine("400CC");

        eng.start();


    }
}
class Car{

    String make;
    public Car( String make){
        this.make=make;
    }

    public class Engine{
        String hoursePower;

        public Engine(String hoursePower){
            this.hoursePower = hoursePower;
        }

        void start()
        {
            System.out.println("Engine is Started!!!"+ make  +"-" + hoursePower);

        }

    }
}