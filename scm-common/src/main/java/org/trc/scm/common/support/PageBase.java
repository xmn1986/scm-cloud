package org.trc.scm.common.support;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class PageBase implements Serializable {

	@ApiModelProperty(name = "pageSize", value = "页数大小", required = true)
	protected int pageSize;

	@ApiModelProperty(name = "pageNumber", value = "第几页", required = true)
	protected int pageNumber = 1;
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
}