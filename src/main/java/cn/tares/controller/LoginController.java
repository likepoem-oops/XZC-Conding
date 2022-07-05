package cn.tares.controller;


import cn.tares.pojo.User;
import cn.tares.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/logins")
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    HttpServletRequest request;

    @PostMapping
    public String getNameAndPwd(String username, String password){
        System.out.println("登录用户名 ==> " + username);
        System.out.println("登录密码 ==> " + password);
        if (username.equals("chenTares") && password.equals("chen2001")){
            return "123.jsp";
        }else {
            return "login is not success...";
        }
    }

    @GetMapping
    public boolean getUsernameBackPassword(String username, String password){
        System.out.println("得到的登录账户是==> " + username);
        System.out.println("得到的登录密码是==> " + password);
        return true;
    }

    @GetMapping("/check")
    public Result checkName(String username){
        User user = userService.getUser(username);
        // System.out.println("登录账户==>" + username);
        // boolean flag = user.getUsername().equals(username);
        // Integer code = flag? Code.CHECK_SUCCESS: Code.CHECK_ERR;
        // String msg = flag? "登录成功!!!":"用户名错误或者密码错误...";
        return new Result(123, user.getPassword(), "登录操作正在维护中...");
    }


}
