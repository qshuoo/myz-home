package com.myz97.home.dao.impl;

import com.myz97.home.dao.TestDAO;
import com.myz97.home.model.Test;
import org.springframework.stereotype.Service;

/**
 * @author myz
 */
@Service
public class TestDAOImpl implements TestDAO {

    @Override
    public Test getTest() {
        return new Test("" + System.currentTimeMillis());
    }
}
