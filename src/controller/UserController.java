package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pojo.Users;

import javax.servlet.http.HttpSession;
@Controller
public class UserController {
    private static final Log logger= LogFactory.getLog(UserController.class);
    @RequestMapping("/login")
    public String login(Users users, HttpSession session, Model model){
        if("java_springmvc".equals(users.getUname())&&"123456".equals(users.getUpass())){
            session.setAttribute("u",users);
            logger.info("成功......");
            return "main";
        }
        else{
            logger.info("失败......");
            model.addAttribute("messageError","用户名或密码错误......");
            return "login";
        }
    }

    @RequestMapping("/register")
    public String register(@ModelAttribute("user") Users user, Model model){
        if("java_springmvc".equals(user.getUname())&&"123456".equals(user.getUpass())){
            logger.info("成功......");
            return "forward:login";
        }
        else{
            logger.info("失败......");
            model.addAttribute("uname",user.getUname());
            return "redirect:register";
        }
    }
}
