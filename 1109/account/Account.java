package account;
import framework.Product;

public class Account extends Product {
    private String id;
    private String password;
    Account(String id, String password) {
        this.id = id;
        this.password = "000";
    }
    @Override
    public void use() {
        System.out.println(id + ": " +"アカウントを使いました。");
    }
    public String getAccount() {
        return id;
    }
    public String getPassword() {
    	return password;
    }
    public void setPassword(String setpass) {
        this.password = setpass;
    }
}
