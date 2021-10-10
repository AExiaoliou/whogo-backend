package com.louis.mango.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.mango.core.page.MybatisPageHelper;
import com.louis.mango.core.page.PageRequest;
import com.louis.mango.core.page.PageResult;

import com.louis.mango.admin.model.SysCafemember;
import com.louis.mango.admin.dao.SysCafememberMapper;
import com.louis.mango.admin.service.SysCafememberService;

/**
 * ---------------------------
 * 食堂会员表 (SysCafememberServiceImpl)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@Service
public class SysCafememberServiceImpl implements SysCafememberService {

	@Autowired
	private SysCafememberMapper sysCafememberMapper;

	@Override
	public int save(SysCafemember record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysCafememberMapper.add(record);
		}
		return sysCafememberMapper.update(record);
	}

	@Override
	public int delete(SysCafemember record) {
		return sysCafememberMapper.delete(record.getId());
	}

	@Override
	public int delete(List<SysCafemember> records) {
		for(SysCafemember record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysCafemember findById(Long id) {
		return sysCafememberMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, sysCafememberMapper);
	}
	
}
