package com.example.wikiproject.controller;

import com.example.wikiproject.req.EbookReq;
import com.example.wikiproject.resp.CommonResp;
import com.example.wikiproject.resp.EbookResp;
import com.example.wikiproject.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EbookController {



    @Resource
    private EbookService ebookService;


    @GetMapping("/ebook/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list=ebookService.list(req);
        resp.setContent(list);
        return resp;


    }
}
