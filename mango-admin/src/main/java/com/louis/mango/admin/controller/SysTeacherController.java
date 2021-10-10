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

import com.louis.mango.admin.model.SysTeacher;
import com.louis.mango.admin.service.SysTeacherService;

/**
 * ---------------------------
 * 教职工表 (SysTeacherController)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@RestController
@RequestMapping("sysTeacher")
public class SysTeacherController {

	@Autowired
	private SysTeacherService sysTeacherService;

	/**
	 * 保存教职工表
	 * @param record
	 * @return
	 */
	//@PreAuthorize("hasAuthority('sys:teach:add') AND hasAuthority('sys:teach:edit')")
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysTeacher record) {
		return HttpResult.ok(sysTeacherService.save(record));
	}

    /**
     * 删除教职工表
     * @param records
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:teach:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysTeacher> records) {
		return HttpResult.ok(sysTeacherService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:teach:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysTeacherService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:teach:view')")
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(sysTeacherService.findById(id));
	}
}
