package X;

/* renamed from: X.3Os, reason: invalid class name */
/* loaded from: 3Os.class */
public abstract class C3Os {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (r301.equals("UNSET_OR_UNRECOGNIZED_ENUM_VALUE") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.2VZ A00(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Os.A00(java.lang.String):X.2VZ");
    }

    public static String A01(2To r301) {
        switch (r301.ordinal()) {
            case 1:
                return "INBOX_ACTIVE_NOW";
            case 2:
                return "MESSENGER_USER_SEARCH";
            case 3:
                return "MONTAGE_USER";
            case 4:
                return "BROADCAST_FLOW_TOP_CONTACTS";
            case 5:
                return "RTC_TOP_CONTACTS";
            case 6:
                return "MESSENGER_GROUP_SEARCH";
            case 7:
                return "MESSENGER_NON_CONTACT_SEARCH";
            case 8:
                return "MESSENGER_SEARCH_BOOTSTRAP";
            case 9:
                return "MESSENGER_PAGE_SEARCH";
            case 10:
                return "MESSENGER_USER_SEARCH_NULLSTATE";
            case 11:
                return "MESSENGER_MONTAGE_SEEN_SHEET";
            case 12:
                return "MESSENGER_CLOSE_CONNECTION";
            case 13:
                return "MESSENGER_BROADCAST_FLOW_TOP_THREADS";
            case 14:
                return "MESSENGER_ROOM_INVITE";
            case 15:
                return "INBOX_ACTIVE_NOW_PREFETCH";
            case 16:
                return "MESSENGER_BLENDED_KEYPRESS";
            case 17:
            default:
                throw AnonymousClass002.A0C(r301, "Unknown ContactScoreType value: ", AnonymousClass001.A0k());
            case 18:
                return "BROADCAST_FLOW_TOP_CONTACTS_AND_TOP_THREAD_FB_SHARE";
            case 19:
                return "BROADCAST_FLOW_TOP_CONTACTS_FB_SHARE";
            case 20:
                return "BROADCAST_FLOW_TOP_THREADS_FB_SHARE";
            case 21:
                return "MESSENGER_ACTIVE_NOW_TRAY_ACTIVE_CC";
        }
    }
}
