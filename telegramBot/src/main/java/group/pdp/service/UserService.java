package group.pdp.service;

import group.pdp.model.User;

import java.util.List;
import java.util.UUID;

public class UserService implements BaseService<User>{
    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public boolean has(User user, List<User> users) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public User getById(UUID id) {
        return null;
    }

    @Override
    public User delete(User user) {
        return null;
    }

    @Override
    public List<User> read() {
        return List.of();
    }

    @Override
    public void write(List<User> users) {

    }

    @Override
    public User update(User user) {
        return null;
    }
}
