package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2vl, reason: invalid class name */
/* loaded from: 2vl.class */
public final class C2vl {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2vl[] A01;
    public final String text = "quick_promotion";

    static {
        C2vl[] c2vlArr = {new C2vl()};
        A01 = c2vlArr;
        A00 = C00t.A00(c2vlArr);
    }

    public static C2vl valueOf(String str) {
        return (C2vl) Enum.valueOf(C2vl.class, str);
    }

    public static C2vl[] values() {
        return (C2vl[]) A01.clone();
    }
}
