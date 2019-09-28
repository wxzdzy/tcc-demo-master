package cn.moexc.tcc.out.service.impl;

import cn.moexc.tcc.out.entity.Zhanghuout;
import cn.moexc.tcc.out.fegin.ShouKuanFientClient;
import cn.moexc.tcc.out.mapper.ZhanghuoutMapper;
import cn.moexc.tcc.out.service.ZhangHuService;
import cn.moexc.tcc.out.util.Result;
import org.bytesoft.compensable.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service("zhangHuOutServiceTry")
@Compensable(
        interfaceClass = ZhangHuService.class
        //,confirmableKey = "zhangHuOutServiceConfirm"//confirm没有调用数据库服务
        ,cancellableKey = "zhangHuOutServiceCancel"
)
public class ZhangHuServiceImpl implements ZhangHuService {
    @Autowired
    private ZhanghuoutMapper zhanghuoutMapper;
    @Autowired
    private ShouKuanFientClient shouKuanFientClient;

    @Transactional
    @Override
    public Result zhuanZhang(Double monery) {
        System.out.println("-------> out try... monery is " + monery);
        Zhanghuout out = new Zhanghuout();
        out.setUserId(1);
        out.setMonery(monery);
        if(zhanghuoutMapper.zhangHuOutTry(out) != 1){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return new Result(-1, "资金不足", null);
        }

        shouKuanFientClient.shouKuan(monery);//远程服务

        if(monery == 10D){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return new Result(-1, "monery is 10D, roolback", null);
        }

        return new Result(0, "划款成功", null);
    }
}
