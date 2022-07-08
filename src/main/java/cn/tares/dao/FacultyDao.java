package cn.tares.dao;

import cn.tares.pojo.Faculty;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface FacultyDao {

    @Select("select * from faculty where fno = #{fno} ;")
    public Faculty getFacultyByFno(String fno);

    @Select("select * from faculty;")
    public List<Faculty> getAllFacultyFno();

    @Update("update faculty set fname = #{fname},password = #{password} where fno = #{fno};")
    public int updateFaculty(Faculty faculty);

    @Delete("delete from faculty where fno = #{fno};")
    public int deleteFacultyByFno(String fno);
    
    @Insert("insert into faculty (fno, fname, password) values " +
            "(#{fno},#{fname},#{password});")
    public int addFaculty(Faculty faculty);


}
