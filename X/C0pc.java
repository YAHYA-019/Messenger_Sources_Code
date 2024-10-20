package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.0pc, reason: invalid class name */
/* loaded from: 0pc.class */
public abstract class C0pc {
    public static String A00(int i) {
        if (i == 45) {
            return "EVENTS_EVENT_PERMALINK_TTRC";
        }
        if (i == 46) {
            return "EVENTS_EVENTS_DASHBOARD_LOAD_TTRC";
        }
        if (i == 50) {
            return "Android Events Notification Settings TTRC";
        }
        if (i == 1217) {
            return "EVENTS_EVENT_RSVP_VISIBILITY";
        }
        if (i == 2214) {
            return "EVENTS_EVENT_EDIT_FLOW";
        }
        if (i == 2936) {
            return "EVENTS_EVENT_CREATION_NT_FBLITE";
        }
        if (i == 3044) {
            return "EVENTS_WEEKLY_DIGEST_TTRC";
        }
        if (i == 6429) {
            return "EVENTS_RSVP_GOING";
        }
        if (i == 9288) {
            return "EVENTS_EVENT_CREATION_MULTISTEP_FLOW_FB4A";
        }
        if (i == 11487) {
            return "EVENTS_EVENTS_BOOKMARK_TAIL_LOAD_ANDROID";
        }
        if (i == 22999) {
            return "EVENTS_EVENTS_BOOKMARK_TTRC";
        }
        if (i == 62) {
            return "EVENTS_LOCAL_APPMARK_ENTITY_PREVIEW_TTRC";
        }
        if (i == 63) {
            return "EVENTS_LOCAL_APPMARK_TYPEAHEAD_TTRC";
        }
        if (i == 66) {
            return "EVENTS_EVENT_GUESTLIST_TTRC";
        }
        if (i == 67) {
            return "EVENTS_DELETE_EVENT";
        }
        switch (i) {
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return "EVENTS_LOCAL_APPMARK_FEED_TTRC";
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return "EVENTS_LOCAL_APPMARK_MAP_TTRC";
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return "EVENTS_LOCAL_APPMARK_GUIDE_TTRC";
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return "EVENTS_LOCAL_APPMARK_SERACH_TTRC";
            case ActionId.QUEUEING_FAIL /* 56 */:
                return "EVENTS_EVENT_TICKET_SELECTION_TTRC";
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return "EVENTS_EVENT_TICKET_RESERVATION_TTRC";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
