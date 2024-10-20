package com.facebook.graphql.enums;

import X.DKG;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLPeerToPeerPaymentActionSet.class */
public final class GraphQLPeerToPeerPaymentActionSet {
    public static final HashSet A00 = DKG.A1B("CONFIRM", "NOTIFY", "ONBOARD", "REQUEST", "SEND");

    public static final Set getSet() {
        return A00;
    }
}
