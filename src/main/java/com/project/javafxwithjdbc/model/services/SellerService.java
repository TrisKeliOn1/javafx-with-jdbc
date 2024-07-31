package com.project.javafxwithjdbc.model.services;

import com.project.javafxwithjdbc.model.DAO.DaoFactory;
import com.project.javafxwithjdbc.model.DAO.SellerDao;
import com.project.javafxwithjdbc.model.entities.Seller;

import java.util.List;

public class SellerService {

    private SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }
    }

    public void remove(Seller obj) {
        dao.deleteById(obj.getId());
    }
}