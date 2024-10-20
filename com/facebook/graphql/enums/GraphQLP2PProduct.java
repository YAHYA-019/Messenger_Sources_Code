package com.facebook.graphql.enums;

/* loaded from: GraphQLP2PProduct.class */
public enum GraphQLP2PProduct {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_US("FB"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_US("FR"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_US("GB"),
    /* JADX INFO: Fake field, exist only in values array */
    IG_US("IG_US"),
    MFS_PE("MFS_PE"),
    MFS_PH("MFS_PH"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    PL("PL"),
    /* JADX INFO: Fake field, exist only in values array */
    TH("TH"),
    /* JADX INFO: Fake field, exist only in values array */
    US("US"),
    /* JADX INFO: Fake field, exist only in values array */
    VN("VN");

    public final String serverValue;

    GraphQLP2PProduct(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
