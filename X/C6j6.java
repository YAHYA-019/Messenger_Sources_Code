package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6j6, reason: invalid class name */
/* loaded from: 6j6.class */
public final class C6j6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6j6[] A01;
    public static final C6j6 A02;
    public static final C6j6 A03;
    public static final C6j6 A04;
    public static final C6j6 A05;
    public static final C6j6 A06;
    public static final C6j6 A07;

    static {
        C6j6 c6j6 = new C6j6(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0);
        A07 = c6j6;
        C6j6 c6j62 = new C6j6("HAS_MORE_LOCAL", 1);
        A03 = c6j62;
        C6j6 c6j63 = new C6j6("HAS_MORE_REMOTE", 2);
        A04 = c6j63;
        C6j6 c6j64 = new C6j6("IS_LOADING_MORE_LOCAL", 3);
        A05 = c6j64;
        C6j6 c6j65 = new C6j6("IS_LOADING_MORE_REMOTE", 4);
        A06 = c6j65;
        C6j6 c6j66 = new C6j6("FULLY_LOADED", 5);
        A02 = c6j66;
        C6j6[] c6j6Arr = {c6j6, c6j62, c6j63, c6j64, c6j65, c6j66};
        A01 = c6j6Arr;
        A00 = C00t.A00(c6j6Arr);
    }

    public C6j6(String str, int i) {
    }

    public static C6j6 valueOf(String str) {
        return (C6j6) Enum.valueOf(C6j6.class, str);
    }

    public static C6j6[] values() {
        return (C6j6[]) A01.clone();
    }
}
