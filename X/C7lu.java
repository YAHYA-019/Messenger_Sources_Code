package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.7lu, reason: invalid class name */
/* loaded from: 7lu.class */
public abstract class C7lu {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PREFETCH_SEGMENT_BYTES";
            case 2:
                return "PARTIAL_PREFETCH_BYTES";
            case 3:
                return "MAX_BYTES";
            case 4:
                return "N_SECOND_BYTES";
            case 5:
                return "MINIMUM_PREFETCH_BYTES";
            case 6:
                return "NTH_SEGMENT_BYTES";
            case 7:
                return "PREFETCH_BUDGET_BYTES";
            case 8:
                return "OFFSET_BYTES";
            case 9:
                return "FIRST_SEGMENT_BYTES";
            case 10:
                return "SECOND_SEGMENT_BYTES";
            case 11:
                return "SEEK_MAP";
            default:
                return OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        }
    }
}
