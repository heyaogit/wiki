package com.example.wikiproject.service;


import com.example.wikiproject.domain.Ebook;
import com.example.wikiproject.domain.EbookExample;
import com.example.wikiproject.mapper.EbookMapper;
import com.example.wikiproject.req.EbookReq;
import com.example.wikiproject.resp.EbookResp;
import com.example.wikiproject.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
   //    List<EbookResp>respList=new ArrayList<>();
//       for (Ebook ebook:ebookList){
//           EbookResp ebookResp=new EbookResp();
//         //  ebookResp.setId(ebook.getId());
//           BeanUtils.copyProperties(ebook,ebookResp);
      // EbookResp ebookResp=CopyUtil.copy(ebook,EbookResp.class);
//           //ebookResp.setId(123456L);
//           respList.add(ebookResp);
//       }

       List<EbookResp>list= CopyUtil.copyList(ebookList,EbookResp.class);
       return list;
   }
}
