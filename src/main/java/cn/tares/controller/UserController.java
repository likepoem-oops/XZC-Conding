package cn.tares.controller;


import cn.tares.pojo.User;
import cn.tares.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public Result getUser(String username){
        User user = userService.getUser(username);
        Integer code = (user != null)? Code.GET_OK: Code.GET_ERR;
        String  msg = (user != null)? "查询成功":"你的信息在数据库中查询不到!请联系管理员";
        String result =  (user != null)? user.getUsername(): null;
    return new Result(code, result, msg);
    }
}
