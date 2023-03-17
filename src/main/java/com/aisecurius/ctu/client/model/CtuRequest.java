/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
 */

package com.aisecurius.ctu.client.model;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by aisecurius on 2017/5/5.
 */
public class CtuRequest implements Serializable {
    private static final long serialVersionUID = -6582668008857059475L;
    private String eventCode;            // event code
    private String flag;                 // Client request tag, used to identify the request
    private Map<String, Object> data;    // event parameters

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            data.put(entry.getKey(),String.valueOf(entry.getValue()));
        }
        this.data = data;
    }

    @Override
    public String toString() {
        return "CtuRequest{" +
                "eventCode='" + eventCode + '\'' +
                ", data=" + data +
                ", flag='" + flag + '\'' +
                '}';
    }
}
