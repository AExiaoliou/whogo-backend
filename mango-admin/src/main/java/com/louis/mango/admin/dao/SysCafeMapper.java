package com.louis.mango.admin.dao;

import java.util.List;

import com.louis.mango.admin.model.SysCafe;

/**
 * ---------------------------
 * 食堂菜品表 (SysCafeMapper)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
public interface SysCafeMapper {

	/**
	 * 添加食堂菜品表
	 * @param record
	 * @return
	 */
    int add(SysCafe record);

    /**
     * 删除食堂菜品表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改食堂菜品表
     * @param record
     * @return
     */
    int update(SysCafe record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    SysCafe findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<SysCafe> findPage();
    
}