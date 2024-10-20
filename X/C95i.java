package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95i, reason: invalid class name */
/* loaded from: 95i.class */
public final class C95i {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95i[] A01;
    public static final C95i A02;
    public static final C95i A03;
    public static final C95i A04;

    static {
        C95i c95i = new C95i("NONE", 0);
        A03 = c95i;
        C95i c95i2 = new C95i("BACKGROUND", 1);
        A02 = c95i2;
        C95i c95i3 = new C95i("PADDED", 2);
        A04 = c95i3;
        C95i[] c95iArr = {c95i, c95i2, c95i3, new C95i("EDGE_TO_EDGE", 3)};
        A01 = c95iArr;
        A00 = C00t.A00(c95iArr);
    }

    public C95i(String str, int i) {
    }

    public static C95i valueOf(String str) {
        return (C95i) Enum.valueOf(C95i.class, str);
    }

    public static C95i[] values() {
        return (C95i[]) A01.clone();
    }
}
