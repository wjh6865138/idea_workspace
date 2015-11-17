package com.wangkuo.zxb.coreservice.api.common;

/**
 * 公共返回值定义
 * <p/>
 * Created by levitch on 15/8/7.
 */
public class ReturnCode {

    /**
     * 成功：1
     */
    public static final int SUCCESS = 1;


    /**
     * 失败：0
     */
    public static final int FAILURE = 0;

    /**
     * 失败  - 传入参数非法：-1
     */
    public static final int ILLEGAL = -1;

    /**
     * 失败  - 抛出异常：-2
     */
    public static final int EXCEPTION = -2;

    /**
     * 失败  - 操作对象不存在：-3
     */
    public static final int NOTEXIST = -3;

    /**
     * 状态错误
     */
    public static final int STATUS_ERROR = -4;

    /**
     * 状态错误
     */
    public static final int NOT_LOGIN = -5;
}
