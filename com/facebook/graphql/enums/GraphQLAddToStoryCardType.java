package com.facebook.graphql.enums;

import X.1BK;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLAddToStoryCardType.class */
public final class GraphQLAddToStoryCardType {
    public static final /* synthetic */ GraphQLAddToStoryCardType[] A00;
    public static final GraphQLAddToStoryCardType A01;
    public final String serverValue;

    static {
        GraphQLAddToStoryCardType A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        GraphQLAddToStoryCardType A003 = A00("ADD_YOURS", 1);
        GraphQLAddToStoryCardType A004 = A00("ADD_YOURS_HOLIDAYS", 2);
        GraphQLAddToStoryCardType A005 = A00("ADD_YOURS_TEMPLATE", 3);
        GraphQLAddToStoryCardType A006 = A00("AR_GAMES_RECOMMENDATION", 4);
        GraphQLAddToStoryCardType A007 = A00("ATS_TILE", 5);
        GraphQLAddToStoryCardType A008 = A00("CAMERA_ROLL", 6);
        GraphQLAddToStoryCardType A009 = A00("CAMERA_ROLL_MUSIC_COMBINED", 7);
        GraphQLAddToStoryCardType A0010 = A00("CULTURAL_MOMENTS", 8);
        GraphQLAddToStoryCardType A0011 = A00("EFFECT_RECOMMENDATION", 9);
        GraphQLAddToStoryCardType A0012 = A00("EFFECT_TRENDING", 10);
        GraphQLAddToStoryCardType A0013 = A00("FB_NOTES", 11);
        GraphQLAddToStoryCardType A0014 = A00("IG_STORIES_XPOST", 12);
        GraphQLAddToStoryCardType A0015 = A00("MEMORIES", 13);
        GraphQLAddToStoryCardType A0016 = A00("MEMORIES_AI_BACKDROP", 14);
        GraphQLAddToStoryCardType A0017 = A00("MEMORIES_AI_CAPTIONS", 15);
        GraphQLAddToStoryCardType A0018 = A00("MESSENGER_MUSIC_RECOMMENDATION", 16);
        GraphQLAddToStoryCardType A0019 = A00("MUSIC_PMV", 17);
        GraphQLAddToStoryCardType A0020 = A00("MUSIC_RECOMMENDATION", 18);
        GraphQLAddToStoryCardType A0021 = A00("MUSIC_SAVED", 19);
        GraphQLAddToStoryCardType A0022 = A00("MUSIC_TRENDING", 20);
        GraphQLAddToStoryCardType A0023 = A00("NO_MEDIA_AI_BACKDROP", 21);
        GraphQLAddToStoryCardType A0024 = A00("OLD_ATS", 22);
        GraphQLAddToStoryCardType A0025 = A00("PRE_CREATION_ML_EFFECT", 23);
        GraphQLAddToStoryCardType A0026 = A00("READY_MADE_STORY", 24);
        GraphQLAddToStoryCardType A0027 = A00("RECENT_RECAP", 25);
        GraphQLAddToStoryCardType A0028 = A00("RMS_ADV_PRO_PHOTO_DUMPS", 26);
        GraphQLAddToStoryCardType[] graphQLAddToStoryCardTypeArr = new GraphQLAddToStoryCardType[38];
        System.arraycopy(new GraphQLAddToStoryCardType[]{A00("RMS_ADV_PRO_SINGLE_MEDIA", 27), A00("RMS_COLLAGE", 28), A00("RMS_MAGIC_MOST_RECENT", 29), A00("RMS_MEMORIES", 30), A00("RMS_NO_MEDIA", 31), A00("SIF_ATS", 32), A00("STORIES_DRAFT", 33), A00("TAGGED_RESHARE", 34), A00("THEN_AND_NOW", 35), A00("THEN_AND_NOW_STORIES", 36), A00(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 37)}, 1BK.A1W(new GraphQLAddToStoryCardType[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, graphQLAddToStoryCardTypeArr) ? 1 : 0, graphQLAddToStoryCardTypeArr, 27, 11);
        A00 = graphQLAddToStoryCardTypeArr;
    }

    public GraphQLAddToStoryCardType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLAddToStoryCardType A00(String str, int i) {
        return new GraphQLAddToStoryCardType(str, i, str);
    }

    public static GraphQLAddToStoryCardType valueOf(String str) {
        return (GraphQLAddToStoryCardType) Enum.valueOf(GraphQLAddToStoryCardType.class, str);
    }

    public static GraphQLAddToStoryCardType[] values() {
        return (GraphQLAddToStoryCardType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
