package com.example.wikiproject.service;


import com.example.wikiproject.domain.Ebook;
import com.example.wikiproject.domain.EbookExample;
import com.example.wikiproject.mapper.EbookMapper;
import com.example.wikiproject.req.EbookReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
   public List<Ebook>list(EbookReq req){
       EbookExample ebookExample=new EbookExample();
       EbookExample.Criteria criteria=ebookExample.createCriteria();
       criteria.andNameLike("%"+req.getName()+"%");
       return ebookMapper.selectByExample(ebookExample);

    }
}
