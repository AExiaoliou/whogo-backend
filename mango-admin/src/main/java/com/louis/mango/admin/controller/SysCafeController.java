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

import com.louis.mango.admin.model.SysCafe;
import com.louis.mango.admin.service.SysCafeService;

/**
 * ---------------------------
 * 食堂菜品表 (SysCafeController)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@RestController
@RequestMapping("sysCafe")
public class SysCafeController {

	@Autowired
	private SysCafeService sysCafeService;

	/**
	 * 保存食堂菜品表
	 * @param record
	 * @return
	 */
	//@PreAuthorize("hasAuthority('sys:cafe:add') AND hasAuthority('sys:cafe:edit')")
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysCafe record) {
		return HttpResult.ok(sysCafeService.save(record));
	}

    /**
     * 删除食堂菜品表
     * @param records
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:cafe:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysCafe> records) {
		return HttpResult.ok(sysCafeService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:cafe:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysCafeService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:cafe:view')")
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(sysCafeService.findById(id));
	}
}
