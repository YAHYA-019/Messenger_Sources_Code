package com.facebook.graphql.enums;

import X.02H;
import X.1BK;
import X.AbI;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLMessengerAdsPartialAutomatedPrefillTypeSet.class */
public final class GraphQLMessengerAdsPartialAutomatedPrefillTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[32];
        AbI.A1W(new String[]{"STATE", "STREET_ADDRESS", "WORK_EMAIL", "WORK_PHONE", "ZIP_CODE"}, 1BK.A1W(new String[]{"CITY", "COMPANY_NAME", "COUNTRY", "DATE_TIME", "DOB", PaymentDetailChangeTypes$Companion.EMAIL, "FIRST_NAME", "FULL_ADDRESS", "FULL_NAME", "GENDER", "JOB_TITLE", "LAST_NAME", "MARITAL_STATUS", "MILITARY_STATUS", "NATIONAL_ID_ARGENTINA", "NATIONAL_ID_BRAZIL", "NATIONAL_ID_CHILE", "NATIONAL_ID_COLOMBIA", "NATIONAL_ID_ECUADOR", "NATIONAL_ID_MEXICO", "NATIONAL_ID_PERU", "NONE", "PHONE", "POST_CODE", "PROVINCE", "RELATIONSHIP_STATUS", "SLIDER"}, strArr) ? 1 : 0, strArr);
        A00 = 02H.A00(strArr);
    }

    public static final Set getSet() {
        return A00;
    }
}
