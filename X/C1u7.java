package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1u7, reason: invalid class name */
/* loaded from: 1u7.class */
public final class C1u7 implements C1p8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1u7[] A01;
    public static final C1u7 A02;
    public static final C1u7 A03;
    public static final C1u7 A04;
    public static final C1u7 A05;
    public static final C1u7 A06;
    public static final C1u7 A07;
    public static final C1u7 A08;
    public static final C1u7 A09;
    public static final C1u7 A0A;
    public static final C1u7 A0B;
    public static final C1u7 A0C;
    public static final C1u7 A0D;
    public final C1p9 dspUsageColor;

    static {
        C1u7 c1u7 = new C1u7(C1p9.A1n, "PRIMARY", 0);
        A08 = c1u7;
        C1u7 c1u72 = new C1u7(C1p9.A1o, "PRIMARY_ON_MEDIA", 1);
        A09 = c1u72;
        C1u7 c1u73 = new C1u7(C1p9.A1p, "SECONDARY", 2);
        A0A = c1u73;
        C1u7 c1u74 = new C1u7(C1p9.A1q, "SECONDARY_EMPHASIZED", 3);
        A0B = c1u74;
        C1u7 c1u75 = new C1u7(C1p9.A1r, "TERTIARY", 4);
        A0C = c1u75;
        C1u7 c1u76 = new C1u7(C1p9.A1j, "ERROR", 5);
        A05 = c1u76;
        C1u7 c1u77 = new C1u7(C1p9.A1i, "DISABLED", 6);
        A04 = c1u77;
        C1u7 c1u78 = new C1u7(C1p9.A1s, "WHITE", 7);
        A0D = c1u78;
        C1u7 c1u79 = new C1u7(C1p9.A1h, "BLACK", 8);
        A03 = c1u79;
        C1u7 c1u710 = new C1u7(C1p9.A1m, "PLACEHOLDER", 9);
        A07 = c1u710;
        C1u7 c1u711 = new C1u7(C1p9.A1l, "LINK", 10);
        A06 = c1u711;
        C1u7 c1u712 = new C1u7(C1p9.A1g, "ACTIVE", 11);
        A02 = c1u712;
        C1u7[] c1u7Arr = {c1u7, c1u72, c1u73, c1u74, c1u75, c1u76, c1u77, c1u78, c1u79, c1u710, c1u711, c1u712};
        A01 = c1u7Arr;
        A00 = C00t.A00(c1u7Arr);
    }

    public C1u7(C1p9 c1p9, String str, int i) {
        this.dspUsageColor = c1p9;
    }

    public static C1u7 valueOf(String str) {
        return (C1u7) Enum.valueOf(C1u7.class, str);
    }

    public static C1u7[] values() {
        return (C1u7[]) A01.clone();
    }

    @Override // X.C1p8
    public int AgL() {
        return C1pA.A00.A01(this.dspUsageColor, true);
    }

    @Override // X.C1p8
    public int Ato() {
        return C1pA.A00.A01(this.dspUsageColor, false);
    }
}
