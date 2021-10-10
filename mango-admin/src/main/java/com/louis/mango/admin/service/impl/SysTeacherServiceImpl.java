package com.louis.mango.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.mango.core.page.MybatisPageHelper;
import com.louis.mango.core.page.PageRequest;
import com.louis.mango.core.page.PageResult;

import com.louis.mango.admin.model.SysTeacher;
import com.louis.mango.admin.dao.SysTeacherMapper;
import com.louis.mango.admin.service.SysTeacherService;

/**
 * ---------------------------
 * 教职工表 (SysTeacherServiceImpl)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@Service
public class SysTeacherServiceImpl implements SysTeacherService {

	@Autowired
	private SysTeacherMapper sysTeacherMapper;

	@Override
	public int save(SysTeacher record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysTeacherMapper.add(record);
		}
		return sysTeacherMapper.update(record);
	}

	@Override
	public int delete(SysTeacher record) {
		return sysTeacherMapper.delete(record.getId());
	}

	@Override
	public int delete(List<SysTeacher> records) {
		for(SysTeacher record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysTeacher findById(Long id) {
		return sysTeacherMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, sysTeacherMapper);
	}
	
}
