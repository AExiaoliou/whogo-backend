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

import com.louis.mango.admin.model.SysBook;
import com.louis.mango.admin.service.SysBookService;

/**
 * ---------------------------
 * 图书表 (SysBookController)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@RestController
@RequestMapping("sysBook")
public class SysBookController {

	@Autowired
	private SysBookService sysBookService;

	/**
	 * 保存图书表
	 * @param record
	 * @return
	 */
	//@PreAuthorize("hasAuthority('sys:book:add') AND hasAuthority('sys:book:edit')")
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysBook record) {
		return HttpResult.ok(sysBookService.save(record));
	}

    /**
     * 删除图书表
     * @param records
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:book:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysBook> records) {
		return HttpResult.ok(sysBookService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:user:view')")
	//@PreAuthorize("hasAuthority('sys:book:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysBookService.findPage(pageRequest));
	}
    /**
     * 根据主键查询
     * @param id
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:user:view')")
	//@PreAuthorize("hasAuthority('sys:book:view')")
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(sysBookService.findById(id));
	}
}
