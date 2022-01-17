package com.sty.serviveA.controller;

import com.sty.serviceA.api.TestControllerApi;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController.
 *
 * @author shitianyu 2022-01-17 15:28
 */
@RestController
public class TestController implements TestControllerApi {

    @Override
    public String getMsg(@RequestParam(value = "msg") String msg) {
        return "ServiceA" + msg;
    }
}
