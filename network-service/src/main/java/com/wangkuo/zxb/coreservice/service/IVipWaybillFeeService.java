package com.wangkuo.zxb.coreservice.service;

import com.wangkuo.zxb.coreservice.api.common.StatusAndItem;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillFeeBack;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillFeeParam;

/**
 * VIP运单费用计算
 *
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-21
 */
public interface IVipWaybillFeeService {


    StatusAndItem<WaybillFeeBack> calculateWaybillFee(WaybillFeeParam param);
}
