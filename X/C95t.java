package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95t, reason: invalid class name */
/* loaded from: 95t.class */
public final class C95t {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95t[] A01;
    public static final C95t A02;
    public static final C95t A03;
    public static final C95t A04;

    static {
        C95t c95t = new C95t("VIDEO", 0);
        A04 = c95t;
        C95t c95t2 = new C95t("AUDIO", 1);
        A02 = c95t2;
        C95t c95t3 = new C95t("LINK", 2);
        A03 = c95t3;
        C95t[] c95tArr = {c95t, c95t2, c95t3};
        A01 = c95tArr;
        A00 = C00t.A00(c95tArr);
    }

    public C95t(String str, int i) {
    }

    public static C95t valueOf(String str) {
        return (C95t) Enum.valueOf(C95t.class, str);
    }

    public static C95t[] values() {
        return (C95t[]) A01.clone();
    }
}
