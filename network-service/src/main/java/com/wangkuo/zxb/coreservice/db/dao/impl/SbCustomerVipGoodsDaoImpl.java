package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerVipGoodsDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipGood;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by wangsy on 2015/12/16.
 */
public class SbCustomerVipGoodsDaoImpl extends GenericMyBatisDaoImpl<SbCustomerVipGood,Long>  implements ISbCustomerVipGoodsDao{
    @Override
    public List<SbCustomerVipGood> getVipGoodsByDownId(String downId) {
        SqlSession session = getSqlSession();
        return  session.selectList(getMapperNamespace("getVipGoodsByDownId"), downId);
    }
}
