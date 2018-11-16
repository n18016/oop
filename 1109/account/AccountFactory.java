package account;
import framework.Factory;
import framework.Product;
import java.util.Map;
import java.util.HashMap;

public class AccountFactory extends Factory {
    private Map<String, String> accounts = new HashMap<String, String>();
    private String password;
    @Override
    protected Product createProduct(String id) {
        return new Account(id, password);
    }
    @Override
    protected void registerProduct(Product product) {
        accounts.put(((Account)product).getAccount(), ((Account)product).getPassword());
    }
    public void getAccounts() {
        for (Map.Entry<String, String> entry : accounts.entrySet()) {
        	System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
