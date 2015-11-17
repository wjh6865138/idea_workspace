package com.wangkuo.zxb.coreservice.utils;

import com.google.common.collect.Lists;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 14-3-14
 */
@Component()
public class BeanMapper {

    @Autowired
    private Mapper dozer;

    /**
     * 基于Dozer转换对象的类型.
     */
    public <T> T map(Object source, Class<T> destinationClass) {
        if (null == source) {
            return null;
        }
        return dozer.map(source, destinationClass);
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    public <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        List<T> destinationList = Lists.newArrayList();
        if (sourceList.isEmpty()) {
            return destinationList;
        }

        for (Object sourceObject : sourceList) {
            T destinationObject = dozer.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }

    /**
     * 基于Dozer将对象A的值拷贝到对象B中.
     */
    public void copy(Object source, Object destinationObject) {
        dozer.map(source, destinationObject);
    }
}
