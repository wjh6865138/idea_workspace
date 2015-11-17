package com.wangkuo.zxb.coreservice.api.common;

import java.io.Serializable;

/**
 * Created by cuihe on 15-7-3.
 */
public class StatusAndItem<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int status;

    private T item;

    public StatusAndItem() {
        status = ReturnCode.SUCCESS;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
