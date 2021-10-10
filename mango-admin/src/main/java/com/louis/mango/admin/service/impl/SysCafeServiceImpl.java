package com.louis.mango.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.mango.core.page.MybatisPageHelper;
import com.louis.mango.core.page.PageRequest;
import com.louis.mango.core.page.PageResult;

import com.louis.mango.admin.model.SysCafe;
import com.louis.mango.admin.dao.SysCafeMapper;
import com.louis.mango.admin.service.SysCafeService;

/**
 * ---------------------------
 * 食堂菜品表 (SysCafeServiceImpl)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@Service
public class SysCafeServiceImpl implements SysCafeService {

	@Autowired
	private SysCafeMapper sysCafeMapper;

	@Override
	public int save(SysCafe record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysCafeMapper.add(record);
		}
		return sysCafeMapper.update(record);
	}

	@Override
	public int delete(SysCafe record) {
		return sysCafeMapper.delete(record.getId());
	}

	@Override
	public int delete(List<SysCafe> records) {
		for(SysCafe record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysCafe findById(Long id) {
		return sysCafeMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, sysCafeMapper);
	}
	
}
