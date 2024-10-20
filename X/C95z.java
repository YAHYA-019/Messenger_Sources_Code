package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95z, reason: invalid class name */
/* loaded from: 95z.class */
public final class C95z {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95z[] A01;
    public static final C95z A02;
    public static final C95z A03;
    public static final C95z A04;
    public static final C95z A05;

    static {
        C95z c95z = new C95z("ERROR_SERVER", 0);
        A03 = c95z;
        C95z c95z2 = new C95z("ERROR_THREAD_FULL", 1);
        A04 = c95z2;
        C95z c95z3 = new C95z("ERROR_CONNECTION", 2);
        A02 = c95z3;
        C95z c95z4 = new C95z("SUCCESS", 3);
        A05 = c95z4;
        C95z[] c95zArr = {c95z, c95z2, c95z3, c95z4};
        A01 = c95zArr;
        A00 = C00t.A00(c95zArr);
    }

    public C95z(String str, int i) {
    }

    public static C95z valueOf(String str) {
        return (C95z) Enum.valueOf(C95z.class, str);
    }

    public static C95z[] values() {
        return (C95z[]) A01.clone();
    }
}
