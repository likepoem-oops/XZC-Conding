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
    private TopicDao TopicDao;

    public boolean save(Topic Topic) {
        return TopicDao.save(Topic) > 0;
    }

    public boolean update(Topic Topic) {
        return TopicDao.update(Topic) > 0;

    }

    public boolean delete(Integer id) {
        return TopicDao.delete(id) > 0;

    }

    public Topic getById(Integer id) {
        return TopicDao.getById(id);
    }

    public List<Topic> getAll() {
        return TopicDao.getAll();
    }
}
