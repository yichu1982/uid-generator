package com.baidu.fsg.uid.controller;

import com.baidu.fsg.uid.service.UidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yichu
 * @date 2020/7/21
 */
@RestController
@RequestMapping(value = "/v1", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UidController {

    @Autowired
    private UidService uidService;

    /**
     * 获得UID
     *
     * @return ResponseEntity
     */
    @GetMapping(value = "/uids/get")
    public ResponseEntity getUid() {
        return ResponseEntity.ok(uidService.getUid());
    }

    /**
     * 解析UID
     *
     * @param uid UID（唯一ID）
     * @return ResponseEntity
     */
    @GetMapping(value = "/uids/parse/uid/{uid}")
    public ResponseEntity parseUid(@PathVariable("uid") long uid) {
        return ResponseEntity.ok(uidService.parseUid(uid));
    }
}
