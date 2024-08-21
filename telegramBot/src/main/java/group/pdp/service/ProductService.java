package group.pdp.service;

import group.pdp.model.Product;

import java.util.List;
import java.util.UUID;

public class ProductService implements BaseService<Product> {
    @Override
    public Product add(Product product) {
        return null;
    }

    @Override
    public boolean has(Product product, List<Product> products) {
        return false;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product getById(UUID id) {
        return null;
    }

    @Override
    public Product delete(Product product) {
        return null;
    }

    @Override
    public List<Product> read() {
        return List.of();
    }

    @Override
    public void write(List<Product> products) {

    }

    @Override
    public Product update(Product product) {
        return null;
    }
}
