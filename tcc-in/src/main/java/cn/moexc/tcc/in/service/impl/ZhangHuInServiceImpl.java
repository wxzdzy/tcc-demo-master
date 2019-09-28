package cn.moexc.tcc.in.service.impl;


import cn.moexc.tcc.in.entity.Zhanghuin;
import cn.moexc.tcc.in.mapper.ZhanghuinMapper;
import cn.moexc.tcc.in.service.ZhangHuInService;
import org.bytesoft.compensable.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("zhanghuInServiceTry")
@Compensable(
        interfaceClass = ZhangHuInService.class
        ,confirmableKey = "zhanghuInServiceConfirm"
        ,cancellableKey = "zhanghuInServiceCancel"
)
public class ZhangHuInServiceImpl implements ZhangHuInService {
    @Autowired
    private ZhanghuinMapper zhanghuinMapper;

    @Transactional
    @Override
    public void ShouKuan(Double monery) {
        System.out.println("-------> in try... monery is " + monery);
        Zhanghuin zhanghuin = new Zhanghuin();
        zhanghuin.setId(1);
        zhanghuin.setMonery(monery);
        zhanghuinMapper.zhangHuInTry(zhanghuin);
    }
}
