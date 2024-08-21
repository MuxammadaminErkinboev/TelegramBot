package group.pdp.service;

import group.pdp.model.User;
import group.pdp.utils.DataUtil;

import java.util.List;
import java.util.UUID;

public class UserService implements BaseService<User> {
    private static final String USER_DATA_FILE = "C:\\Users\\user\\Desktop\\TelegramBot\\telegramBot\\src\\main\\resources\\users. json";
    @Override
    public User add(User user) {
        List<User> users = read();
        return user;
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
        return DataUtil.read(USER_DATA_FILE);
    }

    @Override
    public void write(List<User> users) {

    }

    @Override
    public User update(User user) {
        return null;
    }
}
