package com.louis.mango.admin.dao;

import java.util.List;

import com.louis.mango.admin.model.SysTeacher;

/**
 * ---------------------------
 * 教职工表 (SysTeacherMapper)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
public interface SysTeacherMapper {

	/**
	 * 添加教职工表
	 * @param record
	 * @return
	 */
    int add(SysTeacher record);

    /**
     * 删除教职工表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改教职工表
     * @param record
     * @return
     */
    int update(SysTeacher record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    SysTeacher findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<SysTeacher> findPage();
    
}