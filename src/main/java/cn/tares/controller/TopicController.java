package cn.tares.controller;

import cn.tares.pojo.Topic;
import cn.tares.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.security.interfaces.RSAKey;
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
    public Result delete(@PathVariable String id) {
        boolean flag = topicService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable String id) {
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

    // 审查表

    @GetMapping("/reviews/{topicId}")
    public Result getSingleFromReview(@PathVariable String topicId){
        Topic topic = topicService.getSingleFromReview(topicId);
        Integer code = topic != null? Code.GET_OK: Code.GET_ERR;
        String msg = topic != null? "查询单个成功": "查询失败";
        return new Result(code, topic, msg);
    }

    @GetMapping("/reviews")
    public Result getAllFromReview(){
        List<Topic> reviewList = topicService.getAllFromReview();
        Integer code = reviewList != null? Code.GET_OK: Code.GET_ERR;
        String msg = reviewList != null? "查询集合成功": "查询失败";
        return new Result(code, reviewList, msg);
    }

    @DeleteMapping("/reviews/{topicId}")
    public Result deleteReview(@PathVariable String topicId){
        boolean flag = topicService.deleteReview(topicId);
        String msg = flag? "删除成功": "删除失败";
        return new Result(flag? Code.DELETE_OK: Code.DELETE_ERR, flag, msg);
    }

    @PutMapping("/reviews")
    public Result updateReview(@RequestBody Topic topic){
        boolean flag = topicService.updateReview(topic);
        String msg = flag? "修改成功": "修改失败";
        return new Result(flag? Code.UPDATE_OK: Code.UPDATE_ERR, flag, msg);
    }

    @PostMapping("/reviews")
    public Result saveToReview(@RequestBody Topic topic){
        boolean flag = topicService.saveToReview(topic);
        String msg = flag? "保存成功": "保存失败";
        return new Result(flag? Code.SAVE_OK: Code.SAVE_ERR, flag, msg);
    }

    @GetMapping("/getNotFull/{major}")
    public Result getNotFullTopic(@PathVariable String major){
        List<Topic> notFullTopic = topicService.getNotFullTopic(major);
        Integer code = notFullTopic != null? Code.GET_OK: Code.GET_ERR;
        String msg = notFullTopic != null? "查询未满成功": "查询未满失败";
        return new Result(code, notFullTopic, msg);
    }

    @PutMapping("/changeCurrentNum")
    public Result updateCurrentNum(@RequestBody Topic topic){
        boolean flag = topicService.updateCurrentNum(topic);
        Integer code = flag? Code.UPDATE_OK: Code.UPDATE_ERR;
        String msg = flag? "修改剩余容量成功": "修改剩余容量失败";
        return new Result(code, flag, msg);
    }
}
