package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95r, reason: invalid class name */
/* loaded from: 95r.class */
public final class C95r {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95r[] A01;
    public static final C95r A02;
    public static final C95r A03;
    public static final C95r A04;

    static {
        C95r c95r = new C95r("WIFI", 0);
        A04 = c95r;
        C95r c95r2 = new C95r("OTHER", 1);
        A03 = c95r2;
        C95r c95r3 = new C95r("NONE", 2);
        A02 = c95r3;
        C95r[] c95rArr = {c95r, c95r2, c95r3};
        A01 = c95rArr;
        A00 = C00t.A00(c95rArr);
    }

    public C95r(String str, int i) {
    }

    public static C95r valueOf(String str) {
        return (C95r) Enum.valueOf(C95r.class, str);
    }

    public static C95r[] values() {
        return (C95r[]) A01.clone();
    }
}
