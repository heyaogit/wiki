package com.example.wikiproject.controller;

import com.example.wikiproject.domain.Demo;
import com.example.wikiproject.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {




    @Resource
    private DemoService demoService;


    @GetMapping("/demo/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
