package com.louis.mango.admin.dao;

import java.util.List;

import com.louis.mango.admin.model.SysBookmember;

/**
 * ---------------------------
 * 图书会员表 (SysBookmemberMapper)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
public interface SysBookmemberMapper {

	/**
	 * 添加图书会员表
	 * @param record
	 * @return
	 */
    int add(SysBookmember record);

    /**
     * 删除图书会员表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改图书会员表
     * @param record
     * @return
     */
    int update(SysBookmember record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    SysBookmember findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<SysBookmember> findPage();
    
}