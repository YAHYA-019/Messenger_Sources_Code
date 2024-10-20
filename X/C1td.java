package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1td, reason: invalid class name */
/* loaded from: 1td.class */
public final class C1td implements C1p8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1td[] A01;
    public static final C1td A02;
    public static final C1td A03;
    public static final C1td A04;
    public static final C1td A05;
    public static final C1td A06;
    public static final C1td A07;
    public static final C1td A08;
    public static final C1td A09;
    public static final C1td A0A;
    public static final C1td A0B;
    public static final C1td A0C;
    public static final C1td A0D;
    public static final C1td A0E;
    public static final C1td A0F;
    public final C1p9 dspUsageColor;

    static {
        C1td c1td = new C1td(C1p9.A0w, "BLUE", 0);
        A05 = c1td;
        C1td c1td2 = new C1td(C1p9.A18, "GREEN", 1);
        A08 = c1td2;
        C1td c1td3 = new C1td(C1p9.A1G, "RED", 2);
        A0A = c1td3;
        C1td c1td4 = new C1td(C1p9.A1F, "PURPLE", 3);
        A09 = c1td4;
        C1td c1td5 = new C1td(C1p9.A0y, "BLUE_GREY_75", 4);
        A07 = c1td5;
        C1td c1td6 = new C1td(C1p9.A0x, "BLUE_GREY_50", 5);
        A06 = c1td6;
        C1td c1td7 = new C1td(C1p9.A1M, "WHITE", 6);
        A0E = c1td7;
        C1td c1td8 = new C1td(C1p9.A1N, "WHITE_70", 7);
        A0F = c1td8;
        C1td c1td9 = new C1td(C1p9.A0v, "BLACK_70", 8);
        A04 = c1td9;
        C1td c1td10 = new C1td(C1p9.A0s, "BLACK", 9);
        A02 = c1td10;
        C1td c1td11 = new C1td(C1p9.A0t, "BLACK_34", 10);
        A03 = c1td11;
        C1td c1td12 = new C1td(C1p9.A1L, "TRANSPARENT", 11);
        A0D = c1td12;
        C1td c1td13 = new C1td(C1p9.A1u, "TINT_BLACK", 12);
        A0B = c1td13;
        C1td c1td14 = new C1td(C1p9.A1v, "TINT_GREY", 13);
        A0C = c1td14;
        C1td[] c1tdArr = {c1td, c1td2, c1td3, c1td4, c1td5, c1td6, c1td7, c1td8, c1td9, c1td10, c1td11, c1td12, c1td13, c1td14};
        A01 = c1tdArr;
        A00 = C00t.A00(c1tdArr);
    }

    public C1td(C1p9 c1p9, String str, int i) {
        this.dspUsageColor = c1p9;
    }

    public static C1td valueOf(String str) {
        return (C1td) Enum.valueOf(C1td.class, str);
    }

    public static C1td[] values() {
        return (C1td[]) A01.clone();
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
