package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.03i, reason: invalid class name */
/* loaded from: 03i.class */
public final class C03i {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C03i[] A01;
    public static final C03i A02;
    public static final C03i A03;
    public static final C03i A04;

    static {
        C03i c03i = new C03i("SYNCHRONIZED", 0);
        A04 = c03i;
        C03i c03i2 = new C03i("PUBLICATION", 1);
        A03 = c03i2;
        C03i c03i3 = new C03i("NONE", 2);
        A02 = c03i3;
        C03i[] c03iArr = {c03i, c03i2, c03i3};
        A01 = c03iArr;
        A00 = C00t.A00(c03iArr);
    }

    public C03i(String str, int i) {
    }

    public static C03i valueOf(String str) {
        return (C03i) Enum.valueOf(C03i.class, str);
    }

    public static C03i[] values() {
        return (C03i[]) A01.clone();
    }
}
