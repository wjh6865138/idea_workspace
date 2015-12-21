package com.wangkuo.zxb.coreservice.service;

import com.wangkuo.zxb.coreservice.db.po.SbCustomer;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipBase;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipGood;

import java.util.List;

/**
 * Created by wangsy on 2015/12/16.
 */
public interface ISbCustomerService {

    /**
     * 根据downId判断是否是vip，0否 1是
     *
     * @param downId
     * @return
     */
    int isVipByDownId(String downId);

    /**
     * 根据id判断是否是vip，0否 1是
     *
     * @param id
     * @return
     */
    int isVipById(Long id);

    /**
     * 判断是否vip
     * @param sbCustomer
     * @return
     */
    int isVip(SbCustomer sbCustomer);

    /**
     * 根据downId获取vip货物列表
     *
     * @param downId
     * @return
     */
    List<SbCustomerVipGood> getVipGoodsByDownId(String downId);


    /**
     * 获取客户信息
     * @param downId
     * @return
     */
    SbCustomer getCustomerByDownId(String downId);

    /**
     * 获取客户
     * @param customerId
     * @return
     */
    SbCustomerVipBase getVipBaseByCustomerId(Long customerId);

}
