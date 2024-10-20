package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2o9, reason: invalid class name */
/* loaded from: 2o9.class */
public final class C2o9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2o9[] A01;
    public static final C2o9 A02;
    public static final C2o9 A03;
    public static final C2o9 A04;
    public static final C2o9 A05;
    public static final C2o9 A06;
    public static final C2o9 A07;
    public static final C2o9 A08;

    static {
        C2o9 c2o9 = new C2o9("NONE", 0);
        A05 = c2o9;
        C2o9 c2o92 = new C2o9("SENDING", 1);
        A07 = c2o92;
        C2o9 c2o93 = new C2o9("SENT", 2);
        A08 = c2o93;
        C2o9 c2o94 = new C2o9("DELIVERED", 3);
        A02 = c2o94;
        C2o9 c2o95 = new C2o9("SEEN", 4);
        A06 = c2o95;
        C2o9 c2o96 = new C2o9("FAILED_RETRY", 5);
        A04 = c2o96;
        C2o9 c2o97 = new C2o9("FAILED_NO_RETRY", 6);
        A03 = c2o97;
        C2o9[] c2o9Arr = {c2o9, c2o92, c2o93, c2o94, c2o95, c2o96, c2o97};
        A01 = c2o9Arr;
        A00 = C00t.A00(c2o9Arr);
    }

    public C2o9(String str, int i) {
    }

    public static C2o9 valueOf(String str) {
        return (C2o9) Enum.valueOf(C2o9.class, str);
    }

    public static C2o9[] values() {
        return (C2o9[]) A01.clone();
    }
}
