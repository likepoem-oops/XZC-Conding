package cn.tares.service.impl;


import cn.tares.dao.TopicDao;
import cn.tares.pojo.Topic;
import cn.tares.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;

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


}
