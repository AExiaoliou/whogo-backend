package com.louis.mango.admin.dao;

import java.util.List;

import com.louis.mango.admin.model.SysStudent;

/**
 * ---------------------------
 * 学生表 (SysStudentMapper)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
public interface SysStudentMapper {

	/**
	 * 添加学生表
	 * @param record
	 * @return
	 */
    int add(SysStudent record);

    /**
     * 删除学生表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改学生表
     * @param record
     * @return
     */
    int update(SysStudent record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    SysStudent findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<SysStudent> findPage();
    
}