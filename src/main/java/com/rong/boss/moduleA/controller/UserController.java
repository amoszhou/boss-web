package com.rong.boss.moduleA.controller;

import com.rong.boss.moduleA.domain.User;
import com.rong.boss.moduleA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amoszhou on 16/3/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{userId}")
    public ModelAndView userDetail(@PathVariable("userId") Integer userId){
        User user = userService.queryUser(userId);

        Map<String,Object> map = new HashMap<>();
        map.put("user", user);
        return new ModelAndView("userInfo",map);
    }
}
