package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1md, reason: invalid class name */
/* loaded from: 1md.class */
public final class C1md {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1md[] A01;
    public static final C1md A02;
    public static final C1md A03;

    static {
        C1md c1md = new C1md("APP_USE", 0);
        A03 = c1md;
        C1md c1md2 = new C1md("ALWAYS", 1);
        A02 = c1md2;
        C1md[] c1mdArr = {c1md, c1md2};
        A01 = c1mdArr;
        A00 = C00t.A00(c1mdArr);
    }

    public C1md(String str, int i) {
    }

    public static C1md valueOf(String str) {
        return (C1md) Enum.valueOf(C1md.class, str);
    }

    public static C1md[] values() {
        return (C1md[]) A01.clone();
    }
}
