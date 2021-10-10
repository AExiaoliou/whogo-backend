package com.louis.mango.admin.dao;

import java.util.List;

import com.louis.mango.admin.model.SysBook;

/**
 * ---------------------------
 * 图书表 (SysBookMapper)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
public interface SysBookMapper {

	/**
	 * 添加图书表
	 * @param record
	 * @return
	 */
    int add(SysBook record);

    /**
     * 删除图书表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改图书表
     * @param record
     * @return
     */
    int update(SysBook record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    SysBook findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<SysBook> findPage();
    
}