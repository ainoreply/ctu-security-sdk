/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
 */

package com.aisecurius.ctu.client.model;


import java.util.Map;

/**
 * @FileName: CtuEntireResult.java
 * @Description: CtuEntireResult.java
 * @Author: yangyang.liu
 * @Date: 2018/6/11 19:21
 */

public class CtuEntireResult extends CtuResult {
    public CtuEntireResult(){}
    public CtuEntireResult(RiskLevel riskLevel) {
        super.setRiskLevel(riskLevel);
    }
    // key: strategy name, value: the total score of the strategy
    private Map<String, Double> policyScore;

    // key: the name and code object of the list service; value: {key: the key returned by the third party (not the value on the left side of the rule we set); value: the value}
    private Map<String, Map<String, Object>> nameListField;

    public Map<String, Double> getPolicyScore() {
        return policyScore;
    }


    public void setPolicyScore(Map<String, Double> policyScore) {
        this.policyScore = policyScore;
    }

    public Map<String, Map<String, Object>> getNameListField() {
        return nameListField;
    }

    public void setNameListField(Map<String, Map<String, Object>> nameListField) {
        this.nameListField = nameListField;
    }
}
