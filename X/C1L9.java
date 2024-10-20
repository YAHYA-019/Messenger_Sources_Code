package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.1L9, reason: invalid class name */
/* loaded from: 1L9.class */
public abstract class C1L9 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    public static final int A00(String str) {
        11T.A0F(str, 0);
        switch (str.hashCode()) {
            case -1995555389:
                if (str.equals("NEUTER")) {
                    return 3;
                }
                throw AnonymousClass001.A0L(0Pz.A0X("Unrecognized gender '", str, '\''));
            case 2358797:
                if (str.equals("MALE")) {
                    return 2;
                }
                throw AnonymousClass001.A0L(0Pz.A0X("Unrecognized gender '", str, '\''));
            case 433141802:
                if (str.equals(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID)) {
                    return 0;
                }
                throw AnonymousClass001.A0L(0Pz.A0X("Unrecognized gender '", str, '\''));
            case 2070122316:
                if (str.equals("FEMALE")) {
                    return 1;
                }
                throw AnonymousClass001.A0L(0Pz.A0X("Unrecognized gender '", str, '\''));
            default:
                throw AnonymousClass001.A0L(0Pz.A0X("Unrecognized gender '", str, '\''));
        }
    }

    public static final String A01(int i) {
        if (i == 0) {
            return OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        }
        if (i == 1) {
            return "FEMALE";
        }
        if (i == 2) {
            return "MALE";
        }
        if (i == 3) {
            return "NEUTER";
        }
        throw 0Pz.A04("Out of bounds gender ", i);
    }
}
