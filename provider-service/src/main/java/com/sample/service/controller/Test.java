package com.sample.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Author by lrjin, Email 659618618@qq.com, Date on 2018/5/16.
 * PS: Not easy to write code, please indicate.
 */
@RestController
public class Test {

    @GetMapping("/getAll")
    public List<String> getAll(){
        List<String> list = new ArrayList();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        return list;
    }
}
