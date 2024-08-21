package group.pdp.service;

import group.pdp.model.Order;

import java.util.List;
import java.util.UUID;

public class OrderService implements BaseService<Order>{
    @Override
    public Order add(Order order) {
        return null;
    }

    @Override
    public boolean has(Order order, List<Order> orders) {
        return false;
    }

    @Override
    public List<Order> getAll() {
        return List.of();
    }

    @Override
    public Order getById(UUID id) {
        return null;
    }

    @Override
    public Order delete(Order order) {
        return null;
    }

    @Override
    public List<Order> read() {
        return List.of();
    }

    @Override
    public void write(List<Order> orders) {

    }

    @Override
    public Order update(Order order) {
        return null;
    }
}
