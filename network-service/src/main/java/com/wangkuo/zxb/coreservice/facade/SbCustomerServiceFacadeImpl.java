package com.wangkuo.zxb.coreservice.facade;

import com.wangkuo.zxb.coreservice.api.ICustomerServiceFacade;
import com.wangkuo.zxb.coreservice.api.common.StatusAndItem;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.VipGoodsListBack;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillFeeBack;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillFeeParam;
import com.wangkuo.zxb.coreservice.service.ISbCustomerService;
import com.wangkuo.zxb.coreservice.service.IVipWaybillFeeService;
import com.wangkuo.zxb.coreservice.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangsy on 2015/12/16.
 */
@Service("customerServiceFacade")
public class SbCustomerServiceFacadeImpl implements ICustomerServiceFacade {

    @Autowired
    private ISbCustomerService customerService;

    @Autowired
    private IVipWaybillFeeService vipWaybillFeeService;


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

    @Override
    public StatusAndItem<WaybillFeeBack> calculateWaybillFee(WaybillFeeParam param) {

        return vipWaybillFeeService.calculateWaybillFee(param);
    }

    @Override
    public String getSiteDownId(String customerDownId) {
        return null;
    }
}
