package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95g, reason: invalid class name */
/* loaded from: 95g.class */
public final class C95g {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95g[] A01;
    public static final C95g A02;
    public static final C95g A03;
    public static final C95g A04;

    static {
        C95g c95g = new C95g("OptOutSuccess", 0);
        A03 = c95g;
        C95g c95g2 = new C95g("GDriveDeleteSuccess", 1);
        A02 = c95g2;
        C95g c95g3 = new C95g("PasskeyDeleted", 2);
        A04 = c95g3;
        C95g[] c95gArr = {c95g, c95g2, c95g3};
        A01 = c95gArr;
        A00 = C00t.A00(c95gArr);
    }

    public C95g(String str, int i) {
    }

    public static C95g valueOf(String str) {
        return (C95g) Enum.valueOf(C95g.class, str);
    }

    public static C95g[] values() {
        return (C95g[]) A01.clone();
    }
}
