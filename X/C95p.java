package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95p, reason: invalid class name */
/* loaded from: 95p.class */
public final class C95p {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95p[] A01;
    public static final C95p A02;
    public static final C95p A03;
    public static final C95p A04;

    static {
        C95p c95p = new C95p("LOADING", 0);
        A04 = c95p;
        C95p c95p2 = new C95p("LOADED", 1);
        A02 = c95p2;
        C95p c95p3 = new C95p("LOADED_EMPTY", 2);
        A03 = c95p3;
        C95p[] c95pArr = {c95p, c95p2, c95p3};
        A01 = c95pArr;
        A00 = C00t.A00(c95pArr);
    }

    public C95p(String str, int i) {
    }

    public static C95p valueOf(String str) {
        return (C95p) Enum.valueOf(C95p.class, str);
    }

    public static C95p[] values() {
        return (C95p[]) A01.clone();
    }
}
