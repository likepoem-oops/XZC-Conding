package cn.tares.service.impl;

import cn.tares.dao.DepartmentDao;
import cn.tares.pojo.Department;
import cn.tares.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public Department getDepartmentByDno(String dno) {
        return departmentDao.getDepartmentByDno(dno);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentDao.getAllDepartmentDno();
    }

    @Override
    public boolean updateDepartment(Department department) {
        return departmentDao.updateDepartment(department) > 0;
    }

    @Override
    public boolean deleteDepartmentByFno(String dno) {
        return departmentDao.deleteDepartmentByFno(dno) > 0;
    }

    @Override
    public boolean addDepartment(Department department) {
        return departmentDao.addDepartment(department) > 0;
    }
}
