package com.facebook.graphql.enums;

import X.DKG;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLServicesAppointmentDetailsDisplayKeySet.class */
public final class GraphQLServicesAppointmentDetailsDisplayKeySet {
    public static final HashSet A00 = DKG.A1B("ADMIN_PRIVATE_NOTES", "DESCRIPTION", PaymentDetailChangeTypes$Companion.EMAIL, PaymentDetailChangeTypes$Companion.PHONE_NUMBER, "SPECIAL_REQUEST");

    public static final Set getSet() {
        return A00;
    }
}
