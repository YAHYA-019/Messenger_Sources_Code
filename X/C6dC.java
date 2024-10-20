package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6dC, reason: invalid class name */
/* loaded from: 6dC.class */
public final class C6dC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6dC[] A01;
    public static final C6dC A02;
    public static final C6dC A03;
    public static final C6dC A04;
    public static final C6dC A05;
    public static final C6dC A06;
    public static final C6dC A07;
    public static final C6dC A08;
    public static final C6dC A09;
    public static final C6dC A0A;
    public static final C6dC A0B;
    public static final C6dC A0C;
    public final boolean isHorizontal;

    static {
        C6dC c6dC = new C6dC("NONE", 0, true);
        A0A = c6dC;
        C6dC c6dC2 = new C6dC("TOP", 1, true);
        A0C = c6dC2;
        C6dC c6dC3 = new C6dC("BOTTOM", 2, true);
        A02 = c6dC3;
        C6dC c6dC4 = new C6dC("START", 3, false);
        A0B = c6dC4;
        C6dC c6dC5 = new C6dC("END", 4, false);
        A04 = c6dC5;
        C6dC c6dC6 = new C6dC("INNER_TOP", 5, true);
        A09 = c6dC6;
        C6dC c6dC7 = new C6dC("INNER_BOTTOM", 6, true);
        A05 = c6dC7;
        C6dC c6dC8 = new C6dC("INNER_START", 7, false);
        A08 = c6dC8;
        C6dC c6dC9 = new C6dC("INNER_END", 8, false);
        A07 = c6dC9;
        C6dC c6dC10 = new C6dC("CENTER", 9, true);
        A03 = c6dC10;
        C6dC c6dC11 = new C6dC("INNER_CENTER", 10, true);
        A06 = c6dC11;
        C6dC[] c6dCArr = {c6dC, c6dC2, c6dC3, c6dC4, c6dC5, c6dC6, c6dC7, c6dC8, c6dC9, c6dC10, c6dC11};
        A01 = c6dCArr;
        A00 = C00t.A00(c6dCArr);
    }

    public C6dC(String str, int i, boolean z) {
        this.isHorizontal = z;
    }

    public static C6dC valueOf(String str) {
        return (C6dC) Enum.valueOf(C6dC.class, str);
    }

    public static C6dC[] values() {
        return (C6dC[]) A01.clone();
    }
}
