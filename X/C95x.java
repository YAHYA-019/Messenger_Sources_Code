package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95x, reason: invalid class name */
/* loaded from: 95x.class */
public final class C95x {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95x[] A01;
    public static final C95x A02;
    public static final C95x A03;
    public static final C95x A04;

    static {
        C95x c95x = new C95x("GlimmerMinOpacity", 0);
        A03 = c95x;
        C95x c95x2 = new C95x("GlimmerMaxOpacity", 1);
        A02 = c95x2;
        C95x c95x3 = new C95x("SuggestionsOverlayImagineText", 2);
        A04 = c95x3;
        C95x[] c95xArr = {c95x, c95x2, c95x3};
        A01 = c95xArr;
        A00 = C00t.A00(c95xArr);
    }

    public C95x(String str, int i) {
    }

    public static C95x valueOf(String str) {
        return (C95x) Enum.valueOf(C95x.class, str);
    }

    public static C95x[] values() {
        return (C95x[]) A01.clone();
    }
}
