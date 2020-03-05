package com.it.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.it.pojo.User;
import com.it.service.UserService;

@Controller
@ResponseBody
public class DemoController {
	
	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	
	@Autowired
    private UserService userService;
	
	@GetMapping("/hello")
    public User hello() {
        User user = this.userService.queryById(16L);
        System.out.println(user);
        return user;
    }
	
}
