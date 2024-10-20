package com.facebook.graphql.enums;

import X.1BK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLCameraPostNotificationType.class */
public final class GraphQLCameraPostNotificationType {
    public static final /* synthetic */ GraphQLCameraPostNotificationType[] A00;
    public static final GraphQLCameraPostNotificationType A01;
    public final String serverValue;

    static {
        GraphQLCameraPostNotificationType A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        GraphQLCameraPostNotificationType A003 = A00("CHANNEL_STORY_APPROVED", 1);
        GraphQLCameraPostNotificationType A004 = A00("COMMENT", 2);
        GraphQLCameraPostNotificationType A005 = A00("COMMENT_NOTIF_FOR_REACTORS", 3);
        GraphQLCameraPostNotificationType A006 = A00("CROSSPOSTING_FAILURE", 4);
        GraphQLCameraPostNotificationType A007 = A00("EXPIRY", 5);
        GraphQLCameraPostNotificationType A008 = A00("FB_NOTES_BFF_CREATION", 6);
        GraphQLCameraPostNotificationType A009 = A00("FB_NOTES_REACTION", 7);
        GraphQLCameraPostNotificationType A0010 = A00("FEEDBACK_GIVEN", 8);
        GraphQLCameraPostNotificationType A0011 = A00("FINAL_REPORT", 9);
        GraphQLCameraPostNotificationType A0012 = A00("HIGH_COEFFICIENT_SAW_POST", 10);
        GraphQLCameraPostNotificationType A0013 = A00("NEW_BIRTHDAY_STORY_POST", 11);
        GraphQLCameraPostNotificationType A0014 = A00("NEW_BIRTHDAY_STORY_POSTED_CELEBRATOR_ALERT", 12);
        GraphQLCameraPostNotificationType A0015 = A00("NEW_EVENT_STORY_POST_FOR_REVIEW", 13);
        GraphQLCameraPostNotificationType A0016 = A00("NEW_HIGH_COEFFICIENT_EVENT_STORY_POST", 14);
        GraphQLCameraPostNotificationType A0017 = A00("NEW_HIGH_COEFFICIENT_POST", 15);
        GraphQLCameraPostNotificationType A0018 = A00("NEW_POST", 16);
        GraphQLCameraPostNotificationType A0019 = A00("PAGE_RESHARE_STORY_REPLY", 17);
        GraphQLCameraPostNotificationType A0020 = A00("PAGE_STORIES_CARD_SHARE", 18);
        GraphQLCameraPostNotificationType A0021 = A00("PAGE_STORIES_CARD_SHARE_REACT", 19);
        GraphQLCameraPostNotificationType A0022 = A00("PAGE_STORY_FINAL_REPORT", 20);
        GraphQLCameraPostNotificationType A0023 = A00("PAGE_STORY_NEW_STORY_REPLY", 21);
        GraphQLCameraPostNotificationType A0024 = A00("POPULAR_UNCONNECTED_STORY", 22);
        GraphQLCameraPostNotificationType A0025 = A00("PREDICTION_STORY_POSTED", 23);
        GraphQLCameraPostNotificationType A0026 = A00("PREDICTION_STORY_RESULTS", 24);
        GraphQLCameraPostNotificationType A0027 = A00("PRODUCER_COMMENT_RESPONSE", 25);
        GraphQLCameraPostNotificationType A0028 = A00("REPLY", 26);
        GraphQLCameraPostNotificationType[] graphQLCameraPostNotificationTypeArr = new GraphQLCameraPostNotificationType[35];
        System.arraycopy(new GraphQLCameraPostNotificationType[]{A00("REQUESTED_STORIES_POSTED", 27), A00("RESHARE_TO_STORY", 28), A00("STORY_CHANNEL_INVITATION", 29), A00("STORY_POSTED_EXPIRING_SOON", 30), A00("STORY_POSTED_WITHOUT_COMMENTS_DELAY", 31), A00("TAGGED_WITH_STORY", 32), A00("TRENDING_STORY", 33), A00("TRENDING_STORY_PF_NOTIFS", 34)}, 1BK.A1W(new GraphQLCameraPostNotificationType[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLCameraPostNotificationTypeArr) ? 1 : 0, graphQLCameraPostNotificationTypeArr, 27, 8);
        A00 = graphQLCameraPostNotificationTypeArr;
    }

    public GraphQLCameraPostNotificationType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLCameraPostNotificationType A00(String str, int i) {
        return new GraphQLCameraPostNotificationType(str, i, str);
    }

    public static GraphQLCameraPostNotificationType valueOf(String str) {
        return (GraphQLCameraPostNotificationType) Enum.valueOf(GraphQLCameraPostNotificationType.class, str);
    }

    public static GraphQLCameraPostNotificationType[] values() {
        return (GraphQLCameraPostNotificationType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
