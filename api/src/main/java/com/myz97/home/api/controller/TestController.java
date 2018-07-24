package com.myz97.home.api.controller;

import com.myz97.home.common.CommonUtil;
import com.myz97.home.common.web.Result;
import com.myz97.home.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public Object test() {
        log.info("test");
        return testService.test();
    }

    @GetMapping("/result")
    public Object resultTest() {
        return CommonUtil.restToJson(Result.success());
    }
}
