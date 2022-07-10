package cn.tares.dao;

import cn.tares.pojo.LinkTopic;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LinkTopicDao {


    @Insert("insert into linktopic (topicId, tno, topicName, isFull) values " +
            "(#{topicId}, #{tno}, #{topicName}, #{isFull});")
    public int syncTopicCreate(LinkTopic linkTopic);

    @Select("select topicId from linktopic where tno = #{tno}")
    public List<String> getTopicIdByTno(String tno);

    @Select("select * from linktopic;")
    public List<LinkTopic> getAllLinkTopic();

    @Select("select * from linktopic where topicId = #{topicId} ;")
    public LinkTopic getSingleLinkTopicById(String topicId);

    @Update("update linktopic set tno = #{tno}, topicName = #{topicName}, isFull = #{isFull} where topicId = #{topicId};")
    public int updateLinkTopic(LinkTopic linkTopic);

    @Delete("delete from linktopic where topicId = #{topicId};")
    public int deleteLinkTopic(String topicId);

    @Select("select topicName from linktopic where tno = #{tno} ;")
    public List<String> getTopicNameByTno(String tno);

    @Select("select * from linktopic where tno = #{tno} ;")
    public List<LinkTopic> getLinkTopicByTno(String tno);

}
