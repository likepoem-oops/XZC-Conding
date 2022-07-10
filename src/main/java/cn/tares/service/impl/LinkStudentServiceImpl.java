package cn.tares.service.impl;

import cn.tares.dao.LinkStudentDao;
import cn.tares.pojo.LinkStudent;
import cn.tares.service.LinkStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkStudentServiceImpl implements LinkStudentService {

    @Autowired
    private LinkStudentDao linkStudentDao;

    @Override
    public List<LinkStudent> getAll() {
        return linkStudentDao.getAll();
    }

    @Override
    public List<LinkStudent> getStudentByTopicId(String topicId) {
        return linkStudentDao.getStudentByTopicId(topicId);
    }

    @Override
    public boolean updateLinkStudent(LinkStudent linkStudent) {
        return linkStudentDao.update(linkStudent) > 0;
    }

    @Override
    public boolean deleteLinkStudent(String sno) {
        return linkStudentDao.delete(sno) > 0;
    }

    @Override
    public boolean addToLinkStudent(LinkStudent linkStudent) {
        return linkStudentDao.addToLinkStudent(linkStudent) > 0;
    }
}
