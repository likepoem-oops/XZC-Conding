package cn.tares.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JumpPageController {
    @RequestMapping(value = "/loginSuccess", method = RequestMethod.GET)
    public String loginSuccess(){
        System.out.println("跳转...");
        return "/pages/main.html";
    }
}
