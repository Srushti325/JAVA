package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getPass() {
        return this.password;
    }

    public void setPass(String pass) {
        this.password = pass;
    }
}
public class Bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "shrushti@gmail.com";
        account1.setPass("abcd");
        System.out.println(account1.getPass());
    }
}