/*
 * Copyright: 2017 aisecurius.com Inc. All rights reserved.
 */

package com.aisecurius.ctu.client.model;

/**
 * Created by aisecurius on 2017/5/5.
 */
public enum CtuResponseStatus {
    SUCCESS("success"),
// HAS_RISK("Safe air defense risk"),

    INVALID_REQUEST_PARAMS("The request is invalid, missing required parameters"),
    INVALID_REQUEST_BODY("The request is invalid, the request body is empty"),
    INVALID_REQUEST_NO_EVENT_DATA("The request is invalid, the data of the request event is empty"),
    INVALID_REQUEST_SIGN("Request signature error"),
    INVALID_APP_KEY("Invalid appId"),
    INVALID_EVENT_CODE("Invalid event"),
    INVALID_APP_EVENT_RELATION("The binding relationship between application and event is wrong"),

    EVENT_GRAY_SCALE("Event has grayscale control, non-grayscale request"),
    NO_POLICY_FOUND("No prevention and control policy found"),
    POLICY_HAS_ERROR("There is an error in the configuration of the prevention and control policy"),
    NOT_SUPPORTED_POLICY_OPERATOR("The operator in the prevention and control policy is not supported"),

    QPS_EXCEEDING_MAXIMUM_THRESHOLD("QPS exceeds the maximum threshold"),
    SERVER_CONNECT_FAILED("Server communication is abnormal"),

    SERVICE_INTERNAL_ERROR("Internal server error"),

    NO_TRUST_IN_NAMELIST("The request for the third-party list is wrong, the result is not credible");

    private String statusDesc;

    private CtuResponseStatus(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String statusDesc() {
        return this.statusDesc;
    }
}
