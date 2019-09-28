package cn.moexc.tcc.out.mapper;

import cn.moexc.tcc.out.entity.Zhanghuout;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhanghuoutMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Zhanghuout record);

    int insertSelective(Zhanghuout record);

    Zhanghuout selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Zhanghuout record);

    int updateByPrimaryKey(Zhanghuout record);

    int zhangHuOutTry(Zhanghuout record);

    int zhangHuOutCancel(Zhanghuout record);
}