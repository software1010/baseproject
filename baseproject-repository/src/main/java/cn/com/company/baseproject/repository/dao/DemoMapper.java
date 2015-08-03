package cn.com.company.baseproject.repository.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.company.baseproject.repository.entity.Demo;
import cn.com.company.baseproject.repository.util.Page;

public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
    
    List<Demo> selectDemosForPage(@Param("page") Page page, String name);
}