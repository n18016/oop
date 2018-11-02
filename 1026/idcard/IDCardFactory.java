package idcard;
import framework.Factory;
import framework.Product;
import java.util.Map;
import java.util.HashMap;

public class IDCardFactory extends Factory{
    private Map<Integer, String> owners = new HashMap<>();
    private int cardNo = 1;
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(cardNo++, owner);
    }
    @Override
    protected void registerProduct(Product product) {
        owners.put(((IDCard)product).getNo(), ((IDCard)product).getOwner());
    }
    public Map<Integer, String> getOwners() {
        return owners;
    }
}
