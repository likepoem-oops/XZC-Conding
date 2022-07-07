package cn.tares.service;


import cn.tares.pojo.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface StudentService {
    /**
     * 得到单个学生
     * @param sno 学生学号 - 同时也是登录账号
     * @return 这个学生对象
     */

    public Student getStudentBySno(Integer sno);

    /**
     *  查询所有学生
     * @return 返回所有学生的列表
     */
    public List<Student> getAllStudent();

    /**
     * 添加新学生
     * @param student 需要添加的学生对象
     * @return boolean - 存入数据库是否成功
     */
    public boolean saveNewStudent(Student student);

    /**
     * 修改学生
     * @param student 修改的学生对象
     * @return 是否成功
     */
    public boolean updateStudent(Student student);

    /**
     * 删除学生
     * @param sno 删除学生的学号
     * @return 是否成功
     */
    public boolean deleteStudent(Integer sno);
}
