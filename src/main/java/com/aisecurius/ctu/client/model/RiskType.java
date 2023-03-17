/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
 */

package com.aisecurius.ctu.client.model;

/**
 * Created by aisecurius on 2017/5/23.
 */
public enum RiskType {
    RUBBISH_REGISTRATION("garbage registration"),
    ACCOUNT_STOLEN("Account Stealing"),
    MACHINE_CRAWLING("Machine crawling"),
    BATCH_LOGON("Batch login"),
    MALICIOUS_GRAB("Scalper Grab Order"),
    UNKNWON("Undefined");

    private String description;

    private RiskType(String description) {
        this.description = description;
    }

    public static RiskType fromString(String riskCode) {
        for (RiskType rt : RiskType.values()) {
            if (rt.name().equalsIgnoreCase(riskCode)) {
                return rt;
            }
        }

        throw new IllegalArgumentException("No RiskType : " + riskCode + " found.");
    }

}
