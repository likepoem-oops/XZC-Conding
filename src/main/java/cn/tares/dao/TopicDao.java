package cn.tares.dao;

import cn.tares.pojo.Topic;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TopicDao {


    @Insert("insert into topic (topicId, topicName, introduction, major, number, currentNum) " +
            "values" +
            "(#{topicId}, #{topicName},#{introduction}, #{major}, #{number}, #{currentNum})")
    public int save(Topic topic);

    @Update("update topic " +
            "set topicName = #{topicName}, introduction = #{introduction}, major = #{major},number =  #{number},currentNum =  #{currentNum} where topicId = #{topicId}")
    public int update(Topic topic);

    @Delete("delete from topic where topicId = #{topicId}")
    public int delete(String topicId);

    @Select("select * from topic where topicId = #{topicId}")
    public Topic getById(String topicId);

    @Select("select * from topic")
    public List<Topic> getAll();

    @Insert("insert into review (topicId, topicName, introduction, major, number, currentNum) values " +
            "(#{topicId}, #{topicName},#{introduction}, #{major}, #{number}, #{currentNum});")
    public int saveToReview(Topic topic);

    @Update("update review " +
            "set topicName = #{topicName}, introduction = #{introduction}, major = #{major},number =  #{number},currentNum =  #{currentNum} where topicId = #{topicId};")
    public int updateReview(Topic topic);

    @Delete("delete from review where topicId = #{topicId};")
    public int deleteReview(String topicId);

    @Select("select * from review;")
    public List<Topic> getAllFromReview();

    @Select("select * from review where topicId = #{topicId} ;")
    public Topic getSingleFromReview(String topicId);

    // 查看还没被选完的选题
    @Select("select * from topic where major = #{major} and currentNum > 0;")
    public List<Topic> getNotFullTopic(String major);

    // 被选择了一个选题之后修改选题的剩余容量
    @Update("update topic set currentNum = #{currentNum} where topicId = #{topicId};")
    public int updateCurrentNum(Topic topic);



}
