package cn.tares.controller;


import cn.tares.pojo.LinkTopic;
import cn.tares.service.LinkTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/linkTopics")
public class LinkTopicController {

    @Autowired
    private LinkTopicService linkTopicService;

    @GetMapping("/ListByTno/{tno}")
    public Result getLinkTopicListByTno(@PathVariable String tno){
        List<LinkTopic> linkTopicList = linkTopicService.getLinkTopicByTno(tno);
        Integer code = linkTopicList != null? Code.GET_OK: Code.GET_ERR;
        String msg = linkTopicList != null? "根据tno查询LinkTopic成功": "根据tno查询LinkTopic失败";
        return new Result(code, linkTopicList, msg);
    }

    @GetMapping("/NamesByTno/{tno}")
    public Result getTopicNameByTno(@PathVariable String tno){
        List<String> stringList = linkTopicService.getTopicNameByTno(tno);
        Integer code = stringList != null? Code.GET_OK: Code.GET_ERR;
        String msg = stringList != null? "根据tno查询NameList成功": "根据tno查询NameList失败";
        return new Result(code, stringList, msg);
    }

    @GetMapping("/IdsByTno/{tno}")
    public Result getTopicIdByTno(@PathVariable String tno){
        List<String> stringList = linkTopicService.getTopicIdByTno(tno);
        Integer code = stringList != null? Code.GET_OK: Code.GET_ERR;
        String msg = stringList != null? "根据tno查询TopicIdList成功": "根据tno查询TopicIdList失败";
        return new Result(code, stringList, msg);
    }

    // 同步表的两个操作
    @PostMapping("/sync")
    public Result syncTopicCreate(@RequestBody LinkTopic linkTopic){
        boolean flag = linkTopicService.syncTopicCreate(linkTopic);
        Integer code = flag? Code.SAVE_OK: Code.SAVE_ERR;
        String msg = flag? "同步成功": "同步失败";
        return new Result(code, flag, msg);
    }

    @DeleteMapping("/delete/{topicId}")
    public Result deleteLinkTopic(@PathVariable String topicId){
        boolean flag = linkTopicService.deleteLinkTopic(topicId);
        Integer code = flag? Code.SAVE_OK: Code.SAVE_ERR;
        String msg = flag? "删除LinkTopic成功": "删除LinkTopic失败";
        return new Result(code, flag, msg);
    }

    // 正常的增改操作

    @GetMapping("/{topicId}")
    public Result getSingleLinkTopic(@PathVariable String topicId){
        LinkTopic linkTopic = linkTopicService.getSingleLinkTopicById(topicId);
        Integer code = linkTopic != null? Code.GET_OK: Code.GET_ERR;
        String msg = linkTopic != null? "查询单个成功": "查询单个失败";
        return new Result(code, linkTopic, msg);
    }

    @PutMapping
    public Result updateLinkTopic(@RequestBody LinkTopic linkTopic){
        boolean flag = linkTopicService.updateLinkTopic(linkTopic);
        Integer code = flag? Code.UPDATE_OK: Code.UPDATE_ERR;
        String msg = flag? "修改LinkTopic成功": "修改LinkTopic失败";
        return new Result(code, flag, msg);
    }

    @GetMapping
    public Result getAll(){
        List<LinkTopic> linkTopicList = linkTopicService.getAllLinkTopic();
        Integer code = linkTopicList != null? Code.GET_OK: Code.GET_ERR;
        String msg = linkTopicList != null? "查询所有成功": "查询所有失败";
        return new Result(code, linkTopicList, msg);
    }

}
