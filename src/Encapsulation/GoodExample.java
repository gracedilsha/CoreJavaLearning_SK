package src.Encapsulation;

public class GoodExample {
    public static void main(String[] args) {
        vwoLoginFixed vwofix = new vwoLoginFixed("admin","admin");
        boolean check = vwofix.isLoggedIn("admin", "admin");
                System.out.println(check);
        System.out.println(vwofix.getUsername());


    }
}
class vwoLoginFixed{
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    private String username;
    private String password;

    vwoLoginFixed(String u, String p)
    {
        this.username = u;
        this.password = p;
    }

    boolean isLoggedIn(String un, String pwd)
    {
        if(this.username.toLowerCase().equals(un)&&this.password.toLowerCase().equals(pwd))
        {
            System.out.println("Logged In!!");
            return true;
                    }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
}
