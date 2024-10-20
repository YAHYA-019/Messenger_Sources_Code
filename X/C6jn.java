package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6jn, reason: invalid class name */
/* loaded from: 6jn.class */
public final class C6jn {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6jn[] A01;
    public static final C6jn A02;
    public static final C6jn A03;
    public static final C6jn A04;
    public static final C6jn A05;
    public static final C6jn A06;
    public static final C6jn A07;
    public static final C6jn A08;
    public static final C6jn A09;
    public static final C6jn A0A;

    static {
        C6jn c6jn = new C6jn("NONE", 0);
        A08 = c6jn;
        C6jn c6jn2 = new C6jn("FLOAT_HEARTS", 1);
        A04 = c6jn2;
        C6jn c6jn3 = new C6jn("FLOAT_BALLOONS", 2);
        A02 = c6jn3;
        C6jn c6jn4 = new C6jn("SNOW_FALL", 3);
        A0A = c6jn4;
        C6jn c6jn5 = new C6jn("LIGHT_WEIGHT_REACTION_REPLY", 4);
        A07 = c6jn5;
        C6jn c6jn6 = new C6jn("FLOAT_TROPHIES", 5);
        A06 = c6jn6;
        C6jn c6jn7 = new C6jn("RAIN_MOONS", 6);
        A09 = c6jn7;
        C6jn c6jn8 = new C6jn("FLOAT_EMOJI", 7);
        A03 = c6jn8;
        C6jn c6jn9 = new C6jn("FLOAT_MAGIC_EMOJI", 8);
        A05 = c6jn9;
        C6jn[] c6jnArr = {c6jn, c6jn2, c6jn3, c6jn4, c6jn5, c6jn6, c6jn7, c6jn8, c6jn9};
        A01 = c6jnArr;
        A00 = C00t.A00(c6jnArr);
    }

    public C6jn(String str, int i) {
    }

    public static C6jn valueOf(String str) {
        return (C6jn) Enum.valueOf(C6jn.class, str);
    }

    public static C6jn[] values() {
        return (C6jn[]) A01.clone();
    }
}
