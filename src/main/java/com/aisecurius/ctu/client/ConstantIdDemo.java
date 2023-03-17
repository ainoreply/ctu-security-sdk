package com.aisecurius.ctu.client;


import com.alibaba.fastjson.JSON;
import com.aisecurius.ctu.client.model.RiskResponse;

import java.io.IOException;

public class ConstantIdDemo {

    private static String appId = "xxxxxxxxx7b2f5afb";
    private static String appSecret = "xxxxxxxxxxdedebaa2836";

    public static void main(String[] args) throws IOException {
        // Fill in the device fingerprint domain name or url such as: http://127.0.0.1:8080
        CtuConstidClient client = new CtuConstidClient("https://constid.aisecurius.com", appId, appSecret, 10000, 10000, 10000);
//        String result = client.getDeviceInfo("62c402d2Wpj8UaSbWlr0lBY1R50GKJ5xAYeN6IM3");
        //        System.out.println(JSON.toJSON(result));

        RiskResponse riskInfo = client.getRiskInfo("1", "xxxxxxxxxxxx", null);
        System.out.println(JSON.toJSONString(riskInfo));
    }

}
