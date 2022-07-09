package cn.tares.dao;

import cn.tares.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentDao {

    @Select("select * from student where sno = #{sno}")
    public Student getStudentBySno(String sno);

    @Select("select * from student")
    public List<Student> getAllStudent();

    // topicPick topicName
    @Insert("insert into student (sno, name, password, major) " +
            "values " +
            "(#{sno}, #{name}, #{password}, #{major});")
    public int saveStudent(Student student);

    @Delete("delete from student where sno = #{sno};")
    public int deleteStudent(String sno);

    @Update("update student set name=#{name}, password=#{password}, topicPick=#{topicPick}, major=#{major}, topicName=#{topicName} where sno = #{sno};")
    public int updateStudent(Student student);

    // 按topicPick查询学生

    @Select("select * from student where topicPick = #{topicPick} ;")
    public List<Student> getNoTopic(String topicPick);

}
