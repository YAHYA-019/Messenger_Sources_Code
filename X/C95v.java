package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95v, reason: invalid class name */
/* loaded from: 95v.class */
public final class C95v {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95v[] A01;
    public static final C95v A02;
    public static final C95v A03;
    public static final C95v A04;

    static {
        C95v c95v = new C95v("ZERO", 0);
        A04 = c95v;
        C95v c95v2 = new C95v("LATE", 1);
        A03 = c95v2;
        C95v c95v3 = new C95v("LABEL", 2);
        A02 = c95v3;
        C95v[] c95vArr = {c95v, c95v2, c95v3};
        A01 = c95vArr;
        A00 = C00t.A00(c95vArr);
    }

    public C95v(String str, int i) {
    }

    public static C95v valueOf(String str) {
        return (C95v) Enum.valueOf(C95v.class, str);
    }

    public static C95v[] values() {
        return (C95v[]) A01.clone();
    }
}
