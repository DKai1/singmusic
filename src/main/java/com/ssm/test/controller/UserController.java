package com.ssm.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssm.test.model.User;
import com.ssm.test.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component

@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserServiceImpl userService;

    @RequestMapping("/showname.do")
    public String showUserName(HttpServletRequest request, HttpServletResponse response)throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
        return "sussece";
    }

}
