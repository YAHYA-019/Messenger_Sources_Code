package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95o, reason: invalid class name */
/* loaded from: 95o.class */
public final class C95o {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95o[] A01;
    public static final C95o A02;
    public static final C95o A03;
    public static final C95o A04;

    static {
        C95o c95o = new C95o("MEDIA_VIEWER", 0);
        A03 = c95o;
        C95o c95o2 = new C95o("THREAD_SETTINGS", 1);
        A04 = c95o2;
        C95o c95o3 = new C95o("HIGHLIGHTS_TAB", 2);
        A02 = c95o3;
        C95o[] c95oArr = {c95o, c95o2, c95o3};
        A01 = c95oArr;
        A00 = C00t.A00(c95oArr);
    }

    public C95o(String str, int i) {
    }

    public static C95o valueOf(String str) {
        return (C95o) Enum.valueOf(C95o.class, str);
    }

    public static C95o[] values() {
        return (C95o[]) A01.clone();
    }
}
