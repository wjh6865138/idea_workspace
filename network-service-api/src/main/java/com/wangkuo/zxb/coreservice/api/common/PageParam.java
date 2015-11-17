package com.wangkuo.zxb.coreservice.api.common;

import java.io.Serializable;

/**
 * 分页请求参数,  默认第一页开始，一页20条
 *
 * @author levitch
 */
public class PageParam implements Serializable {

    public final static int DEFAULT_PAGE_SIZE = 20;

    private Integer pageNo;
    private Integer pageSize;

    public Integer getPageNo() {
        return  pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = (pageNo == null || pageNo == 0) ? 1 : pageNo;
    }

    public Integer getPageSize() {

        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = (pageSize == null || pageSize == 0) ? DEFAULT_PAGE_SIZE : pageSize;
    }

    public int getOffset() {
        return ((pageNo - 1) * pageSize);
    }
}
