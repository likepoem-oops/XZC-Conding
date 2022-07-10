package cn.tares.service;


import cn.tares.pojo.LinkTopic;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface LinkTopicService {

    // 同步Topic的创建
    public boolean syncTopicCreate(LinkTopic linkTopic);

    // 根据教师代号得到所有对应的Topic
    public List<String> getTopicIdByTno(String tno);

    // 得到所有对应的TopicId
    public List<LinkTopic> getAllLinkTopic();

    // 查询单个
    public LinkTopic getSingleLinkTopicById(String topicId);

    // 修改
    public boolean updateLinkTopic(LinkTopic linkTopic);

    // 删除
    public boolean deleteLinkTopic(String topicId);

    // 得到此tno名下的所有TopicName
    public List<String> getTopicNameByTno(String tno);

    // 根据tno查询得到的一个LinkTopic的表
    public List<LinkTopic> getLinkTopicByTno(String tno);
}
