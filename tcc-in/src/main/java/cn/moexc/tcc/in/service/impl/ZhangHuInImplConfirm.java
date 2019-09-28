package cn.moexc.tcc.in.service.impl;

import cn.moexc.tcc.in.entity.Zhanghuin;
import cn.moexc.tcc.in.mapper.ZhanghuinMapper;
import cn.moexc.tcc.in.service.ZhangHuInService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("zhanghuInServiceConfirm")
public class ZhangHuInImplConfirm implements ZhangHuInService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZhangHuInImplConfirm.class);

    @Autowired
    private ZhanghuinMapper zhanghuinMapper;

    @Transactional
    @Override
    public void ShouKuan(Double monery) {
        System.out.println("-------> in confirm...");
        int count = 0;
        try {
            Zhanghuin zhanghuin = new Zhanghuin();
            zhanghuin.setId(1);
            zhanghuin.setMonery(monery);
            count = zhanghuinMapper.zhangHuInConfirm(zhanghuin);
            LOGGER.info("SUCCESS, count is [{}]", count);
        } catch (Exception e) {
            LOGGER.error("ERROR,count is [{}], e is [{}]", count , e.getMessage());
        }
    }
}
