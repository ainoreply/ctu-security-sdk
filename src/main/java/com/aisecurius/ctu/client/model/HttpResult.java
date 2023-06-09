/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
*/
package com.aisecurius.ctu.client.model;

/**
 * @FileName: HttpResult.java
 * @Description: HttpResult.java
 * @Author: lizhi
 * @Date: 2017/10/31 15:49
 */

public class HttpResult {

    private Object data;

    private int stateCode;

    private String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
