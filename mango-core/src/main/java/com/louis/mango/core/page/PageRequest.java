package com.louis.mango.core.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分页请求
 * @author Louis
 * @date Jan 12, 2019
 */
public class PageRequest {
	/**
	 * 当前页码
	 */
	private int pageNum = 1;
	/**
	 * 每页数量
	 */
	private int pageSize = 10;
	/**
	 * 查询参数
	 */
	private List<Map<String, Object>> params = new ArrayList<Map<String, Object>>();
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<Map<String, Object>> getParams() {
		return params;
	}
	public void setParams(List<Map<String, Object>>  params) {
		this.params = params;
	}
	public Object getParam(String key) {
		for(Map<String, Object> p:params) {
			if(p.containsKey(key)){
				return p.get(key);
			}
		}
		return null;
	}
	
}
