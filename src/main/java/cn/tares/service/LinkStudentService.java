package cn.tares.service;


import cn.tares.pojo.LinkStudent;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface LinkStudentService {

    public List<LinkStudent> getAll();

    public List<LinkStudent> getStudentByTopicId(String topicId);

    public boolean updateLinkStudent(LinkStudent linkStudent);

    public boolean deleteLinkStudent(String sno);

    public boolean addToLinkStudent(LinkStudent linkStudent);
}
