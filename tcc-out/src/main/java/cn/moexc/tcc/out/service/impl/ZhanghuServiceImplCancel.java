package cn.moexc.tcc.out.service.impl;

import cn.moexc.tcc.out.entity.Zhanghuout;
import cn.moexc.tcc.out.mapper.ZhanghuoutMapper;
import cn.moexc.tcc.out.service.ZhangHuService;
import cn.moexc.tcc.out.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("zhangHuOutServiceCancel")
public class ZhanghuServiceImplCancel implements ZhangHuService {

    @Autowired
    private ZhanghuoutMapper zhanghuoutMapper;

    @Transactional
    @Override
    public Result zhuanZhang(Double monery) {
        System.out.println("-------> out cancel...");
        Zhanghuout out = new Zhanghuout();
        out.setUserId(1);
        out.setMonery(monery);
        zhanghuoutMapper.zhangHuOutCancel(out);
        return new Result(-1, "划款失败", null);
    }
}
