package com.facebook.graphql.enums;

import com.facebook.acra.constants.ActionId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLCallToActionType.class */
public final class GraphQLCallToActionType {
    public static final /* synthetic */ GraphQLCallToActionType[] A00;
    public static final GraphQLCallToActionType A01;
    public static final GraphQLCallToActionType A02;
    public final String serverValue;

    static {
        GraphQLCallToActionType[] graphQLCallToActionTypeArr = new GraphQLCallToActionType[ActionId.MESSENGER_THREAD_LIST_LOADED];
        GraphQLCallToActionType A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = A002;
        System.arraycopy(new GraphQLCallToActionType[]{A002, A00("ACTIVATE_OFFER", 1), A00("ADD_TO_CART", 2), A00("APPLY_NOW", 3), A00("ASK_ABOUT_SERVICES", 4), A00("ASK_FOR_MORE_INFO", 5), A00("AUDIO_CALL", 6), A00("BET_NOW", 7), A00("BLOOD_DONATIONS", 8), A00("BOOK_A_CONSULTATION", 9), A00("BOOK_NOW", 10), A00("BOOK_TEST_DRIVE", 11), A00("BOOK_TRAVEL", 12), A00("BUY", 13), A00("BUY_NOW", 14), A00("BUY_TICKETS", 15), A00("BUY_VIA_MESSAGE", 16), A00("CALL", 17), A00("CALL_ME", 18), A00("CALL_NOW", 19), A00("CHAT_ON_WHATSAPP", 20), A00("CHAT_WITH_US", 21), A00("CHECK_AVAILABILITY", 22), A00("CIVIC_ACTION", 23), A00("CLAIM_OFFER", 24), A00("CONFIRM", 25), A00("CONTACT", 26)}, 0, graphQLCallToActionTypeArr, 0, 27);
        System.arraycopy(new GraphQLCallToActionType[]{A00("CONTACT_US", 27), A00("DIAL_CODE", 28), A00("DONATE", 29), A00("DONATE_NOW", 30), A00("DOWNLOAD", 31), A00("EMAIL_NOW", 32), A00("EVENT_RSVP", 33), A00("EXPLORE_MORE", 34), A00("FIND_A_GROUP", 35), A00("FIND_YOUR_GROUPS", 36), A00("FOLLOW_NEWS_STORYLINE", 37), A00("FOLLOW_PAGE", 38), A00("FOLLOW_USER", 39), A00("GET_A_QUOTE", 40), A00("GET_DIRECTIONS", 41), A00("GET_EVENT_TICKETS", 42), A00("GET_MOBILE_APP", 43), A00("GET_OFFER", 44), A00("GET_OFFER_VIEW", 45), A00("GET_PROMOTIONS", 46), A00("GET_QUOTE", 47), A00("GET_SHOWTIMES", 48), A00("GET_STARTED", 49), A00("GIVE_FREE_RIDES", 50), A00("GO_LIVE", 51), A00("INQUIRE_NOW", 52), A00("INSTAGRAM_MESSAGE", 53)}, 0, graphQLCallToActionTypeArr, 27, 27);
        System.arraycopy(new GraphQLCallToActionType[]{A00("INSTALL_APP", 54), A00("INSTALL_FREE_MOBILE_APP", 55), A00("INSTALL_MOBILE_APP", 56), A00("INTERESTED", 57), A00("JOBS_APPLY_NOW", 58), A00("JOIN_CHANNEL", 59), A00("JOIN_GROUP", 60), A00("LEARN_MORE", 61), A00("LIKE_PAGE", 62), A00("LINK_CARD", 63), A00("LISTEN_MUSIC", 64), A00("LISTEN_NOW", 65), A00("LOYALTY_LEARN_MORE", 66), A00("MAKE_AN_APPOINTMENT", 67), A00("MESSAGE_PAGE", 68), A00("MESSAGE_USER", 69), A00("MISSED_CALL", 70), A00("MOBILE_DOWNLOAD", 71), A00("MOMENTS", 72), A00("NO_BUTTON", 73), A00("OPEN_INSTANT_APP", 74), A00("OPEN_LINK", 75), A00("OPEN_MESSENGER_EXT", 76), A00("OPEN_MOVIES", 77), A00("ORDER_NOW", 78), A00("PAY_OR_REQUEST", 79), A00("PAY_TO_ACCESS", 80)}, 0, graphQLCallToActionTypeArr, 54, 27);
        GraphQLCallToActionType A003 = A00("PLAY", 81);
        GraphQLCallToActionType A004 = A00("PLAY_GAME", 82);
        GraphQLCallToActionType A005 = A00("PLAY_GAME_ON_FACEBOOK", 83);
        GraphQLCallToActionType A006 = A00("PRE_REGISTER", 84);
        GraphQLCallToActionType A007 = A00("PURCHASE_GIFT_CARDS", 85);
        GraphQLCallToActionType A008 = A00("RAISE_MONEY", 86);
        GraphQLCallToActionType A009 = A00("RECORD_NOW", 87);
        GraphQLCallToActionType A0010 = A00("REFER_FRIENDS", 88);
        GraphQLCallToActionType A0011 = A00("REGISTER_NOW", 89);
        GraphQLCallToActionType A0012 = A00("REMIND_ME", 90);
        GraphQLCallToActionType A0013 = A00("REQUEST_TIME", 91);
        GraphQLCallToActionType A0014 = A00("SAVE", 92);
        GraphQLCallToActionType A0015 = A00("SAVE_OFFER", 93);
        GraphQLCallToActionType A0016 = A00("SAY_THANKS", 94);
        GraphQLCallToActionType A0017 = A00("SEARCH", 95);
        GraphQLCallToActionType A0018 = A00("SEARCH_MORE", 96);
        GraphQLCallToActionType A0019 = A00("SEE_DETAILS", 97);
        GraphQLCallToActionType A0020 = A00("SEE_MENU", 98);
        GraphQLCallToActionType A0021 = A00("SEE_MORE", 99);
        A01 = A0021;
        System.arraycopy(new GraphQLCallToActionType[]{A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A00("SEE_OFFER", 100), A00("SELL_NOW", ActionId.ON_VIEW_CREATED_END), A00("SEND_A_GIFT", ActionId.DATA_LOAD_START), A00("SEND_GIFT", ActionId.LEGACY_MARKER), A00("SEND_GIFT_MONEY", ActionId.ACTION_BAR_COMPLETE), A00("SEND_INVITES", ActionId.ABORTED), A00("SEND_TIP", ActionId.QUERY_READY), A00("SEND_UPDATES", ActionId.RTMP_PACKET_RECEIVED)}, 0, graphQLCallToActionTypeArr, 81, 27);
        System.arraycopy(new GraphQLCallToActionType[]{A00("SHARE", 108), A00("SHOP_NOW", ActionId.RTMP_CONNECTION_REQUESTED), A00("SIGN_UP", ActionId.RTMP_CONNECTION_RELEASE), A00("SOTTO_SUBSCRIBE", ActionId.NEW_START_FOUND), A00("START_ORDER", ActionId.MISSED_EVENT), A00("SUBSCRIBE", ActionId.TIMEOUT), A00("SWIPE_UP_PRODUCT", ActionId.CONTROLLER_INITIATED), A00("SWIPE_UP_SHOP", ActionId.RTMP_STREAM_PREPARED), A00("TRY_IN_CAMERA", ActionId.VIDEO_PLAYING), A00("TRY_IT", ActionId.RTMP_CONNECTION_CONNECTED), A00("TRY_ON", ActionId.RTMP_CONNECTION_FAILED), A00("UNLIKE_PAGE", ActionId.RTMP_CONNECTION_INTERCEPTED), A00("UPDATE_APP", ActionId.VIDEO_SET_RENDERER_CONTEXT), A00("USE_APP", ActionId.HEADER_DATA_LOADED), A00("USE_MOBILE_APP", ActionId.CARD_DATA_LOADED), A00("VIDEO_ANNOTATION", ActionId.VIEW_WILL_APPEAR_BEGIN), A00("VIDEO_CALL", ActionId.VIEW_DID_LOAD_BEGIN), A00("VIEW_CHANNEL", 125), A00("VIEW_INSTAGRAM_PROFILE", ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES), A00("VIEW_PRODUCT", 127), A00("VIEW_RESUME", 128), A00("VISIT_PAGES_FEED", ActionId.MESSENGER_QUEUE_CREATION), A00("VISIT_PROFILE", ActionId.APP_DID_FINISH_LAUNCHING), A00("VISIT_WORLD", ActionId.APP_DID_BECOME_ACTIVE), A00("VOTE_NOW", ActionId.APP_WILL_ENTER_FOREGROUND), A00("WATCH_APP_UPGRADE", ActionId.APP_DID_ENTER_BACKGROUND), A00("WATCH_MORE", ActionId.APP_MAIN)}, 0, graphQLCallToActionTypeArr, 108, 27);
        System.arraycopy(new GraphQLCallToActionType[]{A00("WATCH_MUSIC_VIDEO", ActionId.MQTT_CONNECTING), A00("WATCH_VIDEO", ActionId.MQTT_CONNECTED), A00("WHATSAPP_LINK", ActionId.MQTT_DISCONNECTED), A00("WHATSAPP_MESSAGE", ActionId.MESSENGER_DELTA_REQUEST), A00("WOODHENGE_SUPPORT", ActionId.APP_FIRST_VIEW_CONTROLLER)}, 0, graphQLCallToActionTypeArr, ActionId.MQTT_CONNECTING, 5);
        A00 = graphQLCallToActionTypeArr;
    }

    public GraphQLCallToActionType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLCallToActionType A00(String str, int i) {
        return new GraphQLCallToActionType(str, i, str);
    }

    public static GraphQLCallToActionType valueOf(String str) {
        return (GraphQLCallToActionType) Enum.valueOf(GraphQLCallToActionType.class, str);
    }

    public static GraphQLCallToActionType[] values() {
        return (GraphQLCallToActionType[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
