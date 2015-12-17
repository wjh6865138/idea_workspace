package com.wangkuo.zxb.coreservice.facade;

import com.wangkuo.zxb.coreservice.api.ICustomerServiceFacade;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.VipGoodsListBack;
import com.wangkuo.zxb.coreservice.service.ISbCustomerService;
import com.wangkuo.zxb.coreservice.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wangsy on 2015/12/16.
 */
public class SbCustomerServiceFacadeImpl implements ICustomerServiceFacade {

    @Autowired
    private ISbCustomerService customerService;
    @Autowired
    private BeanMapper beanMapper;


    @Override
    public int isVipByDownId(String downId) {
        return customerService.isVipByDownId(downId);
    }

    @Override
    public int isVipById(Long id) {
        return customerService.isVipById(id);
    }

    @Override
    public List<VipGoodsListBack> getVipGoodsByDownId(String downId) {
        return beanMapper.mapList(customerService.getVipGoodsByDownId(downId), VipGoodsListBack.class);
    }
}
