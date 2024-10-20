package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6x3, reason: invalid class name */
/* loaded from: 6x3.class */
public final class C6x3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6x3[] A01;
    public static final C6x3 A02;
    public static final C6x3 A03;
    public static final C6x3 A04;

    static {
        C6x3 c6x3 = new C6x3("FRONT_FACING", 0);
        A03 = c6x3;
        C6x3 c6x32 = new C6x3("BACK_FACING", 1);
        A02 = c6x32;
        C6x3 c6x33 = new C6x3("UNSPECIFIED", 2);
        A04 = c6x33;
        C6x3[] c6x3Arr = {c6x3, c6x32, c6x33};
        A01 = c6x3Arr;
        A00 = C00t.A00(c6x3Arr);
    }

    public C6x3(String str, int i) {
    }

    public static C6x3 valueOf(String str) {
        return (C6x3) Enum.valueOf(C6x3.class, str);
    }

    public static C6x3[] values() {
        return (C6x3[]) A01.clone();
    }
}
