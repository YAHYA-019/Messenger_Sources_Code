package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: BRs.class */
public abstract class BRs {
    public static String A00(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                    return "JOIN";
                case 1:
                    return "SERVER_MEDIA_UPDATE";
                case 2:
                    return "HANGUP";
                case 3:
                    return "ICE_CANDIDATE";
                case 4:
                    return "RING";
                case 5:
                    return "DISMISS";
                case 6:
                    return "CONFERENCE_STATE";
                case 7:
                    return "ADD_PARTICIPANTS";
                case 8:
                    return "SUBSCRIPTION";
                case 9:
                    return "CLIENT_MEDIA_UPDATE";
                case 10:
                    return "DATA_MESSAGE";
                case 11:
                    return "REMOVE_PARTICIPANTS";
                case 18:
                    return "PING";
                case 19:
                    return "P2P_PROTOCOL";
                case 20:
                    return "UPDATE";
                case 21:
                    return "NOTIFY";
                case 22:
                    return AnonymousClass000.A00(ActionId.MESSENGER_DELTA_REQUEST);
                case 23:
                    return "CLIENT_EVENT";
                case 25:
                    return "UNSUBSCRIBE";
                case 26:
                    return "APPROVAL";
                case 27:
                    return "TRANSFER";
                case 28:
                    return "WAKEUP";
            }
        }
        return "unknown";
    }
}
