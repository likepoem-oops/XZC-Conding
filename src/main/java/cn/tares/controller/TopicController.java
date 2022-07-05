package cn.tares.controller;

import cn.tares.pojo.Topic;
import cn.tares.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @PostMapping
    public Result save(@RequestBody Topic topic) {
        boolean flag = topicService.save(topic);
        return new Result(flag ? Code.SAVE_OK: Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Topic topic) {
        boolean flag = topicService.update(topic);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = topicService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Topic topic = topicService.getById(id);
        Integer code = topic != null ? Code.GET_OK : Code.GET_ERR;
        String msg = topic != null ? "" : "数据查询失败，请重试！";
        return new Result(code,topic,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Topic> topicList = topicService.getAll();
        Integer code = topicList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = topicList != null ? "" : "数据查询失败，请重试！";
        return new Result(code,topicList,msg);
    }
}
