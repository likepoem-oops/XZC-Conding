package cn.tares.dao;

import cn.tares.pojo.Department;
import cn.tares.pojo.Faculty;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DepartmentDao {

    @Select("select * from department where dno = #{dno} ;")
    public Department getDepartmentByDno(String dno);

    @Select("select * from department;")
    public List<Department> getAllDepartmentDno();

    @Update("update department set dname = #{dname},password = #{password}, major = #{major} where dno = #{dno};")
    public int updateDepartment(Department department);

    @Delete("delete from department where dno = #{dno};")
    public int deleteDepartmentByFno(String dno);

    @Insert("insert into department (dno, dname, password, major) values " +
            "(#{dno}, #{dname}, #{password}, #{major});")
    public int addDepartment(Department department);
}
