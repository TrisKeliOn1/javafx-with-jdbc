package com.project.javafxwithjdbc.model.DAO;

import com.project.javafxwithjdbc.db.DB;
import com.project.javafxwithjdbc.model.DAO.impl.DepartmentDaoJDBC;
import com.project.javafxwithjdbc.model.DAO.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}