package cn.tares.service.impl;

import cn.tares.dao.StudentDao;
import cn.tares.pojo.Student;
import cn.tares.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getStudentBySno(Integer sno) {
        return studentDao.getStudentBySno(sno);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    public boolean saveNewStudent(Student student) {
        return studentDao.saveStudent(student) > 0;
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDao.updateStudent(student) > 0;
    }

    @Override
    public boolean deleteStudent(Integer sno) {
        return studentDao.deleteStudent(sno) > 0;
    }
}
