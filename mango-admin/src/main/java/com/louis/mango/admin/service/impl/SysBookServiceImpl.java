package com.louis.mango.admin.service.impl;

import java.util.List;

import com.louis.mango.admin.model.SysUser;
import com.louis.mango.admin.model.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.mango.core.page.MybatisPageHelper;
import com.louis.mango.core.page.PageRequest;
import com.louis.mango.core.page.PageResult;

import com.louis.mango.admin.model.SysBook;
import com.louis.mango.admin.dao.SysBookMapper;
import com.louis.mango.admin.service.SysBookService;

/**
 * ---------------------------
 * 图书表 (SysBookServiceImpl)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@Service
public class SysBookServiceImpl implements SysBookService {

	@Autowired
	private SysBookMapper sysBookMapper;

	@Override
	public int save(SysBook record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysBookMapper.add(record);
		}
		return sysBookMapper.update(record);
	}

	@Override
	public int delete(SysBook record) {
		return sysBookMapper.delete(record.getId());
	}

	@Override
	public int delete(List<SysBook> records) {
		for(SysBook record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysBook findById(Long id) {
		return sysBookMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, sysBookMapper);
	}

}
