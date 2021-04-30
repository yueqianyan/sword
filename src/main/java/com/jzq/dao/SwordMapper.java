package com.jzq.dao;

import com.jzq.bean.Page;
import com.jzq.bean.Rate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author jianzhiqiang
 * @date 2021/3/12 23:17
 */
@Mapper
public interface SwordMapper {
    int insertSword(@Param("params")Map<String, Object> map);

    List<Rate> selectSword(Page page);

    int selectSwordByName(String name);

    int updateSword(@Param("params")Map<String, Object> map);
}
