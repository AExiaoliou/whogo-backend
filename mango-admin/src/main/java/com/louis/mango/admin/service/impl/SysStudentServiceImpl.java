package com.louis.mango.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.mango.core.page.MybatisPageHelper;
import com.louis.mango.core.page.PageRequest;
import com.louis.mango.core.page.PageResult;

import com.louis.mango.admin.model.SysStudent;
import com.louis.mango.admin.dao.SysStudentMapper;
import com.louis.mango.admin.service.SysStudentService;

/**
 * ---------------------------
 * 学生表 (SysStudentServiceImpl)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@Service
public class SysStudentServiceImpl implements SysStudentService {

	@Autowired
	private SysStudentMapper sysStudentMapper;

	@Override
	public int save(SysStudent record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysStudentMapper.add(record);
		}
		return sysStudentMapper.update(record);
	}

	@Override
	public int delete(SysStudent record) {
		return sysStudentMapper.delete(record.getId());
	}

	@Override
	public int delete(List<SysStudent> records) {
		for(SysStudent record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysStudent findById(Long id) {
		return sysStudentMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, sysStudentMapper);
	}
	
}
