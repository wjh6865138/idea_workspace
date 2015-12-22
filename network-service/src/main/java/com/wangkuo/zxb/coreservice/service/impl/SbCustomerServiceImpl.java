package com.wangkuo.zxb.coreservice.service.impl;

import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerDao;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerVipBaseDao;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerVipGoodsDao;
import com.wangkuo.zxb.coreservice.db.dao.IZbSiteDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomer;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipBase;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipGood;
import com.wangkuo.zxb.coreservice.db.po.ZbSite;
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

    @Autowired
    private ISbCustomerVipBaseDao customerVipBaseDao;

    @Autowired
    private IZbSiteDao siteDao;

    @Override
    public int isVipByDownId(String downId) {
        SbCustomer customer = customerDao.getCustomerByDownId(downId);
        return isVip(customer);
    }

    @Override
    public int isVipById(Long id) {
        SbCustomer customer = customerDao.selectByPrimaryKey(id);
        return isVip(customer);
    }

    @Override
    public int isVip(SbCustomer customer) {
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

    @Override
    public SbCustomer getCustomerByDownId(String downId) {
        return customerDao.getCustomerByDownId(downId);
    }

    @Override
    public SbCustomerVipBase getVipBaseByCustomerId(Long customerId) {
        return customerVipBaseDao.selectByCustomerId(customerId);
    }

    @Override
    public String getSiteDownId(String customerDownId) {
        if(customerDownId == null || customerDownId.equals("")){
            return null;
        }
        SbCustomer customer = customerDao.getCustomerByDownId(customerDownId);
        if(customer == null){
            return null;
        }
        if(customer.getSiteId() == null){
            return null;
        }
        ZbSite site = siteDao.selectByPrimaryKey(customer.getSiteId());
        if(site == null){
            return null;
        }
        return site.getDownId();
    }
}
