package com.facebook.graphql.enums;

import X.02H;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLPaymentStepTypeSet.class */
public final class GraphQLPaymentStepTypeSet {
    public static final HashSet A00 = 02H.A00(new String[]{"ADD_PAYMENT_METHOD", "AUTH", "CREATE_PIN", "DECISION", "ENTER_AMOUNT", "FORM", "IDV", "IDV_PENDING", "NUX_INTRO", "PICKER", "PSD_AGREEMENT", "RECEIPT", "SETUP_COMPLETE"});

    public static final Set getSet() {
        return A00;
    }
}
