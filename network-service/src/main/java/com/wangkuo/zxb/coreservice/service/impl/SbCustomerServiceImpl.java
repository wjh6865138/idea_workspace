package com.wangkuo.zxb.coreservice.service.impl;

import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerDao;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerVipGoodsDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomer;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipGood;
import com.wangkuo.zxb.coreservice.service.ISbCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by wangsy on 2015/12/16.
 */
@Service
public class SbCustomerServiceImpl implements ISbCustomerService {

    @Autowired
    private ISbCustomerDao customerDao;

    @Autowired
    private ISbCustomerVipGoodsDao vipGoodsDao;


    @Override
    public int isVipByDownId(String downId) {
        SbCustomer customer = customerDao.getCustomerByDownId(downId);

        if (customer == null) {
            return 0;
        }

        if (customer.getType() != null && customer.getType() == 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public int isVipById(Long id) {
        SbCustomer customer = customerDao.selectByPrimaryKey(id);
        if (customer == null) {
            return 0;
        }

        if (customer.getType() != null && customer.getType() == 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public List<SbCustomerVipGood> getVipGoodsByDownId(String downId) {

        SbCustomer customer = customerDao.getCustomerByDownId(downId.trim());
        if (customer == null) {
            return Collections.emptyList();
        }
        return vipGoodsDao.getVipGoodsByCustomerId(customer.getId());
    }
}
