package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96h, reason: invalid class name */
/* loaded from: 96h.class */
public final class C96h {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96h[] A01;
    public static final C96h A02;
    public static final C96h A03;
    public static final C96h A04;
    public static final C96h A05;
    public static final C96h A06;
    public static final C96h A07;
    public final String finderKey;

    static {
        C96h c96h = new C96h("ARMADILLO_MEDIA", 0, "ARMADILLO_MEDIA");
        A04 = c96h;
        C96h c96h2 = new C96h("ARMADILLO_LINKS", 1, "ARMADILLO_LINKS");
        A03 = c96h2;
        C96h c96h3 = new C96h("ARMADILLO_FILES", 2, "ARMADILLO_FILES");
        A02 = c96h3;
        C96h c96h4 = new C96h("MEDIA", 3, "MEDIA");
        A07 = c96h4;
        C96h c96h5 = new C96h("FILES", 4, "FILES");
        A05 = c96h5;
        C96h c96h6 = new C96h("LINKS", 5, "LINKS");
        A06 = c96h6;
        C96h[] c96hArr = {c96h, c96h2, c96h3, c96h4, c96h5, c96h6};
        A01 = c96hArr;
        A00 = C00t.A00(c96hArr);
    }

    public C96h(String str, int i, String str2) {
        this.finderKey = str2;
    }

    public static C96h valueOf(String str) {
        return (C96h) Enum.valueOf(C96h.class, str);
    }

    public static C96h[] values() {
        return (C96h[]) A01.clone();
    }
}
