package com.facebook.graphql.enums;

import X.1BK;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLLeadGenInfoField.class */
public final class GraphQLLeadGenInfoField {
    public static final /* synthetic */ GraphQLLeadGenInfoField[] A00;
    public static final GraphQLLeadGenInfoField A01;
    public static final GraphQLLeadGenInfoField A02;
    public static final GraphQLLeadGenInfoField A03;
    public static final GraphQLLeadGenInfoField A04;
    public final String serverValue;

    static {
        GraphQLLeadGenInfoField A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A04 = A002;
        GraphQLLeadGenInfoField A003 = A00("CITY", 1);
        GraphQLLeadGenInfoField A004 = A00("COMPANY_NAME", 2);
        GraphQLLeadGenInfoField A005 = A00("COUNTRY", 3);
        GraphQLLeadGenInfoField A006 = A00("CUSTOM", 4);
        GraphQLLeadGenInfoField A007 = A00("DATE_TIME", 5);
        GraphQLLeadGenInfoField A008 = A00("DOB", 6);
        GraphQLLeadGenInfoField A009 = A00(PaymentDetailChangeTypes$Companion.EMAIL, 7);
        A01 = A009;
        GraphQLLeadGenInfoField A0010 = A00("EMAIL_ALIAS", 8);
        GraphQLLeadGenInfoField A0011 = A00("FACEBOOK_LEAD_ID", 9);
        GraphQLLeadGenInfoField A0012 = A00("FIRST_NAME", 10);
        GraphQLLeadGenInfoField A0013 = A00("FULL_ADDRESS", 11);
        GraphQLLeadGenInfoField A0014 = A00("FULL_NAME", 12);
        GraphQLLeadGenInfoField A0015 = A00("GENDER", 13);
        GraphQLLeadGenInfoField A0016 = A00("ID_AR_DNI", 14);
        GraphQLLeadGenInfoField A0017 = A00("ID_CL_RUT", 15);
        GraphQLLeadGenInfoField A0018 = A00("ID_CO_CC", 16);
        GraphQLLeadGenInfoField A0019 = A00("ID_CPF", 17);
        GraphQLLeadGenInfoField A0020 = A00("ID_EC_CI", 18);
        GraphQLLeadGenInfoField A0021 = A00("ID_MX_RFC", 19);
        GraphQLLeadGenInfoField A0022 = A00("ID_PE_DNI", 20);
        GraphQLLeadGenInfoField A0023 = A00("JOB_TITLE", 21);
        GraphQLLeadGenInfoField A0024 = A00("JOIN_CODE", 22);
        GraphQLLeadGenInfoField A0025 = A00("LAST_NAME", 23);
        GraphQLLeadGenInfoField A0026 = A00("MARITIAL_STATUS", 24);
        GraphQLLeadGenInfoField A0027 = A00("MESSENGER", 25);
        GraphQLLeadGenInfoField A0028 = A00("MILITARY_STATUS", 26);
        GraphQLLeadGenInfoField A0029 = A00("PHONE", 27);
        A02 = A0029;
        GraphQLLeadGenInfoField A0030 = A00("PHONE_OTP", 28);
        GraphQLLeadGenInfoField A0031 = A00("POST_CODE", 29);
        GraphQLLeadGenInfoField A0032 = A00("PROVINCE", 30);
        GraphQLLeadGenInfoField A0033 = A00("RELATIONSHIP_STATUS", 31);
        GraphQLLeadGenInfoField A0034 = A00("SLIDER", 32);
        GraphQLLeadGenInfoField A0035 = A00("STATE", 33);
        GraphQLLeadGenInfoField A0036 = A00("STORE_LOOKUP", 34);
        GraphQLLeadGenInfoField A0037 = A00("STORE_LOOKUP_WITH_TYPEAHEAD", 35);
        GraphQLLeadGenInfoField A0038 = A00("STREET_ADDRESS", 36);
        A03 = A0038;
        GraphQLLeadGenInfoField[] graphQLLeadGenInfoFieldArr = new GraphQLLeadGenInfoField[41];
        System.arraycopy(new GraphQLLeadGenInfoField[]{A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A00("USER_PROVIDED_PHONE_NUMBER", 37), A00("WORK_EMAIL", 38), A00("WORK_PHONE_NUMBER", 39), A00("ZIP", 40)}, 1BK.A1W(new GraphQLLeadGenInfoField[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLLeadGenInfoFieldArr) ? 1 : 0, graphQLLeadGenInfoFieldArr, 27, 14);
        A00 = graphQLLeadGenInfoFieldArr;
    }

    public GraphQLLeadGenInfoField(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLLeadGenInfoField A00(String str, int i) {
        return new GraphQLLeadGenInfoField(str, i, str);
    }

    public static GraphQLLeadGenInfoField valueOf(String str) {
        return (GraphQLLeadGenInfoField) Enum.valueOf(GraphQLLeadGenInfoField.class, str);
    }

    public static GraphQLLeadGenInfoField[] values() {
        return (GraphQLLeadGenInfoField[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
