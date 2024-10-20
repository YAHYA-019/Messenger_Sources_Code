package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5yg, reason: invalid class name */
/* loaded from: 5yg.class */
public final class C5yg {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5yg[] A01;
    public static final C5yg A02;
    public static final C5yg A03;
    public static final C5yg A04;
    public static final C5yg A05;

    static {
        C5yg c5yg = new C5yg("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A05 = c5yg;
        C5yg c5yg2 = new C5yg("NORMAL", 1);
        A04 = c5yg2;
        C5yg c5yg3 = new C5yg("DARK", 2);
        A02 = c5yg3;
        C5yg c5yg4 = new C5yg("NONE", 3);
        A03 = c5yg4;
        C5yg[] c5ygArr = {c5yg, c5yg2, c5yg3, c5yg4};
        A01 = c5ygArr;
        A00 = C00t.A00(c5ygArr);
    }

    public C5yg(String str, int i) {
    }

    public static C5yg valueOf(String str) {
        return (C5yg) Enum.valueOf(C5yg.class, str);
    }

    public static C5yg[] values() {
        return (C5yg[]) A01.clone();
    }
}
