package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* loaded from: EX7.class */
public abstract class EX7 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LOCK_SCREEN_NOT_SETUP";
            case 1:
                return "NO_ENROLLED_FINGERPRINTS";
            case 2:
                return "KEY_PAIR_INVALIDATED";
            default:
                return MessageAvailabilityResponseId$Companion.AVAILABLE;
        }
    }
}
