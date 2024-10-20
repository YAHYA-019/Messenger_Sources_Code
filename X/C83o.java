package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.83o, reason: invalid class name */
/* loaded from: 83o.class */
public final class C83o {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C83o[] A01;
    public static final C83o A02;
    public static final C83o A03;
    public static final C83o A04;

    static {
        C83o c83o = new C83o("DEFAULT", 0);
        A02 = c83o;
        C83o c83o2 = new C83o("OPAQUE", 1);
        A03 = c83o2;
        C83o c83o3 = new C83o("TRANSPARENT_ENABLED", 2);
        A04 = c83o3;
        C83o[] c83oArr = {c83o, c83o2, c83o3};
        A01 = c83oArr;
        A00 = C00t.A00(c83oArr);
    }

    public C83o(String str, int i) {
    }

    public static C83o valueOf(String str) {
        return (C83o) Enum.valueOf(C83o.class, str);
    }

    public static C83o[] values() {
        return (C83o[]) A01.clone();
    }
}
