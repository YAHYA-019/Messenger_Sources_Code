package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95e, reason: invalid class name */
/* loaded from: 95e.class */
public final class C95e {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95e[] A01;
    public static final C95e A02;
    public static final C95e A03;
    public static final C95e A04;

    static {
        C95e c95e = new C95e("SoftNux", 0);
        A04 = c95e;
        C95e c95e2 = new C95e("HardNux", 1);
        A02 = c95e2;
        C95e c95e3 = new C95e("LeakageHardNux", 2);
        A03 = c95e3;
        C95e[] c95eArr = {c95e, c95e2, c95e3};
        A01 = c95eArr;
        A00 = C00t.A00(c95eArr);
    }

    public C95e(String str, int i) {
    }

    public static C95e valueOf(String str) {
        return (C95e) Enum.valueOf(C95e.class, str);
    }

    public static C95e[] values() {
        return (C95e[]) A01.clone();
    }
}
