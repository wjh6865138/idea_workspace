package com.wangkuo.zxb.coreservice.db.common;


import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * The basic GenericDao interface with CRUD methods Finders are added with
 * interface inheritance and AOP introductions for concrete implementations
 * 
 * Extended interfaces may declare methods starting with find... list...
 * iterate... or scroll... They will execute a preconfigured query that is
 * looked up based on the rest of the method name
 */
public interface GenericDao<T, PK extends Serializable> {

//    int insert(T record);

    int insertSelective(T record);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    int deleteByPrimaryKey(PK id);

    T selectByPrimaryKey(PK id);



    /**
     * 条件查询
     * @param condition
     * @return
     */
    List<T> selectByCondition(HashMap<String, Object> condition);

    /**
     * 统计条数
     * @param condition
     * @return
     */
    int countByCondition(HashMap<String, Object> condition);

    /**
     * 分页
     * @param condition
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<T> selectPageByCondition(HashMap<String, Object> condition, int pageNo, int pageSize);



}
