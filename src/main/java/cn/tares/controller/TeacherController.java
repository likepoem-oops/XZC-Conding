package cn.tares.controller;


import cn.tares.pojo.Teacher;
import cn.tares.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/{tno}")
    public Result getSingleTeacher(@PathVariable String tno){
        Teacher teacher = teacherService.getTeacherByTno(tno);
        Integer code = teacher != null? Code.GET_OK: Code.GET_ERR;
        String msg = teacher != null? "成功":"失败";
        return new Result(code, teacher, msg);
    }

    @GetMapping
    public Result getAllTeacher(){
        List<Teacher> teacherList = teacherService.getAllTeacher();
        Integer code = teacherList != null? Code.GET_OK: Code.GET_ERR;
        String msg = teacherList != null? "成功":"失败";
        return new Result(code, teacherList, msg);
    }

    @PutMapping
    public Result updateTeacherInfo(@RequestBody Teacher teacher){
        boolean flag = teacherService.updateTeacher(teacher);
        return new Result(flag? Code.UPDATE_OK: Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{tno}")
    public Result deleteTeacherInfo(@PathVariable String tno){
        boolean flag = teacherService.deleteTeacher(tno);
        return new Result(flag? Code.DELETE_OK: Code.DELETE_ERR, flag);
    }

    @PostMapping
    public Result addTeacher(@RequestBody Teacher teacher){
        boolean flag = teacherService.addTeacher(teacher);
        return new Result(flag? Code.SAVE_OK: Code.SAVE_ERR, flag);
    }

    @PutMapping("/reSetPassword")
    public Result resetPassword(){
        boolean flag = teacherService.updateTeacherPassword();
        String msg = flag? "修改所有成功!":"修改失败";
        return new Result(flag? Code.UPDATE_OK: Code.UPDATE_ERR, flag, msg);
    }
}
