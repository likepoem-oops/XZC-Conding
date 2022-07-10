package cn.tares.service.impl;


import cn.tares.dao.LinkTopicDao;
import cn.tares.dao.TopicDao;
import cn.tares.pojo.LinkTopic;
import cn.tares.pojo.Topic;
import cn.tares.service.LinkTopicService;
import cn.tares.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService, LinkTopicService {

    @Autowired
    private TopicDao topicDao;

    @Autowired
    private LinkTopicDao linkTopicDao;

    public boolean save(Topic Topic) {
        return topicDao.save(Topic) > 0;
    }

    public boolean update(Topic Topic) {
        return topicDao.update(Topic) > 0;

    }

    public boolean delete(String topicId) {
        return topicDao.delete(topicId) > 0;
    }

    public Topic getById(String topicId) {
        return topicDao.getById(topicId);
    }

    public List<Topic> getAll() {
        return topicDao.getAll();
    }

    @Override
    public boolean saveToReview(Topic topic) {
        return topicDao.saveToReview(topic) > 0;
    }

    @Override
    public boolean updateReview(Topic topic) {
        return topicDao.updateReview(topic) > 0;
    }

    @Override
    public boolean deleteReview(String topicId) {
        return topicDao.deleteReview(topicId) > 0;
    }

    @Override
    public List<Topic> getAllFromReview() {
        return topicDao.getAllFromReview();
    }

    @Override
    public Topic getSingleFromReview(String topicId) {
        return topicDao.getSingleFromReview(topicId);
    }

    @Override
    public List<Topic> getNotFullTopic(String major) {
        return topicDao.getNotFullTopic(major);
    }

    @Override
    public boolean updateCurrentNum(Topic topic) {
        return topicDao.updateCurrentNum(topic) > 0;
    }


    // ------------------------------分界线----------------------------------

    // 以下是同步表的操作
    @Override
    public boolean syncTopicCreate(LinkTopic linkTopic) {
        return linkTopicDao.syncTopicCreate(linkTopic) > 0;
    }

    @Override
    public boolean deleteLinkTopic(String topicId) {
        return linkTopicDao.deleteLinkTopic(topicId) > 0;
    }

    //------------------------------分界线----------------------------------

    // 以下分别是得到课题号和课题名称列表的方法
    @Override
    public List<String> getTopicIdByTno(String tno) {
        return linkTopicDao.getTopicIdByTno(tno);
    }

    @Override
    public List<String> getTopicNameByTno(String tno) {
        return linkTopicDao.getTopicNameByTno(tno);
    }

    //------------------------------分界线----------------------------------

    // 根据教师tno查询整个对象 - 管理员查看操作

    @Override
    public List<LinkTopic> getLinkTopicByTno(String tno) {
        return linkTopicDao.getLinkTopicByTno(tno);
    }


    //------------------------------分界线----------------------------------

    // 以下是正常增改的操作
    @Override
    public List<LinkTopic> getAllLinkTopic() {
        return linkTopicDao.getAllLinkTopic();
    }

    @Override
    public LinkTopic getSingleLinkTopicById(String topicId) {
        return linkTopicDao.getSingleLinkTopicById(topicId);
    }

    @Override
    public boolean updateLinkTopic(LinkTopic linkTopic) {
        return linkTopicDao.updateLinkTopic(linkTopic) > 0;
    }




}
