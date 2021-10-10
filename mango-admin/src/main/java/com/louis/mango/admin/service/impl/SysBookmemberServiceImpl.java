package com.louis.mango.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.mango.core.page.MybatisPageHelper;
import com.louis.mango.core.page.PageRequest;
import com.louis.mango.core.page.PageResult;

import com.louis.mango.admin.model.SysBookmember;
import com.louis.mango.admin.dao.SysBookmemberMapper;
import com.louis.mango.admin.service.SysBookmemberService;

/**
 * ---------------------------
 * 图书会员表 (SysBookmemberServiceImpl)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@Service
public class SysBookmemberServiceImpl implements SysBookmemberService {

	@Autowired
	private SysBookmemberMapper sysBookmemberMapper;

	@Override
	public int save(SysBookmember record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysBookmemberMapper.add(record);
		}
		return sysBookmemberMapper.update(record);
	}

	@Override
	public int delete(SysBookmember record) {
		return sysBookmemberMapper.delete(record.getId());
	}

	@Override
	public int delete(List<SysBookmember> records) {
		for(SysBookmember record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysBookmember findById(Long id) {
		return sysBookmemberMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, sysBookmemberMapper);
	}
	
}
