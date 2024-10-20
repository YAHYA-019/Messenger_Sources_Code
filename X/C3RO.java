package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.3RO, reason: invalid class name */
/* loaded from: 3RO.class */
public final class C3RO {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r303 != null) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x004a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A00(android.content.Context r301, X.EPI r302, java.lang.Integer r303, java.lang.Integer r304) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RO.A00(android.content.Context, X.EPI, java.lang.Integer, java.lang.Integer):int");
    }

    public static final int A01(EPI epi, Integer num) {
        11T.A0F(epi, 0);
        if (epi == EPI.A15 && num == null) {
            throw 1BK.A0g();
        }
        switch (epi.ordinal()) {
            case 1:
            case 17:
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return 2132345219;
            case 6:
                return 2132345280;
            case 15:
                return 2132345282;
            case 18:
            case 41:
                return 2132345183;
            case 23:
                return 2132345033;
            case 27:
                return 2132345034;
            case 28:
                return 2132345328;
            case 30:
                return 2132345035;
            case 33:
                return 2132345358;
            case 35:
                return 2132345487;
            case 36:
                return 2132345036;
            case 39:
                return 2132345037;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return 2132345038;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return 2132345461;
            case 46:
                return 2132345039;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return 2132345331;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return 2132345344;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                return 2132345043;
            case 64:
                return 2132345508;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                if (num == null) {
                    throw 1BK.A0h();
                }
                int intValue = num.intValue();
                if (intValue == 1) {
                    return 2132345040;
                }
                if (intValue == 0) {
                    return 2132345032;
                }
                if (intValue == 3) {
                    return 2132345042;
                }
                if (intValue == 2) {
                    return 2132345041;
                }
                throw 1BK.A1F();
            default:
                throw AnonymousClass002.A0C(epi, "Unknown sticker type ", AnonymousClass001.A0k());
        }
    }
}
