package com.wmm.spring.beans;

public class Organziation {
    private String orgId;
    private String orgName;

    public Organziation(String orgId, String orgName) {
        this.orgId = orgId;
        this.orgName = orgName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
