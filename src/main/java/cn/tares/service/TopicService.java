package cn.tares.service;

import cn.tares.pojo.Topic;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TopicService {

    /**
     * 保存
     * @param topic
     * @return
     */
    public boolean save(Topic topic);

    /**
     * 修改
     * @param topic
     * @return
     */
    public boolean update(Topic topic);

    /**
     * 按id删除
     * @param topicId
     * @return
     */
    public boolean delete(String topicId);

    /**
     * 按id查询
     * @param topicId
     * @return
     */
    public Topic getById(String topicId);

    /**
     * 查询全部
     * @return
     */
    public List<Topic> getAll();

    // 以下的增删改查是 课题审查表中的操作

    // 保存
    public boolean saveToReview(Topic topic);

    // 修改
    public boolean updateReview(Topic topic);

    // 删除
    public boolean deleteReview(String topicId);

    // 查询审查表中所有属性
    public List<Topic> getAllFromReview();

    // 按照课题号查询单个
    public Topic getSingleFromReview(String topicId);


    // 查看还没被选完的选题
    public List<Topic> getNotFullTopic(String major);

    // 被选择了一个选题之后修改选题的剩余容量
    public boolean updateCurrentNum(Topic topic);
}
