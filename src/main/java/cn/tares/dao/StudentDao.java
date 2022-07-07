package cn.tares.dao;

import cn.tares.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentDao {

    @Select("select * from student where sno = #{sno}")
    public Student getStudentBySno(Integer sno);

    @Select("select * from student")
    public List<Student> getAllStudent();

    @Insert("insert into student (sno, name,password, topicPick, major) " +
            "values " +
            "(#{sno}, #{name}, #{password}, #{topicPick}, #{major});")
    public int saveStudent(Student student);

    @Delete("delete from student where sno = #{sno};")
    public int deleteStudent(Integer sno);

    @Update("update student set name=#{name}, password=#{password}, topicPick=#{topicPick}, major=#{major} where sno = #{sno};")
    public int updateStudent(Student student);

}
