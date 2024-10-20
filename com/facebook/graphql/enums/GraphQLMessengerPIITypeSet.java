package com.facebook.graphql.enums;

import X.02H;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLMessengerPIITypeSet.class */
public final class GraphQLMessengerPIITypeSet {
    public static final HashSet A00 = 02H.A00(new String[]{"ADDRESS", "DATE", PaymentDetailChangeTypes$Companion.EMAIL, "MULTI_CHOICE", "NUMBER", "PAYMENT_CARD", PaymentDetailChangeTypes$Companion.PHONE_NUMBER, "TEXT"});

    public static final Set getSet() {
        return A00;
    }
}
