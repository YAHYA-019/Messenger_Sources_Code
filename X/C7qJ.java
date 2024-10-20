package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.7qJ, reason: invalid class name */
/* loaded from: 7qJ.class */
public final class C7qJ {
    public final Integer A00;
    public final String A01;

    public C7qJ(Integer num, String str) {
        this.A00 = num;
        switch (num.intValue()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 28:
            case 31:
            case 32:
            case 40:
            case 41:
            case 42:
            case 43:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
            case ActionId.IN_PROGRESS /* 49 */:
            case 50:
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
            case ActionId.INTENT_MAPPED /* 73 */:
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                if (str == null) {
                    str = "null";
                    break;
                }
                break;
        }
        this.A01 = str;
    }
}
