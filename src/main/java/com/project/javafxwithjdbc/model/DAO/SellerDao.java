package com.project.javafxwithjdbc.model.DAO;

import com.project.javafxwithjdbc.model.entities.Department;
import com.project.javafxwithjdbc.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
