package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.04m, reason: invalid class name */
/* loaded from: 04m.class */
public final class C04m {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C04m[] A01;
    public static final C04m A02;
    public static final C04m A03;
    public static final C04m A04;
    public static final C04m A05;
    public static final C04m A06;
    public static final C04m A07;
    public static final C04m A08;
    public static final C04m A09;
    public static final C04m A0A;
    public static final C04m A0B;

    static {
        C04m c04m = new C04m("NO_ANR_DETECTED", 0);
        A04 = c04m;
        C04m c04m2 = new C04m("DURING_ANR", 1);
        A03 = c04m2;
        C04m c04m3 = new C04m("ANR_RECOVERED", 2);
        A02 = c04m3;
        C04m c04m4 = new C04m("SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED", 3);
        A0A = c04m4;
        C04m c04m5 = new C04m("SIGQUIT_RECEIVED_AM_CONFIRMED_MT_BLOCKED", 4);
        A07 = c04m5;
        C04m c04m6 = new C04m("SIGQUIT_RECEIVED_AM_CONFIRMED_MT_UNBLOCKED", 5);
        A08 = c04m6;
        C04m c04m7 = new C04m("SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_UNBLOCKED", 6);
        A0B = c04m7;
        C04m c04m8 = new C04m("SIGQUIT_RECEIVED_AM_EXPIRED_MT_BLOCKED", 7);
        A09 = c04m8;
        C04m c04m9 = new C04m("NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED", 8);
        A05 = c04m9;
        C04m c04m10 = new C04m("NO_SIGQUIT_AM_CONFIRMED_MT_UNBLOCKED", 9);
        A06 = c04m10;
        C04m[] c04mArr = {c04m, c04m2, c04m3, c04m4, c04m5, c04m6, c04m7, c04m8, c04m9, c04m10};
        A01 = c04mArr;
        A00 = C00t.A00(c04mArr);
    }

    public C04m(String str, int i) {
    }

    public static C04m valueOf(String str) {
        return (C04m) Enum.valueOf(C04m.class, str);
    }

    public static C04m[] values() {
        return (C04m[]) A01.clone();
    }
}
