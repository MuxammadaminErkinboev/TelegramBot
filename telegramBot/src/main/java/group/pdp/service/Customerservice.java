package group.pdp.service;

import group.pdp.model.Customer;

import java.util.List;
import java.util.UUID;

public class Customerservice implements BaseService<Customer> {
    @Override
    public Customer add(Customer customer) {
        return null;
    }

    @Override
    public boolean has(Customer customer, List<Customer> customers) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public Customer getById(UUID id) {
        return null;
    }

    @Override
    public Customer delete(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> read() {
        return List.of();
    }

    @Override
    public void write(List<Customer> customers) {

    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }
}
