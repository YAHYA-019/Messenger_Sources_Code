package com.facebook.graphql.enums;

import X.1BK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLPageAutomationTrigger.class */
public final class GraphQLPageAutomationTrigger {
    public static final /* synthetic */ GraphQLPageAutomationTrigger[] A00;
    public static final GraphQLPageAutomationTrigger A01;
    public static final GraphQLPageAutomationTrigger A02;
    public final String serverValue;

    static {
        GraphQLPageAutomationTrigger A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = A002;
        GraphQLPageAutomationTrigger A003 = A00("APPOINTMENT_FOLLOW_UP", 1);
        GraphQLPageAutomationTrigger A004 = A00("APPOINTMENT_REMINDER", 2);
        GraphQLPageAutomationTrigger A005 = A00("ASSIGN_CONVERSATION", 3);
        GraphQLPageAutomationTrigger A006 = A00("AUTOMATED_CHECKOUT", 4);
        GraphQLPageAutomationTrigger A007 = A00("AUTOMATED_LEAD", 5);
        GraphQLPageAutomationTrigger A008 = A00("AUTOMATED_ORDER", 6);
        GraphQLPageAutomationTrigger A009 = A00("AUTO_SAVED_REPLY", 7);
        GraphQLPageAutomationTrigger A0010 = A00("AWAY_MESSAGE", 8);
        GraphQLPageAutomationTrigger A0011 = A00("BUYER_INFORMATION_FORM", 9);
        GraphQLPageAutomationTrigger A0012 = A00("CD_SHIPPING_UPDATES", 10);
        GraphQLPageAutomationTrigger A0013 = A00("COMMENT_TO_INBOX", 11);
        GraphQLPageAutomationTrigger A0014 = A00("CRM_REENGAGEMENT", 12);
        GraphQLPageAutomationTrigger A0015 = A00("CUSTOM_AUTOMATION", 13);
        GraphQLPageAutomationTrigger A0016 = A00("CUSTOM_QUESTIONS", 14);
        A01 = A0016;
        GraphQLPageAutomationTrigger A0017 = A00("FOLLOWUP_QUESTION", 15);
        GraphQLPageAutomationTrigger A0018 = A00("FUNDRAISER_CREATED", 16);
        GraphQLPageAutomationTrigger A0019 = A00("FUNDRAISER_DONATION", 17);
        GraphQLPageAutomationTrigger A0020 = A00("ICEBREAKER", 18);
        GraphQLPageAutomationTrigger A0021 = A00("INSTANT_REPLY", 19);
        GraphQLPageAutomationTrigger A0022 = A00("JOB_APPLICATION", 20);
        GraphQLPageAutomationTrigger A0023 = A00("KEYWORD_AUTOMATION", 21);
        GraphQLPageAutomationTrigger A0024 = A00("KEYWORD_DETECTION_FOR_MARKETING_OPT_IN", 22);
        GraphQLPageAutomationTrigger A0025 = A00("MM_STALE_THREAD_SEND_FOLLOW_UP", 23);
        GraphQLPageAutomationTrigger A0026 = A00("NEGATIVE_RECOMMENDATION", 24);
        GraphQLPageAutomationTrigger A0027 = A00("NOT_RESPONDED", 25);
        GraphQLPageAutomationTrigger A0028 = A00("ORDER_CREATION", 26);
        GraphQLPageAutomationTrigger[] graphQLPageAutomationTriggerArr = new GraphQLPageAutomationTrigger[40];
        System.arraycopy(new GraphQLPageAutomationTrigger[]{A00("ORGANIC_INTAKE_FORM", 27), A00("PAYMENT_CONFIRMATION", 28), A00("PLACEHOLDER_FOR_LOGGING", 29), A00("POSITIVE_RECOMMENDATION", 30), A00("PRIORITY_INBOX", 31), A00("SAVED_REPLY", 32), A00("SHIPMENT_CONFIRMATION", 33), A00("SMART_REPLY_CONTACT", 34), A00("SMART_REPLY_HOURS", 35), A00("SMART_REPLY_LOCATION", 36), A00("SMART_REPLY_NEGATIVE_FEEDBACK", 37), A00("SMART_REPLY_POSITIVE_FEEDBACK", 38), A00("WELCOME_MESSAGE", 39)}, 1BK.A1W(new GraphQLPageAutomationTrigger[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLPageAutomationTriggerArr) ? 1 : 0, graphQLPageAutomationTriggerArr, 27, 13);
        A00 = graphQLPageAutomationTriggerArr;
    }

    public GraphQLPageAutomationTrigger(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLPageAutomationTrigger A00(String str, int i) {
        return new GraphQLPageAutomationTrigger(str, i, str);
    }

    public static GraphQLPageAutomationTrigger valueOf(String str) {
        return (GraphQLPageAutomationTrigger) Enum.valueOf(GraphQLPageAutomationTrigger.class, str);
    }

    public static GraphQLPageAutomationTrigger[] values() {
        return (GraphQLPageAutomationTrigger[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
