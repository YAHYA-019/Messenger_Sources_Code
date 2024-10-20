package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.4qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4qv.class */
public abstract class AbstractC09674qv {
    public static String A00(int i) {
        if (i == 20) {
            return "NR";
        }
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case 13:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            default:
                return OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        }
    }

    public static String A01(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : "SIP" : "CDMA" : "GSM" : "NONE";
    }

    public static String A02(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : "READY" : "NETWORK_LOCKED" : "PUK_REQUIRED" : "PIN_REQUIRED" : "ABSENT";
    }
}
