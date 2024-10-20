package com.facebook.graphql.enums;

import X.1BK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLGroupsSectionHeaderType.class */
public final class GraphQLGroupsSectionHeaderType {
    public static final /* synthetic */ GraphQLGroupsSectionHeaderType[] A00;
    public static final GraphQLGroupsSectionHeaderType A01;
    public final String serverValue;

    static {
        GraphQLGroupsSectionHeaderType A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        GraphQLGroupsSectionHeaderType A003 = A00("FOR_SALE_RANKED_LISTINGS", 1);
        GraphQLGroupsSectionHeaderType A004 = A00("FOR_SALE_RANKED_POSTS", 2);
        GraphQLGroupsSectionHeaderType A005 = A00("GROUP_BUNDLES_GIFR_RELATED_POSTS", 3);
        GraphQLGroupsSectionHeaderType A006 = A00("GROUP_BUNDLES_RELATED_GROUPS", 4);
        GraphQLGroupsSectionHeaderType A007 = A00("HIGHLIGHTS", 5);
        GraphQLGroupsSectionHeaderType A008 = A00("LESSON_COMPLETE", 6);
        GraphQLGroupsSectionHeaderType A009 = A00("LISTING", 7);
        GraphQLGroupsSectionHeaderType A0010 = A00("LOW_ENGAGEMENT_POSTS", 8);
        GraphQLGroupsSectionHeaderType A0011 = A00("MEDIA_POSTS", 9);
        GraphQLGroupsSectionHeaderType A0012 = A00("MEMBER_BIO_POSTS", 10);
        GraphQLGroupsSectionHeaderType A0013 = A00("MORE_FROM_GROUPS", 11);
        GraphQLGroupsSectionHeaderType A0014 = A00("MOST_POPULAR", 12);
        GraphQLGroupsSectionHeaderType A0015 = A00("NEARBY_LISTINGS", 13);
        GraphQLGroupsSectionHeaderType A0016 = A00("NEW_LISTINGS", 14);
        GraphQLGroupsSectionHeaderType A0017 = A00("NEW_POSTS", 15);
        GraphQLGroupsSectionHeaderType A0018 = A00("NOTIFICATIONS", 16);
        GraphQLGroupsSectionHeaderType A0019 = A00("OLDER_POSTS", 17);
        GraphQLGroupsSectionHeaderType A0020 = A00("OTHER_MEMBERS", 18);
        GraphQLGroupsSectionHeaderType A0021 = A00("PHOTO_POSTS", 19);
        GraphQLGroupsSectionHeaderType A0022 = A00("PINNED_POST_HEADER", 20);
        GraphQLGroupsSectionHeaderType A0023 = A00("RANKED_POSTS", 21);
        GraphQLGroupsSectionHeaderType A0024 = A00("RECENTLY_SEEN", 22);
        GraphQLGroupsSectionHeaderType A0025 = A00("RECENT_ACTIVITY", 23);
        GraphQLGroupsSectionHeaderType A0026 = A00("RECENT_LISTING_ACTIVITY", 24);
        GraphQLGroupsSectionHeaderType A0027 = A00("RECENT_PHOTOS", 25);
        GraphQLGroupsSectionHeaderType A0028 = A00("SHARED_GROUP_POST", 26);
        GraphQLGroupsSectionHeaderType[] graphQLGroupsSectionHeaderTypeArr = new GraphQLGroupsSectionHeaderType[35];
        System.arraycopy(new GraphQLGroupsSectionHeaderType[]{A00("SHARED_GROUP_POST_FROM_MSGR", 27), A00("SUGGESTED_POST", 28), A00("TOP_DISCUSSIONS", 29), A00("TOP_POSTS", 30), A00("VIDEO_POSTS", 31), A00("WHALE_GROUP_TOP_POST", 32), A00("YOUR_GROUPS_FEED", 33), A00("YOUR_NEW_GROUP", 34)}, 1BK.A1W(new GraphQLGroupsSectionHeaderType[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLGroupsSectionHeaderTypeArr) ? 1 : 0, graphQLGroupsSectionHeaderTypeArr, 27, 8);
        A00 = graphQLGroupsSectionHeaderTypeArr;
    }

    public GraphQLGroupsSectionHeaderType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLGroupsSectionHeaderType A00(String str, int i) {
        return new GraphQLGroupsSectionHeaderType(str, i, str);
    }

    public static GraphQLGroupsSectionHeaderType valueOf(String str) {
        return (GraphQLGroupsSectionHeaderType) Enum.valueOf(GraphQLGroupsSectionHeaderType.class, str);
    }

    public static GraphQLGroupsSectionHeaderType[] values() {
        return (GraphQLGroupsSectionHeaderType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
