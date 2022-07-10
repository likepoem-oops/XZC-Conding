package cn.tares.controller;


import cn.tares.pojo.LinkStudent;
import cn.tares.service.LinkStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/linkStudents")
public class LinkStudentController {

    @Autowired
    private LinkStudentService linkStudentService;

    @GetMapping("/getAll")
    public Result getAllData(){
        List<LinkStudent> linkStudents = linkStudentService.getAll();
        Integer code = linkStudents != null? Code.GET_OK: Code.GET_ERR;
        String msg = linkStudents != null? "查询所有成功":"查询所有失败";
        return new Result(code, linkStudents, msg);
    }

    @GetMapping("/byTopicId/{topicId}")
    public Result getStudentByTopicId(@PathVariable String topicId){
        List<LinkStudent> studentList = linkStudentService.getStudentByTopicId(topicId);
        Integer code = studentList != null? Code.GET_OK: Code.GET_ERR;
        String msg = studentList != null? "按条件查询成功":"按条件查询失败";
        return new Result(code, studentList, msg);
    }

    @PutMapping("/update")
    public Result updateLinkStudent(@RequestBody LinkStudent linkStudent){
        boolean flag = linkStudentService.updateLinkStudent(linkStudent);
        Integer code = flag? Code.UPDATE_OK: Code.UPDATE_ERR;
        String msg = flag? "修改成功":"修改失败";
        return new Result(code, flag, msg);
    }

    @DeleteMapping("/delete/{sno}")
    public Result deleteLinkStudent(@PathVariable String sno){
        boolean flag = linkStudentService.deleteLinkStudent(sno);
        Integer code = flag? Code.DELETE_OK: Code.DELETE_ERR;
        String msg = flag? "删除成功":"删除失败";
        return new Result(code, flag, msg);
    }

    @PostMapping("/save")
    public Result addNew(@RequestBody LinkStudent linkStudent){
        boolean flag = linkStudentService.addToLinkStudent(linkStudent);
        Integer code = flag? Code.SAVE_OK: Code.SAVE_ERR;
        String msg = flag? "添加成功":"添加失败";
        return new Result(code, flag, msg);
    }
}
