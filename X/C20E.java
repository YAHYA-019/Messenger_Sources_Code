package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.20E, reason: invalid class name */
/* loaded from: 20E.class */
public final class C20E {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C20E[] A02;
    public static final C20E A03;
    public static final C20E A04;
    public static final C20E A05;
    public final int value;

    static {
        C20E c20e = new C20E("ENABLED", 0, 1);
        A05 = c20e;
        C20E c20e2 = new C20E("DISABLE_REQUESTED", 1, 2);
        A03 = c20e2;
        C20E c20e3 = new C20E("DISABLING", 2, 3);
        A04 = c20e3;
        C20E[] c20eArr = {c20e, c20e2, c20e3, new C20E("DISABLED", 3, 4)};
        A02 = c20eArr;
        A01 = C00t.A00(c20eArr);
        A00 = C01g.A01(20I.A00);
    }

    public C20E(String str, int i, int i2) {
        this.value = i2;
    }

    public static C20E valueOf(String str) {
        return (C20E) Enum.valueOf(C20E.class, str);
    }

    public static C20E[] values() {
        return (C20E[]) A02.clone();
    }
}
