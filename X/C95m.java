package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95m, reason: invalid class name */
/* loaded from: 95m.class */
public final class C95m {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95m[] A01;
    public static final C95m A02;
    public static final C95m A03;
    public static final C95m A04;

    static {
        C95m c95m = new C95m("NONE", 0);
        A02 = c95m;
        C95m c95m2 = new C95m("SUBMIT", 1);
        A04 = c95m2;
        C95m c95m3 = new C95m("REFRESH", 2);
        A03 = c95m3;
        C95m[] c95mArr = {c95m, c95m2, c95m3};
        A01 = c95mArr;
        A00 = C00t.A00(c95mArr);
    }

    public C95m(String str, int i) {
    }

    public static C95m valueOf(String str) {
        return (C95m) Enum.valueOf(C95m.class, str);
    }

    public static C95m[] values() {
        return (C95m[]) A01.clone();
    }
}
