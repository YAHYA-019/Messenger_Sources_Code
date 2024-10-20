package X;

/* renamed from: X.7kn, reason: invalid class name */
/* loaded from: 7kn.class */
public abstract class C7kn {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DIRECT_INVITE_CHAT_ROW";
            case 2:
                return "MESSENGER_UNIVERSAL_SEARCH";
            case 3:
                return "NOTIFICATION";
            case 4:
                return "CHANNEL_CREATION_NOTIFICATION";
            case 5:
                return "FRIEND_JOINED_COMMUNITY_CHAT_NOTIFICATION";
            case 6:
                return "TRENDING_NOTIFICATION";
            case 7:
                return "DIRECT_INVITE_NOTIFICATION";
            case 8:
                return "HIGHLIGHTS_TAB_CHAT_PREVIEW";
            case 9:
                return "COMMUNITY_CHANNEL_PREVIEW";
            case 10:
                return "PEOPLE_TAB";
            case 11:
                return "SEARCH";
            case 12:
                return "ACTIVITY_TAB_CHATS_IN_YOUR_COMMUNITIES";
            case 13:
                return "INBOX_UPSELL";
            case 14:
                return "UNDEFINED";
            default:
                return "CHANNEL_LIST";
        }
    }
}
