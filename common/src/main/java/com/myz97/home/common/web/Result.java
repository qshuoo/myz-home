package com.myz97.home.common.web;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author myz
 */
@Data
@AllArgsConstructor
public class Result<T> implements Serializable {

    private final int code;
    private final String msg;
    private final T data;


    public Result(ErrorCode code, String msg, T data) {
        this.code = code.getCode();
        this.msg = msg;
        this.data = data;
    }

    public Result(ErrorCode code, ErrorMsg msg, T data) {
        this.code = code.getCode();
        this.msg = msg.getMsg();
        this.data = data;
    }

    public static Result success() {
        return new Result<>(ErrorCode.OK, ErrorMsg.OK, null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(ErrorCode.OK, ErrorMsg.OK, data);
    }
}
