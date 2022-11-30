package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    //    链接上的参数
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name, int age) {
        System.out.println("获取name" + name);
        System.out.println("获取age" + age);
        return name + age;
    }

    //    集合参数：JSON格式 例：[1,2,3,4]
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println("参数" + likes);
        return "listParamForJson";
    }

    //    pojo参数：JSON格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody Book book) {
        System.out.println("参数" + book);
        return "listParamForJson";
    }

    //    集合参数：JSON格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<Book> list) {
        System.out.println("参数" + list);
        return "listPojoParamForJson";
    }

    //    日期参数
    @RequestMapping("/dataParam")
    @ResponseBody
    public String dataParam(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        System.out.println("参数" + date);
        return "dataParam";
    }
}
