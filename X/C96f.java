package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96f, reason: invalid class name */
/* loaded from: 96f.class */
public final class C96f {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96f[] A01;
    public static final C96f A02;
    public static final C96f A03;
    public static final C96f A04;
    public static final C96f A05;
    public static final C96f A06;
    public static final C96f A07;
    public final int value;

    static {
        C96f c96f = new C96f("NO_RESPONSE", 0, -1);
        A07 = c96f;
        C96f c96f2 = new C96f("GOING", 1, 0);
        A03 = c96f2;
        C96f c96f3 = new C96f("INTERESTED", 2, 1);
        A04 = c96f3;
        C96f c96f4 = new C96f("NOT_INTERESTED", 3, 2);
        A06 = c96f4;
        C96f c96f5 = new C96f("MAYBE", 4, 3);
        A05 = c96f5;
        C96f c96f6 = new C96f("CANT_GO", 5, 4);
        A02 = c96f6;
        C96f[] c96fArr = {c96f, c96f2, c96f3, c96f4, c96f5, c96f6};
        A01 = c96fArr;
        A00 = C00t.A00(c96fArr);
    }

    public C96f(String str, int i, int i2) {
        this.value = i2;
    }

    public static C96f valueOf(String str) {
        return (C96f) Enum.valueOf(C96f.class, str);
    }

    public static C96f[] values() {
        return (C96f[]) A01.clone();
    }
}
