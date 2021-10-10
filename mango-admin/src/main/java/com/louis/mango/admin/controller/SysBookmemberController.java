package com.louis.mango.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.louis.mango.core.http.HttpResult;
import com.louis.mango.core.page.PageRequest;

import com.louis.mango.admin.model.SysBookmember;
import com.louis.mango.admin.service.SysBookmemberService;

/**
 * ---------------------------
 * 图书会员表 (SysBookmemberController)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@RestController
@RequestMapping("sysBookmember")
public class SysBookmemberController {

	@Autowired
	private SysBookmemberService sysBookmemberService;

	/**
	 * 保存图书会员表
	 * @param record
	 * @return
	 */
	//@PreAuthorize("hasAuthority('sys:bookmember:add') AND hasAuthority('sys:bookmember:edit')")
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysBookmember record) {
		return HttpResult.ok(sysBookmemberService.save(record));
	}

    /**
     * 删除图书会员表
     * @param records
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:bookmember:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysBookmember> records) {
		return HttpResult.ok(sysBookmemberService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:bookmember:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysBookmemberService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:bookmember:view')")
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(sysBookmemberService.findById(id));
	}
}
