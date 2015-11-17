package com.wangkuo.zxb.coreservice.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

/**
 * Created by mark on 15/8/11.
 */
@Component
public class EncryptionMD5 implements Encryption {
    @Override
    public String encrypt(String in) {
        return DigestUtils.md5Hex(in);
    }
}
