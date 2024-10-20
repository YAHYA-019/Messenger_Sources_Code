package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5c2, reason: invalid class name */
/* loaded from: 5c2.class */
public final class C5c2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5c2[] A01;
    public static final C5c2 A02;
    public static final C5c2 A03;
    public static final C5c2 A04;
    public static final C5c2 A05;
    public static final C5c2 A06;
    public static final C5c2 A07;
    public final int value;

    static {
        C5c2 c5c2 = new C5c2(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0, 0);
        A07 = c5c2;
        C5c2 c5c22 = new C5c2("PREFETCH_WHEN_COLD_START", 1, 1);
        A04 = c5c22;
        C5c2 c5c23 = new C5c2("FETCH_WHEN_ENTER_TAB", 2, 2);
        A02 = c5c23;
        C5c2 c5c24 = new C5c2("PULL_TO_REFRESH", 3, 3);
        A05 = c5c24;
        C5c2 c5c25 = new C5c2("SCROLL_NEXT_PAGE", 4, 4);
        A06 = c5c25;
        C5c2 c5c26 = new C5c2("PERIODIC_SYNC", 5, 5);
        A03 = c5c26;
        C5c2[] c5c2Arr = {c5c2, c5c22, c5c23, c5c24, c5c25, c5c26, new C5c2("LIGHTWEIGHT_PREFETCH", 6, 6)};
        A01 = c5c2Arr;
        A00 = C00t.A00(c5c2Arr);
    }

    public C5c2(String str, int i, int i2) {
        this.value = i2;
    }

    public static C5c2 valueOf(String str) {
        return (C5c2) Enum.valueOf(C5c2.class, str);
    }

    public static C5c2[] values() {
        return (C5c2[]) A01.clone();
    }
}
