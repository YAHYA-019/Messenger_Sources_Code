package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BM0.class */
public final class BM0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BM0[] A01;
    public static final BM0 A02;
    public static final BM0 A03;
    public static final BM0 A04;
    public static final BM0 A05;
    public final int value;

    static {
        BM0 bm0 = new BM0("EVERYONE", 0, 0);
        A02 = bm0;
        BM0 bm02 = new BM0("FRIENDS", 1, 1);
        A03 = bm02;
        BM0 bm03 = new BM0("ONLY_ME", 2, 2);
        A04 = bm03;
        BM0 bm04 = new BM0(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 3, -1);
        A05 = bm04;
        BM0[] bm0Arr = {bm0, bm02, bm03, bm04};
        A01 = bm0Arr;
        A00 = C00t.A00(bm0Arr);
    }

    public BM0(String str, int i, int i2) {
        this.value = i2;
    }

    public static BM0 valueOf(String str) {
        return (BM0) Enum.valueOf(BM0.class, str);
    }

    public static BM0[] values() {
        return (BM0[]) A01.clone();
    }
}
