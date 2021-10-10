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

import com.louis.mango.admin.model.SysStudent;
import com.louis.mango.admin.service.SysStudentService;

/**
 * ---------------------------
 * 学生表 (SysStudentController)         
 * ---------------------------
 * 作者：  Jay
 * 时间：  2021-06-23 02:04:17

 * ---------------------------
 */
@RestController
@RequestMapping("sysStudent")
public class SysStudentController {

	@Autowired
	private SysStudentService sysStudentService;

	/**
	 * 保存学生表
	 * @param record
	 * @return
	 */
	//@PreAuthorize("hasAuthority('sys:stu:add') AND hasAuthority('sys:stu:edit')")
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody SysStudent record) {
		return HttpResult.ok(sysStudentService.save(record));
	}

    /**
     * 删除学生表
     * @param records
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:stu:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysStudent> records) {
		return HttpResult.ok(sysStudentService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:stu:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysStudentService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */
	//@PreAuthorize("hasAuthority('sys:stu:view')")
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(sysStudentService.findById(id));
	}
}
