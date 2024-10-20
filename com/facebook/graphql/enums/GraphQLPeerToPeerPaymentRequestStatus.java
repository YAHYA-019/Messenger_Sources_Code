package com.facebook.graphql.enums;

/* loaded from: GraphQLPeerToPeerPaymentRequestStatus.class */
public enum GraphQLPeerToPeerPaymentRequestStatus {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    CANCELED("CANCELED"),
    DECLINED("DECLINED"),
    /* JADX INFO: Fake field, exist only in values array */
    MANUALLY_MARKED_AS_COMPLETED("EXPIRED"),
    INITED("INITED"),
    /* JADX INFO: Fake field, exist only in values array */
    MANUALLY_MARKED_AS_COMPLETED("MANUALLY_MARKED_AS_COMPLETED"),
    TRANSFER_COMPLETED("TRANSFER_COMPLETED"),
    TRANSFER_FAILED("TRANSFER_FAILED"),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSFER_INITED("TRANSFER_INITED");

    public final String serverValue;

    GraphQLPeerToPeerPaymentRequestStatus(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
