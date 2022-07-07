package cn.tares.controller;


import cn.tares.pojo.Student;
import cn.tares.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Result saveNewStudent(@RequestBody Student student){
        boolean flag = studentService.saveNewStudent(student);
        return new Result(flag? Code.SAVE_OK: Code.SAVE_ERR, flag);
    }

    @GetMapping("/{sno}")
    public Result getStudentBySno(@PathVariable Integer sno){
        Student student = studentService.getStudentBySno(sno);
        Integer code = student != null ? Code.GET_OK : Code.GET_ERR;
        String msg = student != null ? "" : "数据查询失败，请重试！";
        return new Result(code,student,msg);
    }

    @GetMapping
    public Result getAllStudent(){
        List<Student> studentList = studentService.getAllStudent();
        Integer code = studentList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = studentList != null ? "" : "数据查询失败，请重试！";
        return new Result(code, studentList, msg);
    }

    @PutMapping
    public Result updateStudent(@RequestBody Student student){
        System.out.println(student);
        boolean flag = studentService.updateStudent(student);
        return new Result(flag? Code.UPDATE_OK: Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{sno}")
    public Result deleteStudent(@PathVariable Integer sno){
        boolean flag = studentService.deleteStudent(sno);
        return new Result(flag? Code.DELETE_OK: Code.DELETE_ERR, flag);
    }

}
