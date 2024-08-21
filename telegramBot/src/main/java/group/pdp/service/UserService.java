package group.pdp.service;

import group.pdp.model.User;
import group.pdp.utils.DataUtil;
import java.util.*;

public class UserService implements BaseService<User> {
    private static final String USER_DATA_FILE = "C:\\Users\\user\\Desktop\\TelegramBot\\telegramBot\\src\\main\\resources\\users.json";
    @Override
    public User add(User user) {
        List<User> users = read();

        if (has(user, users)) {
            throw new RuntimeException("The username already exists!");
        }

        users.add(user);
        write(users);
        return user;
    }

    @Override
    public boolean has(User user, List<User> users) {
        return users.stream()
                .anyMatch(u -> u.getContact().equals(user.getContact()));
    }

    @Override
    public List<User> getAll() {
        return read();
    }

    @Override
    public User getById(UUID id) {
        List<User> users = read();

        return users.stream()
                .filter(u -> Objects.equals(u.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
    }

    @Override
    public User delete(User user) {
        List<User> users = read();
        Optional<User> userToDelete = users.stream()
                      .filter(u -> u.getId().equals(user.getId()))
                      .findFirst();
        userToDelete.ifPresent(users::remove);

        return userToDelete.orElseThrow(RuntimeException::new);
    }

    @Override
    public List<User> read() {
        return DataUtil.read(USER_DATA_FILE);
    }

    @Override
    public void write(List<User> users) {
        DataUtil.write(users, USER_DATA_FILE);
    }

    @Override
    public User update(User user) {
        List<User> users = read();

        Optional<User> userToUpdate = users.stream()
                                      .filter(u -> u.getId().equals(user.getId()))
                                      .findFirst();

        userToUpdate.ifPresent(u -> u.setUsername(user.getUsername()));
        userToUpdate.ifPresent(u -> u.setName(user.getName()));
        userToUpdate.ifPresent(u -> u.setContact(user.getContact()));

        return userToUpdate.orElseThrow(RuntimeException::new);
    }
}
