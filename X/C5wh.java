package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5wh, reason: invalid class name */
/* loaded from: 5wh.class */
public final class C5wh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5wh[] A01;
    public static final C5wh A02;
    public static final C5wh A03;
    public static final C5wh A04;
    public static final C5wh A05;
    public static final C5wh A06;
    public static final C5wh A07;
    public static final C5wh A08;
    public static final C5wh A09;
    public static final C5wh A0A;
    public String momentTypeString = "";

    static {
        C5wh c5wh = new C5wh("NONE", 0);
        A09 = c5wh;
        C5wh c5wh2 = new C5wh("MOTHERS_DAY", 1);
        A07 = c5wh2;
        C5wh c5wh3 = new C5wh("FATHERS_DAY", 2);
        A02 = c5wh3;
        C5wh c5wh4 = new C5wh("GRADUATION", 3);
        A06 = c5wh4;
        C5wh c5wh5 = new C5wh("NATIONAL_SELFIE", 4);
        A08 = c5wh5;
        C5wh c5wh6 = new C5wh("PH_INDEPENDENCE_DAY", 5);
        A0A = c5wh6;
        C5wh c5wh7 = new C5wh("FOURTH_OF_JULY", 6);
        A03 = c5wh7;
        C5wh c5wh8 = new C5wh("FRIENDSHIP_DAY", 7);
        A04 = c5wh8;
        C5wh c5wh9 = new C5wh("FROM_SERVER", 8);
        A05 = c5wh9;
        C5wh[] c5whArr = {c5wh, c5wh2, c5wh3, c5wh4, c5wh5, c5wh6, c5wh7, c5wh8, c5wh9};
        A01 = c5whArr;
        A00 = C00t.A00(c5whArr);
    }

    public C5wh(String str, int i) {
    }

    public static C5wh valueOf(String str) {
        return (C5wh) Enum.valueOf(C5wh.class, str);
    }

    public static C5wh[] values() {
        return (C5wh[]) A01.clone();
    }
}
