package com.example.wikiproject.service;


import com.example.wikiproject.domain.Ebook;
import com.example.wikiproject.domain.EbookExample;
import com.example.wikiproject.mapper.EbookMapper;
import com.example.wikiproject.req.EbookReq;
import com.example.wikiproject.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
   public List<EbookResp>list(EbookReq req){
       EbookExample ebookExample=new EbookExample();
       EbookExample.Criteria criteria=ebookExample.createCriteria();
       criteria.andNameLike("%"+req.getName()+"%");
       List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
       List<EbookResp>respList=new ArrayList<>();
       for (Ebook ebook:ebookList){
           EbookResp ebookResp=new EbookResp();
         //  ebookResp.setId(ebook.getId());
           BeanUtils.copyProperties(ebook,ebookResp);
           //ebookResp.setId(123456L);
           respList.add(ebookResp);
       }
       return respList;
   }
}
