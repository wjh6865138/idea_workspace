package com.wangkuo.zxb.coreservice.api.common;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 分页
 *
 * @param <T>
 */
public class PageResult<T> implements Serializable {

    /**
     * 总记录数
     */
    private int totals;

    /**
     * 第几页
     */
    private int pageNo;

    /**
     * 每页显示条数
     */
    private int pageSize;

    /**
     * 分页数据
     */
    private List<T> records;

    public int getTotals() {
        return totals;
    }
    public void setTotals(int totals) {
        this.totals = totals;
    }
    public List<T> getRecords() {
        return records;
    }
    public void setRecords(List<T> records) {
        this.records = records;
    }
    public int getPageNo() {
        return pageNo;
    }
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotalPage() {
        return  (totals + pageSize -1) / pageSize;
    }
}
