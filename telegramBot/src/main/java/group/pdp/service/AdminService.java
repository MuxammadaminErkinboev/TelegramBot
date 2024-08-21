package group.pdp.service;

import group.pdp.model.Admin;

import java.util.List;
import java.util.UUID;

public class AdminService implements BaseService<Admin>{

    @Override
    public Admin add(Admin admin) {
        return null;
    }

    @Override
    public boolean has(Admin admin, List<Admin> admins) {
        return false;
    }

    @Override
    public List<Admin> getAll() {
        return List.of();
    }

    @Override
    public Admin getById(UUID id) {
        return null;
    }

    @Override
    public Admin delete(Admin admin) {
        return null;
    }

    @Override
    public List<Admin> read() {
        return List.of();
    }

    @Override
    public void write(List<Admin> admins) {

    }

    @Override
    public Admin update(Admin admin) {
        return null;
    }
}
