package com.facebook.graphql.enums;

import X.1BK;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLPostAttachmentType.class */
public final class GraphQLPostAttachmentType {
    public static final /* synthetic */ GraphQLPostAttachmentType[] A00;
    public static final GraphQLPostAttachmentType A01;
    public final String serverValue;

    static {
        GraphQLPostAttachmentType graphQLPostAttachmentType = new GraphQLPostAttachmentType("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A01 = graphQLPostAttachmentType;
        GraphQLPostAttachmentType graphQLPostAttachmentType2 = new GraphQLPostAttachmentType("ACHIEVEMENT_DATA", 1, "ACHIEVEMENT_DATA");
        GraphQLPostAttachmentType graphQLPostAttachmentType3 = new GraphQLPostAttachmentType("BRAND_LED_GROUPS_EXCLUSIVE_PRODUCT", 2, "BRAND_LED_GROUPS_EXCLUSIVE_PRODUCT");
        GraphQLPostAttachmentType graphQLPostAttachmentType4 = new GraphQLPostAttachmentType("CANVAS_POST", 3, "CANVAS_POST");
        GraphQLPostAttachmentType graphQLPostAttachmentType5 = new GraphQLPostAttachmentType("CHALLENGE_FINAL_ACHIEVEMENT", 4, "CHALLENGE_FINAL_ACHIEVEMENT");
        GraphQLPostAttachmentType graphQLPostAttachmentType6 = new GraphQLPostAttachmentType("DOC", 5, "DOC");
        GraphQLPostAttachmentType graphQLPostAttachmentType7 = new GraphQLPostAttachmentType("FB_COLLECTIBLE", 6, "FB_COLLECTIBLE");
        GraphQLPostAttachmentType graphQLPostAttachmentType8 = new GraphQLPostAttachmentType("FILE", 7, "FILE");
        GraphQLPostAttachmentType graphQLPostAttachmentType9 = new GraphQLPostAttachmentType("FISHBOWL", 8, "FISHBOWL");
        GraphQLPostAttachmentType graphQLPostAttachmentType10 = new GraphQLPostAttachmentType("GRATITUDE_METADATA", 9, "GRATITUDE_METADATA");
        GraphQLPostAttachmentType graphQLPostAttachmentType11 = new GraphQLPostAttachmentType("JOB_OPENING", 10, "JOB_OPENING");
        GraphQLPostAttachmentType graphQLPostAttachmentType12 = new GraphQLPostAttachmentType("LEARNING_MODULE", 11, "LEARNING_MODULE");
        GraphQLPostAttachmentType graphQLPostAttachmentType13 = new GraphQLPostAttachmentType("LEARNING_QUIZ", 12, "LEARNING_QUIZ");
        GraphQLPostAttachmentType graphQLPostAttachmentType14 = new GraphQLPostAttachmentType("LIFE_EVENT", 13, "LIFE_EVENT");
        GraphQLPostAttachmentType graphQLPostAttachmentType15 = new GraphQLPostAttachmentType("MULTIMEDIA", 14, "MULTIMEDIA");
        GraphQLPostAttachmentType graphQLPostAttachmentType16 = new GraphQLPostAttachmentType("MULTI_PHOTO", 15, "MULTI_PHOTO");
        GraphQLPostAttachmentType graphQLPostAttachmentType17 = new GraphQLPostAttachmentType("MULTI_SHARES", 16, "MULTI_SHARES");
        GraphQLPostAttachmentType graphQLPostAttachmentType18 = new GraphQLPostAttachmentType("NEON_CREATE_DATA", 17, "NEON_CREATE_DATA");
        GraphQLPostAttachmentType graphQLPostAttachmentType19 = new GraphQLPostAttachmentType("NOTE", 18, "NOTE");
        GraphQLPostAttachmentType graphQLPostAttachmentType20 = new GraphQLPostAttachmentType("OFFER", 19, "OFFER");
        GraphQLPostAttachmentType graphQLPostAttachmentType21 = new GraphQLPostAttachmentType("OFFER_DATA", 20, "OFFER_DATA");
        GraphQLPostAttachmentType graphQLPostAttachmentType22 = new GraphQLPostAttachmentType("PHOTO_SET", 21, "PHOTO_SET");
        GraphQLPostAttachmentType graphQLPostAttachmentType23 = new GraphQLPostAttachmentType("PRODUCT_ITEM", 22, "PRODUCT_ITEM");
        GraphQLPostAttachmentType graphQLPostAttachmentType24 = new GraphQLPostAttachmentType("QUESTION", 23, "QUESTION");
        GraphQLPostAttachmentType graphQLPostAttachmentType25 = new GraphQLPostAttachmentType("SINGLE_PHOTO", 24, "SINGLE_PHOTO");
        GraphQLPostAttachmentType graphQLPostAttachmentType26 = new GraphQLPostAttachmentType("SINGLE_SHARE", 25, "SINGLE_SHARE");
        GraphQLPostAttachmentType graphQLPostAttachmentType27 = new GraphQLPostAttachmentType("SINGLE_VIDEO", 26, "SINGLE_VIDEO");
        GraphQLPostAttachmentType[] graphQLPostAttachmentTypeArr = new GraphQLPostAttachmentType[29];
        System.arraycopy(new GraphQLPostAttachmentType[]{new GraphQLPostAttachmentType("TEXT_ONLY", 27, "TEXT_ONLY"), new GraphQLPostAttachmentType(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 28, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID)}, 1BK.A1W(new GraphQLPostAttachmentType[]{graphQLPostAttachmentType, graphQLPostAttachmentType2, graphQLPostAttachmentType3, graphQLPostAttachmentType4, graphQLPostAttachmentType5, graphQLPostAttachmentType6, graphQLPostAttachmentType7, graphQLPostAttachmentType8, graphQLPostAttachmentType9, graphQLPostAttachmentType10, graphQLPostAttachmentType11, graphQLPostAttachmentType12, graphQLPostAttachmentType13, graphQLPostAttachmentType14, graphQLPostAttachmentType15, graphQLPostAttachmentType16, graphQLPostAttachmentType17, graphQLPostAttachmentType18, graphQLPostAttachmentType19, graphQLPostAttachmentType20, graphQLPostAttachmentType21, graphQLPostAttachmentType22, graphQLPostAttachmentType23, graphQLPostAttachmentType24, graphQLPostAttachmentType25, graphQLPostAttachmentType26, graphQLPostAttachmentType27}, graphQLPostAttachmentTypeArr) ? 1 : 0, graphQLPostAttachmentTypeArr, 27, 2);
        A00 = graphQLPostAttachmentTypeArr;
    }

    public GraphQLPostAttachmentType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLPostAttachmentType valueOf(String str) {
        return (GraphQLPostAttachmentType) Enum.valueOf(GraphQLPostAttachmentType.class, str);
    }

    public static GraphQLPostAttachmentType[] values() {
        return (GraphQLPostAttachmentType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
