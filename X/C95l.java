package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95l, reason: invalid class name */
/* loaded from: 95l.class */
public final class C95l {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95l[] A01;
    public static final C95l A02;
    public static final C95l A03;
    public static final C95l A04;

    static {
        C95l c95l = new C95l("HORIZONTAL", 0);
        A02 = c95l;
        C95l c95l2 = new C95l("VERTICAL_LIST", 1);
        A04 = c95l2;
        C95l c95l3 = new C95l("VERTICAL_COLUMN", 2);
        A03 = c95l3;
        C95l[] c95lArr = {c95l, c95l2, c95l3};
        A01 = c95lArr;
        A00 = C00t.A00(c95lArr);
    }

    public C95l(String str, int i) {
    }

    public static C95l valueOf(String str) {
        return (C95l) Enum.valueOf(C95l.class, str);
    }

    public static C95l[] values() {
        return (C95l[]) A01.clone();
    }
}
