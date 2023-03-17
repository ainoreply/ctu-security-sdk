/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
 */

package com.aisecurius.ctu.client.model;

import java.io.Serializable;

/**
 * Created by aisecurius on 2017/5/5.
 */
public class CtuResponse implements Serializable {
    private String uuid;               // The request identification code returned by the server for troubleshooting by the server
    private CtuResponseStatus status;  // status code
    private CtuEntireResult ctuEntireResult;          // Prevention and control results


    public CtuResponse() {
    }

    public CtuResponse(String uuid) {
        this.uuid = uuid;
    }

    public CtuResponse(String uuid, CtuEntireResult ctuEntireResult) {
        this(uuid, ctuEntireResult, CtuResponseStatus.SUCCESS);
    }

    public CtuResponse(String uuid, CtuEntireResult ctuEntireResult, CtuResponseStatus status) {
        this.uuid = uuid;
        this.ctuEntireResult = ctuEntireResult;
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CtuResponseStatus getStatus() {
        return status;
    }

    public void setStatus(CtuResponseStatus status) {
        this.status = status;
    }

    public CtuEntireResult getResult() {
        return ctuEntireResult;
    }

    public void setResult(CtuEntireResult ctuEntireResult) {
        this.ctuEntireResult = ctuEntireResult;
    }
}
