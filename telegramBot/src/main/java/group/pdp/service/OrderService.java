package group.pdp.service;

import group.pdp.model.Order;
import group.pdp.utils.DataUtil;

import java.util.*;
import java.util.stream.Collectors;

public class OrderService implements BaseService<Order> {
    private static final String ORDER_FILE_NAME = "C:\\Users\\user\\Desktop\\TelegramBot\\telegramBot\\src\\main\\resources\\orders.json";
   @Override
    public Order add(Order order) {
       List<Order> orders = read();
       orders.add(order);
       write(orders);
       return order;
    }

    @Override
    public boolean has(Order order, List<Order> orders) {
        return false;
    }

    @Override
    public List<Order> getAll() {
        return read();
    }

    @Override
    public Order getById(UUID id) {
        return read()
               .stream()
               .filter(o -> o.getId().equals(id))
               .findFirst()
               .orElseThrow(RuntimeException::new);
    }

    @Override
    public Order delete(Order order) {
       List<Order> orders = read();

       orders.stream()
               .filter(o -> o.getId().equals(order.getId()))
               .findFirst()
               .ifPresent(orders::remove);
       return order;
    }

    @Override
    public List<Order> read() {
        return DataUtil.read(ORDER_FILE_NAME);
    }

    @Override
    public void write(List<Order> orders) {
        DataUtil.write(orders, ORDER_FILE_NAME);
    }

    @Override
    public Order update(Order order) {
        List<Order> orders = read();
        Optional<Order> existingOrder = orders.stream()
                                                 .filter(o -> o.getId().equals(order.getId()))
                                                 .findFirst();
        existingOrder.ifPresent(o -> o.setOrderedDate(order.getOrderedDate()));
        existingOrder.ifPresent(o -> o.setDeliveredDate(order.getDeliveredDate()));
        existingOrder.ifPresent(o -> o.setPrice(order.getPrice()));
        existingOrder.ifPresent(o -> o.setQuantity(order.getQuantity()));
        return existingOrder.orElseThrow(RuntimeException::new);
    }
}
