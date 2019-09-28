package cn.moexc.tcc.in.controller;

import cn.moexc.tcc.in.service.ZhangHuInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class ZhangHuInController {
    @Autowired
    private ZhangHuInService zhanghuInServiceTry;

    @Transactional
    @RequestMapping("/shoukuan")
    public String shouKuan(@RequestParam("monery") Double monery){
        zhanghuInServiceTry.ShouKuan(monery);
        return "SUCCESS";
    }
}
