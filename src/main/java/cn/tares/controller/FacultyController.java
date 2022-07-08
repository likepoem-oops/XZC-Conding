package cn.tares.controller;


import cn.tares.pojo.Faculty;
import cn.tares.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @GetMapping("/{fno}")
    public Result getSingle(@PathVariable String fno){
        Faculty faculty = facultyService.getFacultyByFno(fno);
        Integer code = faculty != null? Code.GET_OK: Code.GET_ERR;
        String msg = faculty != null? "查询成功": "查询失败";
        return new Result(code, faculty, msg);
    }

    @GetMapping
    public Result getAllFaculty(){
        List<Faculty> facultyList = facultyService.getAllFacultyFno();
        Integer code = facultyList != null? Code.GET_OK: Code.GET_ERR;
        String msg = facultyList != null? "查询成功": "查询失败";
        return new Result(code, facultyList, msg);
    }

    @PutMapping
    public Result updateFaculty(@RequestBody Faculty faculty){
        boolean flag = facultyService.updateFaculty(faculty);
        return new Result(flag? Code.UPDATE_OK: Code.UPDATE_ERR
                , flag,
                flag? "修改成功":"修改失败");
    }

    @DeleteMapping("/{fno}")
    public Result deleteFaculty(@PathVariable String fno){
        boolean flag = facultyService.deleteFacultyByFno(fno);
        return new Result(flag? Code.DELETE_OK: Code.DELETE_ERR, flag,
                flag? "删除成功": "删除失败");
    }

    @PostMapping
    public Result addFaculty(@RequestBody Faculty faculty){
        boolean flag = facultyService.addFaculty(faculty);
        return new Result(flag? Code.SAVE_OK: Code.SAVE_ERR, flag,
                flag? "添加成功": "添加失败");
    }
}
