package com.zc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zheng.javagodfather
 * @create 2022-11-08 15:34
 */
@Component
public class LbImpl implements LoadBalancer {


    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {

        return null;
    }
}
