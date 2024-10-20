package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Hx, reason: invalid class name */
/* loaded from: 4Hx.class */
public final class C4Hx {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4Hx[] A01;
    public static final C4Hx A02;
    public static final C4Hx A03;

    static {
        C4Hx c4Hx = new C4Hx("ELIGIBLE", 0);
        A02 = c4Hx;
        C4Hx c4Hx2 = new C4Hx("INELIGIBLE", 1);
        A03 = c4Hx2;
        C4Hx[] c4HxArr = {c4Hx, c4Hx2};
        A01 = c4HxArr;
        A00 = C00t.A00(c4HxArr);
    }

    public C4Hx(String str, int i) {
    }

    public static C4Hx valueOf(String str) {
        return (C4Hx) Enum.valueOf(C4Hx.class, str);
    }

    public static C4Hx[] values() {
        return (C4Hx[]) A01.clone();
    }
}
