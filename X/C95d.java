package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95d, reason: invalid class name */
/* loaded from: 95d.class */
public final class C95d {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95d[] A01;
    public static final C95d A02;
    public static final C95d A03;
    public static final C95d A04;

    static {
        C95d c95d = new C95d("Setup", 0);
        A04 = c95d;
        C95d c95d2 = new C95d("Restore", 1);
        A03 = c95d2;
        C95d c95d3 = new C95d("GenerateNewRecoveryCode", 2);
        A02 = c95d3;
        C95d[] c95dArr = {c95d, c95d2, c95d3};
        A01 = c95dArr;
        A00 = C00t.A00(c95dArr);
    }

    public C95d(String str, int i) {
    }

    public static C95d valueOf(String str) {
        return (C95d) Enum.valueOf(C95d.class, str);
    }

    public static C95d[] values() {
        return (C95d[]) A01.clone();
    }
}
