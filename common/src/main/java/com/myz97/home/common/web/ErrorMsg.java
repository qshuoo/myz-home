package com.myz97.home.common.web;

import lombok.Getter;

/**
 * @author myz
 */
@Getter
public enum ErrorMsg {
    // 成功
    OK("success");

    String msg;

    ErrorMsg(String msg) {
        this.msg = msg;
    }
}
