package cn.tares.dao;

import cn.tares.pojo.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TeacherDao {

    @Select("select * from teacher where tno = #{tno} ;")
    public Teacher getTeacherByTno(String tno);

    @Select("select * from teacher;")
    public List<Teacher> getAllTeacher();

    @Insert("insert into teacher (tno, tname, password, etopic, introduction) values " +
            "(#{tno}, #{tname}, #{password}, #{etopic}, #{introduction});")
    public int addTeacher(Teacher teacher);

    @Delete("delete from teacher where tno = #{tno};")
    public int deleteTeacher(String tno);

    @Update("update teacher set tname=#{tname},password=#{password},etopic=#{etopic},introduction=#{introduction} where tno = #{tno}")
    public int updateTeacher(Teacher teacher);

    @Update("update teacher set password = '123456';")
    public int updateTeacherPassword();
}
