package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98a, reason: invalid class name */
/* loaded from: 98a.class */
public final class C98a implements AXD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C98a[] A01;
    public static final C98a A02;
    public final String text = "open_drawer";

    static {
        C98a c98a = new C98a();
        A02 = c98a;
        C98a[] c98aArr = {c98a};
        A01 = c98aArr;
        A00 = C00t.A00(c98aArr);
    }

    public static C98a valueOf(String str) {
        return (C98a) Enum.valueOf(C98a.class, str);
    }

    public static C98a[] values() {
        return (C98a[]) A01.clone();
    }
}
