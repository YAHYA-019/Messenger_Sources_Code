package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95w, reason: invalid class name */
/* loaded from: 95w.class */
public final class C95w {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95w[] A01;
    public static final C95w A02;
    public static final C95w A03;
    public static final C95w A04;

    static {
        C95w c95w = new C95w("VScrollDynamicSizeGrid", 0);
        A03 = c95w;
        C95w c95w2 = new C95w("VScrollFixedSizeGrid", 1);
        A04 = c95w2;
        C95w c95w3 = new C95w("HScroll", 2);
        A02 = c95w3;
        C95w[] c95wArr = {c95w, c95w2, c95w3};
        A01 = c95wArr;
        A00 = C00t.A00(c95wArr);
    }

    public C95w(String str, int i) {
    }

    public static C95w valueOf(String str) {
        return (C95w) Enum.valueOf(C95w.class, str);
    }

    public static C95w[] values() {
        return (C95w[]) A01.clone();
    }
}
