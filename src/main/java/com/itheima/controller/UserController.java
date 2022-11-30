package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//使用@Controller定义bean
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/user")
//定义请求路径前缀
public class UserController {
    //    设置当前操作的访问路径
//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save() {
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }

    //    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete ...");
        return "{'module':'user delete'}";
    }

    //    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("user update ...");
        return "{'module':'user update'}";
    }

    //    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById ...");
        return "{'module':'user getById'}";
    }
}
