package com.wangkuo.zxb.coreservice.api;

import com.wangkuo.zxb.coreservice.api.data.waybilltrack.VipGoodsListBack;

import java.util.List;

/**
 * Created by wangsy on 2015/12/16.
 */
public interface ICustomerServiceFacade {
    /**
     * 根据downId判断是否是vip，0否 1是
     * @param downId
     * @return
     */
    int isVipByDownId(String downId);

    /**
     * 根据id判断是否是vip，0否 1是
     * @param id
     * @return
     */
    int isVipById(Long id);

    /**
     * 根据downId获取vip货物列表
     * @param downId
     * @return
     */
    List<VipGoodsListBack> getVipGoodsByDownId(String downId);
}
