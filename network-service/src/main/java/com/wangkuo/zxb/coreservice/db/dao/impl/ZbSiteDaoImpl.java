package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.IZbSiteDao;
import com.wangkuo.zxb.coreservice.db.po.ZbSite;
import org.springframework.stereotype.Repository;

/**
 * Created by sanshao on 15-12-22.
 */
@Repository
public class ZbSiteDaoImpl extends GenericMyBatisDaoImpl<ZbSite, Long> implements IZbSiteDao{
}
