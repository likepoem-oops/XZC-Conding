package cn.tares.service.impl;

import cn.tares.dao.FacultyDao;
import cn.tares.pojo.Faculty;
import cn.tares.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyDao facultyDao;

    @Override
    public Faculty getFacultyByFno(String fno) {
        return facultyDao.getFacultyByFno(fno);
    }

    @Override
    public List<Faculty> getAllFacultyFno() {
        return facultyDao.getAllFacultyFno();
    }

    @Override
    public boolean updateFaculty(Faculty faculty) {
        return facultyDao.updateFaculty(faculty) > 0;
    }

    @Override
    public boolean deleteFacultyByFno(String fno) {
        return facultyDao.deleteFacultyByFno(fno) > 0;
    }

    @Override
    public boolean addFaculty(Faculty faculty) {
        return facultyDao.addFaculty(faculty) > 0;
    }
}
