package cn.tares.service;

import cn.tares.pojo.Faculty;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface FacultyService {

    // 按fno查询
    public Faculty getFacultyByFno(String fno);

    // 查询所有
    public List<Faculty> getAllFacultyFno();

    // 修改
    public boolean updateFaculty(Faculty faculty);

    // 删除 - 按ID
    public boolean deleteFacultyByFno(String fno);

    // 添加
    public boolean addFaculty(Faculty faculty);
}
