package com.facebook.graphql.enums;

import X.1BK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLUnifiedStoryType.class */
public final class GraphQLUnifiedStoryType {
    public static final /* synthetic */ GraphQLUnifiedStoryType[] A00;
    public static final GraphQLUnifiedStoryType A01;
    public final String serverValue;

    static {
        GraphQLUnifiedStoryType graphQLUnifiedStoryType = new GraphQLUnifiedStoryType("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A01 = graphQLUnifiedStoryType;
        GraphQLUnifiedStoryType graphQLUnifiedStoryType2 = new GraphQLUnifiedStoryType("ADMINED_ADDITIONAL_PROFILE", 1, "ADMINED_ADDITIONAL_PROFILE");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType3 = new GraphQLUnifiedStoryType("AGGREGATED_BIRTHDAY", 2, "AGGREGATED_BIRTHDAY");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType4 = new GraphQLUnifiedStoryType("ARCHIVED", 3, "ARCHIVED");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType5 = new GraphQLUnifiedStoryType("BIRTHDAY", 4, "BIRTHDAY");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType6 = new GraphQLUnifiedStoryType("BUCKET_LEVEL_FEEDBACK", 5, "BUCKET_LEVEL_FEEDBACK");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType7 = new GraphQLUnifiedStoryType("CHANNEL", 6, "CHANNEL");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType8 = new GraphQLUnifiedStoryType("CONTACT_IMPORTER", 7, "CONTACT_IMPORTER");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType9 = new GraphQLUnifiedStoryType("CONVERSATION_STARTER", 8, "CONVERSATION_STARTER");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType10 = new GraphQLUnifiedStoryType("EVENT", 9, "EVENT");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType11 = new GraphQLUnifiedStoryType("FRIENDVERSARY", 10, "FRIENDVERSARY");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType12 = new GraphQLUnifiedStoryType("FRIEND_REQUEST", 11, "FRIEND_REQUEST");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType13 = new GraphQLUnifiedStoryType("GOODWILL", 12, "GOODWILL");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType14 = new GraphQLUnifiedStoryType("GROUP", 13, "GROUP");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType15 = new GraphQLUnifiedStoryType("HIGHLIGHT", 14, "HIGHLIGHT");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType16 = new GraphQLUnifiedStoryType("INSTAGRAM", 15, "INSTAGRAM");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType17 = new GraphQLUnifiedStoryType("LOCAL_EVENT_RSVP", 16, "LOCAL_EVENT_RSVP");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType18 = new GraphQLUnifiedStoryType("LOCAL_TRENDING_EVENTS", 17, "LOCAL_TRENDING_EVENTS");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType19 = new GraphQLUnifiedStoryType("MEMORIES", 18, "MEMORIES");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType20 = new GraphQLUnifiedStoryType("MESSENGER_THREAD", 19, "MESSENGER_THREAD");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType21 = new GraphQLUnifiedStoryType("MOMENTS", 20, "MOMENTS");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType22 = new GraphQLUnifiedStoryType("MULTI_AUTHOR", 21, "MULTI_AUTHOR");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType23 = new GraphQLUnifiedStoryType("NEWSFEED", 22, "NEWSFEED");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType24 = new GraphQLUnifiedStoryType("NEW_FRIENDSHIP", 23, "NEW_FRIENDSHIP");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType25 = new GraphQLUnifiedStoryType("PAGE", 24, "PAGE");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType26 = new GraphQLUnifiedStoryType("PRODUCTION_POG", 25, "PRODUCTION_POG");
        GraphQLUnifiedStoryType graphQLUnifiedStoryType27 = new GraphQLUnifiedStoryType("PYMK", 26, "PYMK");
        GraphQLUnifiedStoryType[] graphQLUnifiedStoryTypeArr = new GraphQLUnifiedStoryType[31];
        System.arraycopy(new GraphQLUnifiedStoryType[]{new GraphQLUnifiedStoryType("PYMK_PROFILE_FORWARD", 27, "PYMK_PROFILE_FORWARD"), new GraphQLUnifiedStoryType("SCHOOL_COMMUNITY", 28, "SCHOOL_COMMUNITY"), new GraphQLUnifiedStoryType("TOPIC", 29, "TOPIC"), new GraphQLUnifiedStoryType("USER", 30, "USER")}, 1BK.A1W(new GraphQLUnifiedStoryType[]{graphQLUnifiedStoryType, graphQLUnifiedStoryType2, graphQLUnifiedStoryType3, graphQLUnifiedStoryType4, graphQLUnifiedStoryType5, graphQLUnifiedStoryType6, graphQLUnifiedStoryType7, graphQLUnifiedStoryType8, graphQLUnifiedStoryType9, graphQLUnifiedStoryType10, graphQLUnifiedStoryType11, graphQLUnifiedStoryType12, graphQLUnifiedStoryType13, graphQLUnifiedStoryType14, graphQLUnifiedStoryType15, graphQLUnifiedStoryType16, graphQLUnifiedStoryType17, graphQLUnifiedStoryType18, graphQLUnifiedStoryType19, graphQLUnifiedStoryType20, graphQLUnifiedStoryType21, graphQLUnifiedStoryType22, graphQLUnifiedStoryType23, graphQLUnifiedStoryType24, graphQLUnifiedStoryType25, graphQLUnifiedStoryType26, graphQLUnifiedStoryType27}, graphQLUnifiedStoryTypeArr) ? 1 : 0, graphQLUnifiedStoryTypeArr, 27, 4);
        A00 = graphQLUnifiedStoryTypeArr;
    }

    public GraphQLUnifiedStoryType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLUnifiedStoryType valueOf(String str) {
        return (GraphQLUnifiedStoryType) Enum.valueOf(GraphQLUnifiedStoryType.class, str);
    }

    public static GraphQLUnifiedStoryType[] values() {
        return (GraphQLUnifiedStoryType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
