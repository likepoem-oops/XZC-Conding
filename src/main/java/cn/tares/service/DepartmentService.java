package cn.tares.service;


import cn.tares.pojo.Department;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface DepartmentService {

    // 按ID查询
    public Department getDepartmentByDno(String dno);

    // 查询所有
    public List<Department> getAllDepartment();

    // 修改
    public boolean updateDepartment(Department department);

    // 删除
    public boolean deleteDepartmentByFno(String dno);

    // 添加
    public boolean addDepartment(Department department);
}
