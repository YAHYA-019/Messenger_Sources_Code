package X;

import com.facebook.acra.constants.ActionId;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.4my, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4my.class */
public abstract class AbstractC08444my {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DISCHARGING";
            case 2:
                return GOm.A00(ActionId.OFFLINE);
            case 3:
                return "CHARGING_USB";
            case 4:
                return "CHARGING_AC";
            case 5:
                return "CHARGING_WIRELESS";
            case 6:
                return "FULL";
            default:
                return OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        }
    }
}
