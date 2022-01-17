package com.sty.serviceA.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TestControllerApi.
 *
 * @author shitianyu 2022-01-17 15:21
 */
@RequestMapping("test")
public interface TestControllerApi {

    @RequestMapping(value = "getMsg", method = RequestMethod.GET)
    String getMsg(@RequestParam(value = "msg") String msg);

}
