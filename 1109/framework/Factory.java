package framework;

public abstract class Factory {
    public final Product create(String id) {
        Product p = createProduct(id);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String id);
    protected abstract void registerProduct(Product product);
}
