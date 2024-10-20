package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95k, reason: invalid class name */
/* loaded from: 95k.class */
public final class C95k {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95k[] A01;
    public static final C95k A02;
    public static final C95k A03;
    public static final C95k A04;

    static {
        C95k c95k = new C95k("ORIGINAL", 0);
        A03 = c95k;
        C95k c95k2 = new C95k("FULL", 1);
        A02 = c95k2;
        C95k c95k3 = new C95k("OUTLINE", 2);
        A04 = c95k3;
        C95k[] c95kArr = {c95k, c95k2, c95k3};
        A01 = c95kArr;
        A00 = C00t.A00(c95kArr);
    }

    public C95k(String str, int i) {
    }

    public static C95k valueOf(String str) {
        return (C95k) Enum.valueOf(C95k.class, str);
    }

    public static C95k[] values() {
        return (C95k[]) A01.clone();
    }
}
