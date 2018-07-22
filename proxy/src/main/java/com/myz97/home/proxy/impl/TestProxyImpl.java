package com.myz97.home.proxy.impl;

import com.myz97.home.proxy.TestProxy;
import com.myz97.home.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestProxyImpl implements TestProxy {

    @Autowired
    private TestService testService;

    @Override
    public String test() {
        return testService.test();
    }
}
