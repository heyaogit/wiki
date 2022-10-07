package com.example.wikiproject.service;


import com.example.wikiproject.mapper.TestMapper;
import com.example.wikiproject.domain.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
   public List<Test>list(){
       return testMapper.list();

    }
}
