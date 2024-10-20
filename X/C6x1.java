package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6x1, reason: invalid class name */
/* loaded from: 6x1.class */
public final class C6x1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6x1[] A01;
    public static final C6x1 A02;
    public static final C6x1 A03;
    public static final C6x1 A04;
    public static final C6x1 A05;
    public static final C6x1 A06;

    static {
        C6x1 c6x1 = new C6x1("MEDIA_PICKER", 0);
        A04 = c6x1;
        C6x1 c6x12 = new C6x1("CAMERA", 1);
        A02 = c6x12;
        C6x1 c6x13 = new C6x1("PALETTE", 2);
        A06 = c6x13;
        C6x1 c6x14 = new C6x1("CUSTOM_IMAGE", 3);
        A03 = c6x14;
        C6x1 c6x15 = new C6x1("NONE", 4);
        A05 = c6x15;
        C6x1[] c6x1Arr = {c6x1, c6x12, c6x13, c6x14, c6x15};
        A01 = c6x1Arr;
        A00 = C00t.A00(c6x1Arr);
    }

    public C6x1(String str, int i) {
    }

    public static C6x1 valueOf(String str) {
        return (C6x1) Enum.valueOf(C6x1.class, str);
    }

    public static C6x1[] values() {
        return (C6x1[]) A01.clone();
    }
}
