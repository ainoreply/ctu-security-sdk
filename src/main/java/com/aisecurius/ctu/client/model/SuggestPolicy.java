/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
 */

package com.aisecurius.ctu.client.model;

import java.io.Serializable;

/**
 * Created by aisecurius on 2017/5/5.
 */
public class SuggestPolicy implements Serializable {
    private String code;
    private String name;

    public SuggestPolicy() {
    }

    public SuggestPolicy(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
