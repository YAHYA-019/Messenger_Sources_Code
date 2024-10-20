package com.facebook.payments.logging;

import X.C0e1;
import X.GEP;

/* loaded from: PaymentsFlowName.class */
public enum PaymentsFlowName implements GEP {
    AD("ad"),
    CHECKOUT("checkout"),
    DCP("dcp"),
    INVOICE("invoice"),
    OCULUS("oculus"),
    PAYMENT_SETTINGS("payment_settings"),
    PAYOUT_SETUP("payout_setup"),
    TOP_UP("top_up"),
    P2P("p2p"),
    P2P_SEND_OR_REQUEST("send_or_request"),
    P2P_RECEIVE("receive"),
    EVENT_TICKETING("event_ticketing"),
    FBPAY_HUB("fbpay_hub"),
    /* JADX INFO: Fake field, exist only in values array */
    IAB_AUTOFILL("iab_autofill");

    public String mValue;

    PaymentsFlowName(String str) {
        this.mValue = str;
    }

    public static PaymentsFlowName forValue(String str) {
        Object obj = CHECKOUT;
        Object A002 = C0e1.A00(PaymentsFlowName.class, str);
        if (A002 != null) {
            obj = A002;
        }
        return (PaymentsFlowName) obj;
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
