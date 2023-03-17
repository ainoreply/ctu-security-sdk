/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
 */

package com.aisecurius.ctu.client;

import com.aisecurius.ctu.client.model.CtuRequest;
import com.aisecurius.ctu.client.model.CtuResponse;
import com.aisecurius.ctu.client.model.RiskLevel;
import com.alibaba.fastjson.JSON;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aisecurius on 2017/5/5.
 */
public class Demo {
    /**
     * Wind control engine url
     **/
    public static final String url = "https://sec.aisecurius.com/ctu/event.do";
    /**
     * Application app Key, public key
     **/
    public static final String appKey = "xxxxxxxxxxxxx1f2d7371";
    /**
     * Application app Secret, private key
     **/
    public static final String appSecret = "xxxxxxxxxxx5fdc0a64";


    public static void main(String[] param) throws Exception {
        /** business request data **/
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("const_id", "5ab06c01J0e0I3bttjCnXYcjdlLFVDt7pOtBZNV1"); // device fingerprint id
        data.put("user_id", "1"); // User ID
        data.put("phone_number", "12345678");
        Date date = new Date();
        data.put("id", "24555666");
        data.put("name", "ttt");
        data.put("ext_open_id", "76567574");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        CtuRequest request = new CtuRequest();
        request.setEventCode("register");
        request.setData(data);
        request.setFlag("ddd");
        CtuClient client = new CtuClient(url, appKey, appSecret);
        CtuResponse response = client.checkRisk(request);

        if (RiskLevel.ACCEPT.equals(response.getResult().getRiskLevel())) {
            System.out.printf(JSON.toJSONString(response));
            //... Business code, the current request has no risk
        } else if (RiskLevel.REVIEW.equals(response.getResult().getRiskLevel())) {
            System.out.printf(JSON.toJSONString(response));
            //... Business code, the current request has certain risks, it is recommended to review
        } else if (RiskLevel.REJECT.equals(response.getResult().getRiskLevel())) {
            System.out.printf(JSON.toJSONString(response));
            //... Business code, the current request is risky, it is recommended to reject
        } else {
            System.out.printf(JSON.toJSONString(response));
        }

    }


}
