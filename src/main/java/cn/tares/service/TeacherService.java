package cn.tares.service;

import cn.tares.pojo.Teacher;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TeacherService {
    /**
     * 查询单个教师
     * @param tno 查询的教师编号
     * @return 查询的教师对象
     */
    public Teacher getTeacherByTno(String tno);

    /**
     * 查询所有教师
     * @return 所有教师对象的集合
     */
    public List<Teacher> getAllTeacher();

    /**
     * 添加教师信息
     * @param teacher 添加的教师对象
     * @return 是否成功
     */
    public boolean addTeacher(Teacher teacher);

    /**
     *
     * @param tno 删除的教师代号
     * @return 是否成功
     */
    public boolean deleteTeacher(String tno);

    /**
     * 修改教师信息
     * @param teacher 修改的教师对象
     * @return 是否成功
     */
    public boolean updateTeacher(Teacher teacher);


    // 修改所有教师的密码
    public boolean updateTeacherPassword();
}
