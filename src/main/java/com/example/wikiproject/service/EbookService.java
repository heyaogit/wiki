package com.example.wikiproject.service;


import com.example.wikiproject.domain.Ebook;
import com.example.wikiproject.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
   public List<Ebook>list(){
       return ebookMapper.selectByExample(null);

    }
}
