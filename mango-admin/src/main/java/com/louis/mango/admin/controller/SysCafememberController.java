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

import com.louis.mango.admin.model.SysCafemember;
import com.louis.mango.admin.service.SysCafememberService;

/**
 * ---------------------------
 * 食堂会员表 (SysCafememberController)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@RestController
@RequestMapping("sysCafemember")
public class SysCafememberController {

	@Autowired
	private SysCafememberService sysCafememberService;

	/**
	 * 保存食堂会员表
	 * @param record
	 * @return
	 */
	//@PreAuthorize("hasAuthority('sys:cafemember:add') AND hasAuthority('sys:cafemember:edit')")

	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysCafemember record) {
		return HttpResult.ok(sysCafememberService.save(record));
	}

    /**
     * 删除食堂会员表
     * @param records
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:cafemember:delete')")

	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysCafemember> records) {
		return HttpResult.ok(sysCafememberService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:cafemember:view')")

	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysCafememberService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:cafemember:view')")

	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(sysCafememberService.findById(id));
	}
}
