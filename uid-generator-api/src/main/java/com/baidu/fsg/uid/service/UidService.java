package com.baidu.fsg.uid.service;

/**
 *
 * @author yichu
 * @date 2020/7/21
 */
public interface UidService {

    /**
     * 获得UID
     *
     * @return Long
     */
    Long getUid();

    /**
     * 解析UID
     *
     * @param uid UID（唯一ID）
     * @return String
     */
    String parseUid(long uid);
}
