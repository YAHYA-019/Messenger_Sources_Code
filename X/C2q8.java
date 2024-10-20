package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2q8, reason: invalid class name */
/* loaded from: 2q8.class */
public final class C2q8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2q8[] A01;
    public static final C2q8 A02;
    public static final C2q8 A03;
    public static final C2q8 A04;

    static {
        C2q8 c2q8 = new C2q8("NONE", 0);
        A03 = c2q8;
        C2q8 c2q82 = new C2q8("SOLID", 1);
        A04 = c2q82;
        C2q8 c2q83 = new C2q8("BRANDED_GRADIENT", 2);
        A02 = c2q83;
        C2q8[] c2q8Arr = {c2q8, c2q82, c2q83};
        A01 = c2q8Arr;
        A00 = C00t.A00(c2q8Arr);
    }

    public C2q8(String str, int i) {
    }

    public static C2q8 valueOf(String str) {
        return (C2q8) Enum.valueOf(C2q8.class, str);
    }

    public static C2q8[] values() {
        return (C2q8[]) A01.clone();
    }
}
