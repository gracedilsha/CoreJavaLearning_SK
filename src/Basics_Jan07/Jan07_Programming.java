package src.Basics_Jan07;

public class Jan07_Programming {
    int version;
    String author;

    Jan07_Programming(){
        System.out.println("Default Constructor");

    }

    Jan07_Programming(String author_1, int version_1){
        this.author = author_1;
        this.version = version_1;

    }

    void printDetails()
    {
        System.out.println(this.author);
        System.out.println(this.version);
    }
}
