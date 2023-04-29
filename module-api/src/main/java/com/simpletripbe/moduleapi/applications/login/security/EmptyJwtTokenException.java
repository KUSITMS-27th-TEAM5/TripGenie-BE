package com.simpletripbe.moduleapi.applications.login.security;

import com.simpletripbe.modulecommon.common.response.CommonCode;

public class EmptyJwtTokenException extends RuntimeException{

    private CommonCode commonCode = CommonCode.EMPTY_JWT_TOKEN;

    public EmptyJwtTokenException(String message) {
        super(message);
    }

    public CommonCode getCommonCode() {
        return commonCode;
    }
}
