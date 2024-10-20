package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96g, reason: invalid class name */
/* loaded from: 96g.class */
public final class C96g {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96g[] A01;
    public static final C96g A02;
    public static final C96g A03;
    public static final C96g A04;
    public static final C96g A05;
    public static final C96g A06;
    public static final C96g A07;
    public final int value;

    static {
        C96g c96g = new C96g("PHOTO", 0, 0);
        A05 = c96g;
        C96g c96g2 = new C96g("VIDEO", 1, 1);
        A07 = c96g2;
        C96g c96g3 = new C96g("BLUE_POST", 2, 2);
        A02 = c96g3;
        C96g c96g4 = new C96g("BLUE_POST_MULTI_PHOTO", 3, 3);
        A03 = c96g4;
        C96g c96g5 = new C96g("CC_XMA", 4, 4);
        A04 = c96g5;
        C96g c96g6 = new C96g("STORY", 5, 5);
        A06 = c96g6;
        C96g[] c96gArr = {c96g, c96g2, c96g3, c96g4, c96g5, c96g6, new C96g("TEXT_ONLY", 6, 6)};
        A01 = c96gArr;
        A00 = C00t.A00(c96gArr);
    }

    public C96g(String str, int i, int i2) {
        this.value = i2;
    }

    public static C96g valueOf(String str) {
        return (C96g) Enum.valueOf(C96g.class, str);
    }

    public static C96g[] values() {
        return (C96g[]) A01.clone();
    }
}
