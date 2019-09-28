package cn.moexc.tcc.out.service.impl;

import cn.moexc.tcc.out.entity.Zhanghuout;
import cn.moexc.tcc.out.fegin.ShouKuanFientClient;
import cn.moexc.tcc.out.mapper.ZhanghuoutMapper;
import cn.moexc.tcc.out.service.ZhangHuService;
import cn.moexc.tcc.out.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("zhangHuOutServiceConfirm")
public class ZhangHuServiceImplConfirm implements ZhangHuService {
    @Autowired
    private ZhanghuoutMapper zhanghuoutMapper;

    @Transactional
    @Override
    public Result zhuanZhang(Double monery) {
        System.out.println("-------> out confirm...");

        return new Result(0, "划款成功", null);
    }
}
