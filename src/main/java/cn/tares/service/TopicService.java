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
     * @param topic
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param topic
     * @return
     */
    public Topic getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Topic> getAll();
}
