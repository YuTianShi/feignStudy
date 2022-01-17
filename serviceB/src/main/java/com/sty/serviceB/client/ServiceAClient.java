package com.sty.serviceB.client;

import com.sty.serviceA.api.TestControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * ServiceAClient.
 *
 * @author shitianyu 2022-01-17 16:00
 */
@FeignClient(name = "scenicA")
public interface ServiceAClient extends TestControllerApi {
}
