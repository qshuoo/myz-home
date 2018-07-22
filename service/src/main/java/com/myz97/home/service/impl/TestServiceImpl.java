package com.myz97.home.service.impl;

import com.myz97.home.common.CommonUtil;
import com.myz97.home.dao.TestDAO;
import com.myz97.home.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDAO testDAO;

    @Override
    public String test() {
        return CommonUtil.restToJson(testDAO.getTest());
    }
}
