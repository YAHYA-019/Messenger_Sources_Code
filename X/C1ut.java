package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1ut, reason: invalid class name */
/* loaded from: 1ut.class */
public final class C1ut implements C1p8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1ut[] A01;
    public static final C1ut A02;
    public static final C1ut A03;
    public static final C1ut A04;
    public static final C1ut A05;
    public static final C1ut A06;
    public static final C1ut A07;
    public static final C1ut A08;
    public static final C1ut A09;
    public static final C1ut A0A;
    public static final C1ut A0B;
    public static final C1ut A0C;
    public static final C1ut A0D;
    public final C1p9 dspUsageColor;

    static {
        C1ut c1ut = new C1ut(C1p9.A1X, "PRIMARY", 0);
        A0A = c1ut;
        C1ut c1ut2 = new C1ut(C1p9.A1Y, "SECONDARY", 1);
        A0B = c1ut2;
        C1ut c1ut3 = new C1ut(C1p9.A1a, "TERTIARY", 2);
        A0C = c1ut3;
        C1ut c1ut4 = new C1ut(C1p9.A1P, "ACCENT", 3);
        A02 = c1ut4;
        C1ut c1ut5 = new C1ut(C1p9.A1V, "INACTIVE", 4);
        A08 = c1ut5;
        C1ut c1ut6 = new C1ut(C1p9.A1R, "ALWAYS_WHITE", 5);
        A04 = c1ut6;
        C1ut c1ut7 = new C1ut(C1p9.A1W, "NUX", 6);
        A09 = c1ut7;
        C1ut c1ut8 = new C1ut(C1p9.A1T, "DESTRUCTIVE", 7);
        A06 = c1ut8;
        C1ut c1ut9 = new C1ut(C1p9.A1Q, "ACTIVE", 8);
        A03 = c1ut9;
        C1ut c1ut10 = new C1ut(C1p9.A1S, "DECORATIVE", 9);
        A05 = c1ut10;
        C1ut c1ut11 = new C1ut(C1p9.A1U, "DISABLED", 10);
        A07 = c1ut11;
        C1ut c1ut12 = new C1ut(C1p9.A1b, "UNSELECTED", 11);
        A0D = c1ut12;
        C1ut[] c1utArr = {c1ut, c1ut2, c1ut3, c1ut4, c1ut5, c1ut6, c1ut7, c1ut8, c1ut9, c1ut10, c1ut11, c1ut12};
        A01 = c1utArr;
        A00 = C00t.A00(c1utArr);
    }

    public C1ut(C1p9 c1p9, String str, int i) {
        this.dspUsageColor = c1p9;
    }

    public static C1ut valueOf(String str) {
        return (C1ut) Enum.valueOf(C1ut.class, str);
    }

    public static C1ut[] values() {
        return (C1ut[]) A01.clone();
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
