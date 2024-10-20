package com.facebook.graphql.enums;

/* loaded from: GraphQLPaymentModulesClient.class */
public enum GraphQLPaymentModulesClient {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    ADVERTISER_SUBSCRIPTION("ADVERTISER_SUBSCRIPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    BUSINESS_PLATFORM_COMMERCE("BUSINESS_PLATFORM_COMMERCE"),
    /* JADX INFO: Fake field, exist only in values array */
    C2C_CHECKOUT_EXPERIENCES("C2C_CHECKOUT_EXPERIENCES"),
    /* JADX INFO: Fake field, exist only in values array */
    CHECKOUT_EXPERIENCES("CHECKOUT_EXPERIENCES"),
    /* JADX INFO: Fake field, exist only in values array */
    DONATION_P4C("DONATION_P4C"),
    /* JADX INFO: Fake field, exist only in values array */
    DONATION_P4P("DONATION_P4P"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTANT_EXPERIENCES("INSTANT_EXPERIENCES"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGING_COMMERCE("MESSAGING_COMMERCE"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_OMNIM("MESSENGER_OMNIM"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER_PLATFORM("MESSENGER_PLATFORM"),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_TOP_UP("MOBILE_TOP_UP"),
    /* JADX INFO: Fake field, exist only in values array */
    MOCK("MOCK"),
    /* JADX INFO: Fake field, exist only in values array */
    MOR_DONATIONS("MOR_DONATIONS"),
    /* JADX INFO: Fake field, exist only in values array */
    NMOR_FB_BROWSER_PAY("NMOR_FB_BROWSER_PAY"),
    /* JADX INFO: Fake field, exist only in values array */
    P2M_MESSENGER("P2M_MESSENGER"),
    /* JADX INFO: Fake field, exist only in values array */
    PAGES_COMMERCE("PAGES_COMMERCE"),
    /* JADX INFO: Fake field, exist only in values array */
    PAGES_SOLUTION("PAGES_SOLUTION"),
    /* JADX INFO: Fake field, exist only in values array */
    PPGF_DONATION("PPGF_DONATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SHIPPING_LABEL("SHIPPING_LABEL"),
    /* JADX INFO: Fake field, exist only in values array */
    SYNCHRONOUS_COMPONENT_FLOW("SYNCHRONOUS_COMPONENT_FLOW");

    public final String serverValue;

    GraphQLPaymentModulesClient(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
