package cn.tares.controller;


import cn.tares.pojo.Student;
import cn.tares.pojo.User;
import cn.tares.service.StudentService;
import cn.tares.service.UserService;
import cn.tares.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@Controller
@RequestMapping("loginUser")
public class LoginServlet extends HttpServlet {

    @Autowired
    private StudentService studentService;

    @Autowired
    private HttpSession session;

    @RequestMapping(value = "/getUser")
    public void getUsername(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Student student = (Student) request.getSession().getAttribute("student");
        System.out.println(student);
        if (student != null){
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(response.getOutputStream(), student);
        }
        
    }

    @Override
    @RequestMapping("/LoginServlet")
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charSet=UTF-8");
        req.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();

        String sno = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("你提交的账号是: " + sno);
        System.out.println("你提交的密码是: " + password);

        Student student = studentService.getStudentBySno(sno);
        System.out.println(student);

        if (student.getPassword().equals(password)){
            session.setAttribute("studentName", sno);
            resp.sendRedirect("/pages/adminMain.html");
        }else {
            out.println("");
            resp.sendRedirect("index.jsp");
        }


    }
}
