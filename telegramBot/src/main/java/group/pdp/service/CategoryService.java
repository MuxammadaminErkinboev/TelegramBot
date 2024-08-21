package group.pdp.service;

import group.pdp.model.Category;

import java.util.List;
import java.util.UUID;

public class CategoryService implements BaseService<Category> {
    @Override
    public Category add(Category category) {
        return null;
    }

    @Override
    public boolean has(Category category, List<Category> categories) {
        return false;
    }

    @Override
    public List<Category> getAll() {
        return List.of();
    }

    @Override
    public Category getById(UUID id) {
        return null;
    }

    @Override
    public Category delete(Category category) {
        return null;
    }

    @Override
    public List<Category> read() {
        return List.of();
    }

    @Override
    public void write(List<Category> categories) {

    }

    @Override
    public Category update(Category category) {
        return null;
    }
}
