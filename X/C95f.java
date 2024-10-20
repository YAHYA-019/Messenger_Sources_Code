package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95f, reason: invalid class name */
/* loaded from: 95f.class */
public final class C95f {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95f[] A01;
    public static final C95f A02;
    public static final C95f A03;
    public static final C95f A04;

    static {
        C95f c95f = new C95f("Init", 0);
        A03 = c95f;
        C95f c95f2 = new C95f("Success", 1);
        A04 = c95f2;
        C95f c95f3 = new C95f("Failed", 2);
        A02 = c95f3;
        C95f[] c95fArr = {c95f, c95f2, c95f3, new C95f("RunningAsync", 3)};
        A01 = c95fArr;
        A00 = C00t.A00(c95fArr);
    }

    public C95f(String str, int i) {
    }

    public static C95f valueOf(String str) {
        return (C95f) Enum.valueOf(C95f.class, str);
    }

    public static C95f[] values() {
        return (C95f[]) A01.clone();
    }
}
