package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96m, reason: invalid class name */
/* loaded from: 96m.class */
public final class C96m {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96m[] A01;
    public static final C96m A02;
    public static final C96m A03;
    public static final C96m A04;
    public static final C96m A05;
    public static final C96m A06;
    public static final C96m A07;
    public static final C96m A08;
    public static final C96m A09;
    public static final C96m A0A;
    public static final C96m A0B;
    public static final C96m A0C;
    public static final C96m A0D;
    public final C95e type;

    static {
        C95e c95e = C95e.A04;
        C96m c96m = new C96m(c95e, "SoftNux", 0);
        A0D = c96m;
        C95e c95e2 = C95e.A02;
        C96m c96m2 = new C96m(c95e2, "HardNux", 1);
        A06 = c96m2;
        C96m c96m3 = new C96m(c95e, "GDriveSoftNux", 2);
        A05 = c96m3;
        C96m c96m4 = new C96m(c95e2, "GDriveHardNux", 3);
        A04 = c96m4;
        C96m c96m5 = new C96m(c95e, "ResetPinSoftNux", 4);
        A0C = c96m5;
        C96m c96m6 = new C96m(c95e2, "ResetPinHardNux", 5);
        A0B = c96m6;
        C96m c96m7 = new C96m(c95e, "ConfirmPinSoftNux", 6);
        A03 = c96m7;
        C96m c96m8 = new C96m(c95e2, "ConfirmPinHardNux", 7);
        A02 = c96m8;
        C95e c95e3 = C95e.A03;
        C96m c96m9 = new C96m(c95e3, "LeakageGDriveHardNux", 8);
        A07 = c96m9;
        C96m c96m10 = new C96m(c95e3, "LeakageHsmHardNux", 9);
        A08 = c96m10;
        C96m c96m11 = new C96m(c95e2, "NewUserOnboardingNux", 10);
        A09 = c96m11;
        C96m c96m12 = new C96m(c95e, "NoEligibleTouchPoint", 11);
        A0A = c96m12;
        C96m[] c96mArr = {c96m, c96m2, c96m3, c96m4, c96m5, c96m6, c96m7, c96m8, c96m9, c96m10, c96m11, c96m12};
        A01 = c96mArr;
        A00 = C00t.A00(c96mArr);
    }

    public C96m(C95e c95e, String str, int i) {
        this.type = c95e;
    }

    public static C96m valueOf(String str) {
        return (C96m) Enum.valueOf(C96m.class, str);
    }

    public static C96m[] values() {
        return (C96m[]) A01.clone();
    }
}
