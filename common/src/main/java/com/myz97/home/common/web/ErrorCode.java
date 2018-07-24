package com.myz97.home.common.web;

import lombok.Getter;

/**
 * @author myz
 */
@Getter
public enum ErrorCode {
    // 成功
    OK(200);

    int code;

    ErrorCode(int code) {
        this.code = code;
    }
}
