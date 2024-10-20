package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.97m, reason: invalid class name */
/* loaded from: 97m.class */
public final class C97m {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C97m[] A01;
    public static final C97m A02;
    public static final C97m A03;
    public static final C97m A04;
    public static final C97m A05;
    public static final C97m A06;
    public static final C97m A07;

    static {
        C97m c97m = new C97m("SHORTEST", 0);
        A07 = c97m;
        C97m c97m2 = new C97m("SHORTER", 1);
        A06 = c97m2;
        C97m c97m3 = new C97m("SHORT", 2);
        A05 = c97m3;
        C97m c97m4 = new C97m("MEDIUM", 3);
        A04 = c97m4;
        C97m c97m5 = new C97m("LONG", 4);
        A02 = c97m5;
        C97m c97m6 = new C97m("LONGER", 5);
        A03 = c97m6;
        C97m[] c97mArr = {c97m, c97m2, c97m3, c97m4, c97m5, c97m6, new C97m("INSTANT", 6)};
        A01 = c97mArr;
        A00 = C00t.A00(c97mArr);
    }

    public C97m(String str, int i) {
    }

    public static final Integer A00(C97m c97m) {
        switch (c97m.ordinal()) {
            case 0:
                return 0S2.A0u;
            case 1:
                return 0S2.A0j;
            case 2:
                return 0S2.A0Y;
            case 3:
                return 0S2.A0N;
            case 4:
                return 0S2.A01;
            case 5:
                return 0S2.A0C;
            case 6:
                return 0S2.A00;
            default:
                throw 1BK.A1F();
        }
    }

    public static C97m valueOf(String str) {
        return (C97m) Enum.valueOf(C97m.class, str);
    }

    public static C97m[] values() {
        return (C97m[]) A01.clone();
    }

    public final int A01() {
        Integer A002 = A00(this);
        11T.A0F(A002, 0);
        Integer A003 = C1pA.A00();
        11T.A0F(A003, 0);
        return 1pB.A00(A003).A8B(A002).A00;
    }

    public final int A02() {
        Integer A002 = A00(this);
        11T.A0F(A002, 0);
        Integer A003 = C1pA.A00();
        11T.A0F(A003, 0);
        return 1pB.A00(A003).A8B(A002).A01;
    }
}
