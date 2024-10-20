package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.3P6, reason: invalid class name */
/* loaded from: 3P6.class */
public abstract class C3P6 {
    public static int A00(Integer num) {
        return A01(num).hashCode() + num.intValue();
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ARROW_LEFT";
            case 2:
                return "AUDIO_WAVE";
            case 3:
                return "BADGE_CHECKMARK";
            case 4:
                return "BOT";
            case 5:
                return "CAKE";
            case 6:
                return "CAMCORDER";
            case 7:
                return "CAMCORDER_MISSED";
            case 8:
                return "CAMCORDER_PLUS";
            case 9:
                return "COPY";
            case 10:
                return "CROSS";
            case 11:
                return "DOTS_3_HORIZONTAL";
            case 12:
                return "DOTS_3_HORIZONTAL_CIRCLE_OUTLINE";
            case 13:
                return "EYE_CROSS";
            case 14:
                return "FACE_HAPPY";
            case 15:
                return "FACE_VERY_HAPPY";
            case 16:
                return "FACE_VERY_UNHAPPY";
            case 17:
                return "FORWARD";
            case 18:
                return "FORWARD_STACK";
            case 19:
                return "GEN_AI";
            case 20:
                return "GIF";
            case 21:
                return "HAND_THUMBS_UP";
            case 22:
                return "HEART";
            case 23:
                return "INFO_CIRCLE";
            case 24:
                return "LIKE";
            case 25:
                return "LOCK";
            case 26:
                return "MAGNIFYING_GLASS";
            case 27:
                return "MORE";
            case 28:
                return "NEGATIVE_FEEDBACK";
            case 29:
                return "PAPERCLIP";
            case 30:
                return "PHONE";
            case 31:
                return "PHONE_MISSED";
            case 32:
                return "PHOTO";
            case 33:
                return "PLAY";
            case 34:
                return "PLUS";
            case 35:
                return "POSITIVE_FEEDBACK";
            case 36:
                return "REPLY";
            case 37:
                return "SETTINGS";
            case 38:
                return "SLIDER";
            case 39:
                return "STAR";
            case 40:
                return "STATUS_DELIVERED";
            case 41:
                return "STATUS_ERROR";
            case 42:
                return "STATUS_MUTED";
            case 43:
                return "STATUS_READ";
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return "STATUS_SENDING";
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return "STATUS_SENT";
            case 46:
                return "STICKERS_FACE";
            case ActionId.ON_START_END /* 47 */:
                return "TRENDING";
            case ActionId.QUEUED /* 48 */:
                return "WAVE";
            default:
                return "APP_FACEBOOK";
        }
    }
}
