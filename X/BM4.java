package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BM4.class */
public final class BM4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BM4[] A01;
    public static final BM4 A02;
    public static final BM4 A03;
    public static final BM4 A04;
    public static final BM4 A05;
    public final String parentSurface;

    static {
        BM4 bm4 = new BM4("SUBTHREAD_LIST_HEADER_MESSAGE", 0, "subthread_list_header_message");
        A03 = bm4;
        BM4 bm42 = new BM4("SUBTHREAD_LIST_NULL_STATE_VIEW", 1, "subthread_list_null_state_view");
        A04 = bm42;
        BM4 bm43 = new BM4("SIDECHAT_QP", 2, "sidechat_qp");
        A02 = bm43;
        BM4 bm44 = new BM4(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 3, "unknown");
        A05 = bm44;
        BM4[] bm4Arr = {bm4, bm42, bm43, bm44};
        A01 = bm4Arr;
        A00 = C00t.A00(bm4Arr);
    }

    public BM4(String str, int i, String str2) {
        this.parentSurface = str2;
    }

    public static BM4 valueOf(String str) {
        return (BM4) Enum.valueOf(BM4.class, str);
    }

    public static BM4[] values() {
        return (BM4[]) A01.clone();
    }
}
