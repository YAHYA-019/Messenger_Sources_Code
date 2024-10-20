package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1wz, reason: invalid class name */
/* loaded from: 1wz.class */
public final class C1wz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1wz[] A01;
    public static final C1wz A02;
    public static final C1wz A03;
    public static final C1wz A04;

    static {
        C1wz c1wz = new C1wz("Unknown", 0);
        A04 = c1wz;
        C1wz c1wz2 = new C1wz("Off", 1);
        A02 = c1wz2;
        C1wz c1wz3 = new C1wz("On", 2);
        A03 = c1wz3;
        C1wz[] c1wzArr = {c1wz, c1wz2, c1wz3};
        A01 = c1wzArr;
        A00 = C00t.A00(c1wzArr);
    }

    public C1wz(String str, int i) {
    }

    public static C1wz valueOf(String str) {
        return (C1wz) Enum.valueOf(C1wz.class, str);
    }

    public static C1wz[] values() {
        return (C1wz[]) A01.clone();
    }
}
