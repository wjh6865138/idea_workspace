package com.wangkuo.zxb.coreservice.test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.wangkuo.zxb.coreservice.api.IWaybillTrackServiceFacade;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.CreateWaybillCustomerTrackParam;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mark on 15/8/10.
 */
public class AccountServiceFacadeTest {

//    private static String URL = "http://localhost:8081/core-service/accountservice";
//    private static IWaybillTrackServiceFacade API;
//    @Before
//    public void setUp() throws Exception {
//        HessianProxyFactory factory = new HessianProxyFactory();
//        factory.setOverloadEnabled(true);
//        API =  (IWaybillTrackServiceFacade) factory.create(IWaybillTrackServiceFacade.class, URL);
//    }
//
//    @Test
//    public void testListAccount() throws Exception {
////        QueryWaybillCustomerTrackParam param = new QueryWaybillCustomerTrackParam();
////        param.setRegisterTimeMax(DateUtil.parse("2015-08-10 15:30:00"));
////        param.setRegisterTimeMin(DateUtil.parse("2015-08-09 00:00:00"));
////        List<WaybillCustomerTrackListBack> backList = API.listAccount(param);
////        backList.get(0);
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        UpdateAccountParam param = new UpdateAccountParam();
//        param.setId(2L);
//        param.setAccountType(AccountDefine.PRIVATE_ACCOUNT_TYPE);
//        param.setMobile("18767135660");
//        param.setPassword("123456");
//        param.setRealName("lsy");
//        param.setRegisterChannel(CreateWaybillCustomerTrackParam.REGISTER_FROM_WEBSITE);
//        param.setMemo("...");
//        param.setStatus(AccountDefine.ACCOUNT_STATE_ACTIVE);
//        assertEquals(1, API.updateAccount(param));
//    }
//
//    @Test
//    public void testSelectById() throws Exception {
//        WaybillCustomerTrackBack back = API.selectById(2L);
//        assertNotNull(back);
//        back.getAccountName();
//    }
//
//    @Test
//    public void testResetPassword() throws Exception {
//        int r = API.resetPassword("hzlsy");
//        assertEquals(r,1);
//    }
//
//    @Test
//    public void testChangeStatus() throws Exception {
//
//    }
//
//    @Test
//    public void testModifyPassword() throws Exception {
//        int r = API.modifyPassword(3,"123456","123456");
//        assertEquals(r, 1);
//    }
//
//    @Test
//    public void testCreateAccount() throws Exception {
//        CreateWaybillCustomerTrackParam param = new CreateWaybillCustomerTrackParam();
//        param.setAccountName("hzlsy1");
//        param.setAccountType(AccountDefine.PRIVATE_ACCOUNT_TYPE);
//        param.setMobile("18767135663");
//        param.setPassword("123456");
//        param.setRealName("lsy");
//        param.setRegisterChannel(CreateWaybillCustomerTrackParam.REGISTER_FROM_WEBSITE);
//        param.setMemo("...");
//        param.setStatus(AccountDefine.ACCOUNT_STATE_ACTIVE);
//        assertEquals(1,API.createAccount(param));
//    }
}