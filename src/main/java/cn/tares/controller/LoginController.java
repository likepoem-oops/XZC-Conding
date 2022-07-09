package cn.tares.controller;


import cn.tares.pojo.*;
import cn.tares.service.DepartmentService;
import cn.tares.service.FacultyService;
import cn.tares.service.StudentService;
import cn.tares.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class LoginController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private FacultyService facultyService;
    @Autowired
    private DepartmentService departmentService;

    // 用户登录
    @RequestMapping("/checkUser")
    public String checkUser(HttpServletRequest request, HttpServletResponse response, LoginUser loginUser){
        String accountType = request.getParameter("accountType");
        // 1-教师 2-系主任 3-学生 4-教务人员
        System.out.println(accountType);
        String username = loginUser.getUsername();
        String password = loginUser.getPassword();
        System.out.println(loginUser);
        switch (accountType) {
            case "1" -> {
                // 1-教师
                Teacher teacher = teacherService.getTeacherByTno(username);
                if (teacher != null && teacher.getPassword().equals(password)) {
                    System.out.println("教师登录成功!!!");
                    return "redirect:toTeacherMain";
                } else {
                    return "redirect:reLogin";
                }
            }
            case "2" -> {
                // 2-系主任
                Department department = departmentService.getDepartmentByDno(username);

                if (department != null && department.getPassword().equals(password)){
                    System.out.println("系主任登录成功");
                    return "redirect:toDepartmentMain";
                }else {
                    return "redirect:reLogin";
                }
            }
            case "3" -> {
                // 3-学生
                Student student = studentService.getStudentBySno(username);

                if (student != null && student.getPassword().equals(password)) {
                    System.out.println("学生登录成功!!!");
                    return "redirect:toStudentMain";
                } else {
                    return "redirect:reLogin";
                }
            }
            case "4" -> {
                // 4-教务人员
                Faculty faculty = facultyService.getFacultyByFno(username);

                if (faculty != null && faculty.getPassword().equals(password)){
                    System.out.println("教务人员登录成功!!!");
                    return "redirect:toAdminMain";
                }else {
                    return "redirect:reLogin";
                }
            }
            default -> {
                // 没有选择身份登录, 直接跳回登录页面
                return "redirect:reLogin";
            }
        }
    }


    @RequestMapping("/toAdminMain")
    public String toMain(){
        return "/pages/adminMain.html";
    }

    @RequestMapping("/toStudentMain")
    public String toStudent(){
        return "/pages/studentMain.html";
    }

    @RequestMapping("/toTeacherMain")
    public String toTeacher(){
        return "/pages/teacherMain.html";
    }

    @RequestMapping("/toDepartmentMain")
    public String toDepartment(){
        return "/pages/departmentMain.html";
    }

    @RequestMapping("/reLogin")
    public String reLogin(){
        return "index.jsp";
    }

    @RequestMapping("/logOut")
    public String logOut(){
        return "/pages/logOut.html";
    }

}
