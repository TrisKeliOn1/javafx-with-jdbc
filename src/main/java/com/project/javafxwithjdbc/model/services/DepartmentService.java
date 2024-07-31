package com.project.javafxwithjdbc.model.services;

import com.project.javafxwithjdbc.model.DAO.DaoFactory;
import com.project.javafxwithjdbc.model.DAO.DepartmentDao;
import com.project.javafxwithjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }
    }
}