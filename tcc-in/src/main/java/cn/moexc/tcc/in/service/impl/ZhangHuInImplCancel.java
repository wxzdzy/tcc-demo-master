package cn.moexc.tcc.in.service.impl;

import cn.moexc.tcc.in.entity.Zhanghuin;
import cn.moexc.tcc.in.mapper.ZhanghuinMapper;
import cn.moexc.tcc.in.service.ZhangHuInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("zhanghuInServiceCancel")
public class ZhangHuInImplCancel implements ZhangHuInService {

    @Autowired
    private ZhanghuinMapper zhanghuinMapper;

    @Transactional
    @Override
    public void ShouKuan(Double monery) {
        System.out.println("-------> in cancel...");
        Zhanghuin zhanghuin = new Zhanghuin();
        zhanghuin.setId(1);
        zhanghuin.setMonery(monery);
        zhanghuinMapper.zhangHuInCancel(zhanghuin);
    }

}
