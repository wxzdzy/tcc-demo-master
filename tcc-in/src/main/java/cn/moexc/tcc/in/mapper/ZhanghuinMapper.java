package cn.moexc.tcc.in.mapper;

import cn.moexc.tcc.in.entity.Zhanghuin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhanghuinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zhanghuin record);

    int insertSelective(Zhanghuin record);

    Zhanghuin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zhanghuin record);

    int updateByPrimaryKey(Zhanghuin record);

    int zhangHuInTry(Zhanghuin record);

    int zhangHuInConfirm(Zhanghuin record);

    int zhangHuInCancel(Zhanghuin record);
}