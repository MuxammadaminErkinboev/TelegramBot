package group.pdp.service;

import java.util.List;
import java.util.UUID;

public interface BaseService<T> {
    T add(T t);

    boolean has(T t, List<T> ts);

    List<T> getAll();

    T getById(UUID id);

    T delete(T t);

    List<T> read();

    void write(List<T> ts);

    T update(T t);
}
