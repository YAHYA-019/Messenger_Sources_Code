package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95q, reason: invalid class name */
/* loaded from: 95q.class */
public final class C95q {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95q[] A01;
    public static final C95q A02;
    public static final C95q A03;
    public static final C95q A04;

    static {
        C95q c95q = new C95q("ERROR", 0);
        A02 = c95q;
        C95q c95q2 = new C95q("LOADING", 1);
        A04 = c95q2;
        C95q c95q3 = new C95q("LOADED", 2);
        A03 = c95q3;
        C95q[] c95qArr = {c95q, c95q2, c95q3};
        A01 = c95qArr;
        A00 = C00t.A00(c95qArr);
    }

    public C95q(String str, int i) {
    }

    public static C95q valueOf(String str) {
        return (C95q) Enum.valueOf(C95q.class, str);
    }

    public static C95q[] values() {
        return (C95q[]) A01.clone();
    }
}
