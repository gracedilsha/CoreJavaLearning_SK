package src.Basics_Jan13.Abstraction.RealTimeExamples;

public class TC1_CHROME extends Baseclass{

    @Override
    String openBrowser() {
        System.out.println("Launching the Browser");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing the Browser");
        return null;
    }


}
