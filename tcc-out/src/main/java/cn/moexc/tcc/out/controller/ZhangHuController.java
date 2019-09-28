package cn.moexc.tcc.out.controller;


import cn.moexc.tcc.out.service.ZhangHuService;
import cn.moexc.tcc.out.util.Result;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class ZhangHuController {
    @Resource(name = "zhangHuOutServiceTry")
    private ZhangHuService zhangHuOutServiceTry;

    @RequestMapping("/huakuan")
    public Result huaKuan(@RequestParam("monery") Double monery){
        return zhangHuOutServiceTry.zhuanZhang(monery);
    }

}
