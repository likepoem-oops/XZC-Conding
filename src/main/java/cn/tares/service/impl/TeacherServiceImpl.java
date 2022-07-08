package cn.tares.service.impl;

import cn.tares.dao.TeacherDao;
import cn.tares.pojo.Teacher;
import cn.tares.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public Teacher getTeacherByTno(String tno) {
        return teacherDao.getTeacherByTno(tno);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherDao.getAllTeacher();
    }

    @Override
    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher) > 0;
    }

    @Override
    public boolean deleteTeacher(String tno) {
        return teacherDao.deleteTeacher(tno) > 0;
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        return teacherDao.updateTeacher(teacher) > 0;
    }

    @Override
    public boolean updateTeacherPassword() {
        return teacherDao.updateTeacherPassword() > 0;
    }
}
