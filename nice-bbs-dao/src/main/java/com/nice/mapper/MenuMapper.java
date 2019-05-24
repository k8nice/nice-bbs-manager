package com.nice.mapper;

import com.nice.domain.Menu;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单mapper类
 * @author ningh
 */
@Mapper
public interface MenuMapper {
    /**
     * 添加菜单
     * @param menu  菜单
     */
    void addMenu(Menu menu);
}
