package src.Encapsulation;

public class BadExample {
    public static void main(String[] args) {
        /*vwoLogin vwo = new vwoLogin("admin", "admin1");
        //vwo.isLoggedIn("admin1","admin");
        //vwo.password = "admin1";

        boolean check = vwo.isLoggedIn("Shalini1","admin1");
        vwo.setUsername("Shalini");
        String un = vwo.getUsername();
        System.out.println(un);
        String pwd = vwo.getPassword();
        System.out.println(pwd);
        boolean check2= vwo.isLoggedIn("Shalini","admin1");
        System.out.println(check);
        */

        vwoLogin vwoLogin = new vwoLogin("admin","admin");
        // admin and admin


        boolean check = vwoLogin.isLoggedIn("admin","password");
        vwoLogin.setUsername("admin");
        System.out.println(vwoLogin.getPassword());
        boolean check2 = vwoLogin.isLoggedIn("admin","password");
        System.out.println(check2);

    }
}

class vwoLogin{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    private String password;

    vwoLogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    boolean isLoggedIn(String username, String password)
    {
        if (this.username.toLowerCase().equals(username)&&this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged In");
            return true;
        }
        else
        {
            System.out.println("Wrong");
            return false;
        }
    }

}
