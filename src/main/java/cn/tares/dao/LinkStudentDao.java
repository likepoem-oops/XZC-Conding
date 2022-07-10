package cn.tares.dao;

import cn.tares.pojo.LinkStudent;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LinkStudentDao {

    @Select("select * from stu_topic;")
    public List<LinkStudent> getAll();

    @Select("select * from stu_topic where topicId = #{topicId} ;")
    public List<LinkStudent> getStudentByTopicId(String topicId);

    @Update("update stu_topic set topicId = #{topicId}, sname = #{sname}, major = #{major} where sno = #{sno};")
    public int update(LinkStudent linkStudent);

    @Delete("delete from stu_topic where sno = #{sno};")
    public int delete(String sno);

    @Insert("insert into stu_topic (sno, topicId, sname, major) values " +
            "(#{sno}, #{topicId}, #{sname}, #{major});")
    public int addToLinkStudent(LinkStudent linkStudent);
}

