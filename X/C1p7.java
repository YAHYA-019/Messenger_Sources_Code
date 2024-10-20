package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1p7, reason: invalid class name */
/* loaded from: 1p7.class */
public final class C1p7 implements C1p8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1p7[] A01;
    public static final C1p7 A02;
    public static final C1p7 A03;
    public static final C1p7 A04;
    public static final C1p7 A05;
    public static final C1p7 A06;
    public static final C1p7 A07;
    public static final C1p7 A08;
    public static final C1p7 A09;
    public static final C1p7 A0A;
    public static final C1p7 A0B;
    public static final C1p7 A0C;
    public static final C1p7 A0D;
    public static final C1p7 A0E;
    public static final C1p7 A0F;
    public final C1p9 dspUsageColor;

    static {
        C1p7 c1p7 = new C1p7(C1p9.A0G, "SURFACE", 0);
        A0F = c1p7;
        C1p7 c1p72 = new C1p7(C1p9.A06, "ELEVATION", 1);
        A06 = c1p72;
        C1p7 c1p73 = new C1p7(C1p9.A04, "CARD", 2);
        A03 = c1p73;
        C1p7 c1p74 = new C1p7(C1p9.A03, "BANNER", 3);
        A02 = c1p74;
        C1p7 c1p75 = new C1p7(C1p9.A0E, "SCRIM", 4);
        A0D = c1p75;
        C1p7 c1p76 = new C1p7(C1p9.A09, "LINE", 5);
        A09 = c1p76;
        C1p7 c1p77 = new C1p7(C1p9.A0A, "MESSAGE_BUBBLE", 6);
        A0A = c1p77;
        C1p7 c1p78 = new C1p7(C1p9.A0D, "REPLY_BUBBLE", 7);
        A0C = c1p78;
        C1p7 c1p79 = new C1p7(C1p9.A0F, "SELECTED", 8);
        A0E = c1p79;
        C1p7 c1p710 = new C1p7(C1p9.A07, "FILL", 9);
        A07 = c1p710;
        C1p7 c1p711 = new C1p7(C1p9.A05, "DISABLED", 10);
        A05 = c1p711;
        C1p7 c1p712 = new C1p7(C1p9.A0C, "PRIMARY_UI", 11);
        A0B = c1p712;
        C1p7 c1p713 = new C1p7(C1p9.A0Z, "CHIP_SELECTED", 12);
        A04 = c1p713;
        C1p7 c1p714 = new C1p7(C1p9.A08, "HANDLE", 13);
        A08 = c1p714;
        C1p7[] c1p7Arr = {c1p7, c1p72, c1p73, c1p74, c1p75, c1p76, c1p77, c1p78, c1p79, c1p710, c1p711, c1p712, c1p713, c1p714};
        A01 = c1p7Arr;
        A00 = C00t.A00(c1p7Arr);
    }

    public C1p7(C1p9 c1p9, String str, int i) {
        this.dspUsageColor = c1p9;
    }

    public static C1p7 valueOf(String str) {
        return (C1p7) Enum.valueOf(C1p7.class, str);
    }

    public static C1p7[] values() {
        return (C1p7[]) A01.clone();
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
