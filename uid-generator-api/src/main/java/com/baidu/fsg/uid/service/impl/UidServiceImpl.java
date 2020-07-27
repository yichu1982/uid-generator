package com.baidu.fsg.uid.service.impl;

import com.baidu.fsg.uid.exception.UidGenerateException;
import com.baidu.fsg.uid.impl.CachedUidGenerator;
import com.baidu.fsg.uid.service.UidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yichu
 * @date 2020/7/21
 */
@Service("uidService")
@Slf4j
public class UidServiceImpl implements UidService {

    @Autowired
    private CachedUidGenerator cachedUidGenerator;

    /**
     * 获得UID
     *
     * @return Long
     */
    @Override
    public Long getUid() {
        Long uid = null;
        try {
            uid = cachedUidGenerator.getUID();
        } catch (UidGenerateException e) {
            log.error("获得UID失败，e:{}", e.getMessage());
        }
        return uid;
    }

    /**
     * 解析UID
     *
     * @param uid UID（唯一ID）
     * @return String
     */
    @Override
    public String parseUid(long uid) {
        return cachedUidGenerator.parseUID(uid);
    }
}
