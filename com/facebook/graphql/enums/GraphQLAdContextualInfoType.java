package com.facebook.graphql.enums;

import X.1BK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLAdContextualInfoType.class */
public final class GraphQLAdContextualInfoType {
    public static final /* synthetic */ GraphQLAdContextualInfoType[] A00;
    public static final GraphQLAdContextualInfoType A01;
    public final String serverValue;

    static {
        GraphQLAdContextualInfoType A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        GraphQLAdContextualInfoType A003 = A00("ACCOUNT_FOLLOWER", 1);
        GraphQLAdContextualInfoType A004 = A00("AD_CLICKS", 2);
        GraphQLAdContextualInfoType A005 = A00("AD_VIEWS", 3);
        GraphQLAdContextualInfoType A006 = A00("APP_AWARDS", 4);
        GraphQLAdContextualInfoType A007 = A00("APP_CATEGORY_RANK", 5);
        GraphQLAdContextualInfoType A008 = A00("APP_DOWNLOADS", 6);
        GraphQLAdContextualInfoType A009 = A00("APP_RATING", 7);
        GraphQLAdContextualInfoType A0010 = A00("CUSTOMER_SERVICE", 8);
        GraphQLAdContextualInfoType A0011 = A00("DESTINATION_URL", 9);
        GraphQLAdContextualInfoType A0012 = A00("DISCOUNTS", 10);
        GraphQLAdContextualInfoType A0013 = A00("FREE_FORM_LONG_TEXT", 11);
        GraphQLAdContextualInfoType A0014 = A00("FREE_FORM_TEXT", 12);
        GraphQLAdContextualInfoType A0015 = A00("LOCATION", 13);
        GraphQLAdContextualInfoType A0016 = A00("MUSIC", 14);
        GraphQLAdContextualInfoType A0017 = A00("OPENING_HOURS", 15);
        GraphQLAdContextualInfoType A0018 = A00("PAGE_CATEGORY", 16);
        GraphQLAdContextualInfoType A0019 = A00("PAGE_CHECKINS", 17);
        GraphQLAdContextualInfoType A0020 = A00("PAGE_DESCRIPTION", 18);
        GraphQLAdContextualInfoType A0021 = A00("PAGE_FOLLOW", 19);
        GraphQLAdContextualInfoType A0022 = A00("PAGE_FOLLOW_WITH_SOCIAL_CONTEXT", 20);
        GraphQLAdContextualInfoType A0023 = A00("PAGE_LIKES", 21);
        GraphQLAdContextualInfoType A0024 = A00("PAGE_LIKES_WITH_SOCIAL_CONTEXT", 22);
        GraphQLAdContextualInfoType A0025 = A00("PAGE_PRICE_RANGE", 23);
        GraphQLAdContextualInfoType A0026 = A00("PAGE_RATING", 24);
        GraphQLAdContextualInfoType A0027 = A00("PAGE_RECENT_CHECKINS", 25);
        GraphQLAdContextualInfoType A0028 = A00("PAGE_RECOMMENDATION_TAGS", 26);
        GraphQLAdContextualInfoType[] graphQLAdContextualInfoTypeArr = new GraphQLAdContextualInfoType[38];
        System.arraycopy(new GraphQLAdContextualInfoType[]{A00("PAGE_SELLER_ORDER_COUNT", 27), A00("PAGE_SELLER_RATING_AND_REVIEWS", 28), A00("PAYMENT_OPTIONS", 29), A00("PROMO", 30), A00("RANDOM", 31), A00("RESPONSE_TIME", 32), A00("RETURN_POLICY", 33), A00("SHIPPING_POLICY", 34), A00("SITELINKS", 35), A00("SPA_SMALL_BUSINESS", 36), A00("WARRANTY", 37)}, 1BK.A1W(new GraphQLAdContextualInfoType[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLAdContextualInfoTypeArr) ? 1 : 0, graphQLAdContextualInfoTypeArr, 27, 11);
        A00 = graphQLAdContextualInfoTypeArr;
    }

    public GraphQLAdContextualInfoType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLAdContextualInfoType A00(String str, int i) {
        return new GraphQLAdContextualInfoType(str, i, str);
    }

    public static GraphQLAdContextualInfoType valueOf(String str) {
        return (GraphQLAdContextualInfoType) Enum.valueOf(GraphQLAdContextualInfoType.class, str);
    }

    public static GraphQLAdContextualInfoType[] values() {
        return (GraphQLAdContextualInfoType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
