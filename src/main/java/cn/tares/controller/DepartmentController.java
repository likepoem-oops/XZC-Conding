package cn.tares.controller;


import cn.tares.pojo.Department;
import cn.tares.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/{dno}")
    public Result getSingle(@PathVariable String dno){
        Department department = departmentService.getDepartmentByDno(dno);
        Integer code = department != null? Code.GET_OK: Code.GET_ERR;
        String msg = department != null? "查询单个成功":"查询失败";
        return new Result(code, department, msg);
    }

    @GetMapping
    public Result getAllDepartment(){
        List<Department> departmentList = departmentService.getAllDepartment();
        Integer code = departmentList != null? Code.GET_OK: Code.GET_ERR;
        String msg = departmentList != null? "查询成功":"查询失败";
        return new Result(code, departmentList, msg);
    }

    @PutMapping
    public Result updateDepartment(@RequestBody Department department){
        boolean flag = departmentService.updateDepartment(department);
        String msg = flag? "修改成功":"修改失败";
        return new Result(flag? Code.UPDATE_OK: Code.UPDATE_ERR, flag, msg);
    }

    @DeleteMapping("/{dno}")
    public Result deleteDepartment(@PathVariable String dno){
        boolean flag = departmentService.deleteDepartmentByFno(dno);
        String msg = flag? "删除成功":"删除失败";
        return new Result(flag? Code.DELETE_OK: Code.DELETE_ERR, flag, msg);
    }

    @PostMapping
    public Result addDepartment(@RequestBody Department department){
        boolean flag = departmentService.addDepartment(department);
        String msg = flag? "添加成功":"添加失败";
        return new Result(flag? Code.SAVE_OK: Code.SAVE_ERR, flag, msg);
    }
}
