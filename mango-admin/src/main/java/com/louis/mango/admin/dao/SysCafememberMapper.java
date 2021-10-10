package com.louis.mango.admin.dao;

import java.util.List;

import com.louis.mango.admin.model.SysCafemember;

/**
 * ---------------------------
 * 食堂会员表 (SysCafememberMapper)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
public interface SysCafememberMapper {

	/**
	 * 添加食堂会员表
	 * @param record
	 * @return
	 */
    int add(SysCafemember record);

    /**
     * 删除食堂会员表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改食堂会员表
     * @param record
     * @return
     */
    int update(SysCafemember record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    SysCafemember findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<SysCafemember> findPage();
    
}