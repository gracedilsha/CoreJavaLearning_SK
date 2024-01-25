package src.Encapsulation;

public class PersonS {
    int id;
    String name;
    double bal;

    //No Return
    void sleep(){

    }
    //Return Something
    int sum( int a, int b){
        return a+b;
    }

    void bankBalance()
    {
        System.out.println("thi is your balance:" + bal);
    }

}
