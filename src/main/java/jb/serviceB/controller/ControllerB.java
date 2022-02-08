package jb.serviceB.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableCircuitBreaker
//@EnableHystrix
public class ControllerB {
    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String insId;

//    @HystrixCommand(fallbackMethod = "fallback") //dosn't let to get fields above
    @GetMapping("service/b")
    private String handleB() {
           return "service B" + "[" + insId + "]";

    }
//    public String fallback(Throwable th) {
//        return "Service B: Fallback Message - handleB is not available";
//    }

}
