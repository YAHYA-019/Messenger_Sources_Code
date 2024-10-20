package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95a, reason: invalid class name */
/* loaded from: 95a.class */
public final class C95a {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95a[] A01;
    public static final C95a A02;
    public static final C95a A03;
    public static final C95a A04;

    static {
        C95a c95a = new C95a("LOADING", 0);
        A04 = c95a;
        C95a c95a2 = new C95a("LOADED", 1);
        A02 = c95a2;
        C95a c95a3 = new C95a("LOADED_EMPTY", 2);
        A03 = c95a3;
        C95a[] c95aArr = {c95a, c95a2, c95a3};
        A01 = c95aArr;
        A00 = C00t.A00(c95aArr);
    }

    public C95a(String str, int i) {
    }

    public static C95a valueOf(String str) {
        return (C95a) Enum.valueOf(C95a.class, str);
    }

    public static C95a[] values() {
        return (C95a[]) A01.clone();
    }
}
