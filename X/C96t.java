package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96t, reason: invalid class name */
/* loaded from: 96t.class */
public final class C96t {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96t[] A01;
    public static final C96t A02;
    public static final C96t A03;
    public static final C96t A04;
    public static final C96t A05;
    public final boolean canScrollDown;
    public final boolean canScrollUp;

    static {
        C96t c96t = new C96t("UP_ONLY", 0, true, false);
        A05 = c96t;
        C96t c96t2 = new C96t("DOWN_ONLY", 1, false, true);
        A02 = c96t2;
        C96t c96t3 = new C96t("UP_AND_DOWN", 2, true, true);
        A04 = c96t3;
        C96t c96t4 = new C96t("NONE", 3, false, false);
        A03 = c96t4;
        C96t[] c96tArr = {c96t, c96t2, c96t3, c96t4};
        A01 = c96tArr;
        A00 = C00t.A00(c96tArr);
    }

    public C96t(String str, int i, boolean z, boolean z2) {
        this.canScrollUp = z;
        this.canScrollDown = z2;
    }

    public static C96t valueOf(String str) {
        return (C96t) Enum.valueOf(C96t.class, str);
    }

    public static C96t[] values() {
        return (C96t[]) A01.clone();
    }
}
