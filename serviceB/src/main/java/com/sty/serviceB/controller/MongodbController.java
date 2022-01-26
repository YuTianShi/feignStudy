package com.sty.serviceB.controller;

import com.sty.serviceB.domain.Test;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * MongodbController.
 *
 * @author shitianyu 2022-01-23 15:17
 */
@RestController
@RequestMapping("/mongo")
public class MongodbController {

    @Resource
    private MongoTemplate mongoTemplate;

    @RequestMapping("/test")
    @Transactional(rollbackFor = Throwable.class)
    public void test() {
        Test test = new Test();
        test.setActivityId(123L);
        test.setLosingAgainButton("1234567");
        this.mongoTemplate.save(test);
        //throw new RuntimeException("测试");
    }

}
