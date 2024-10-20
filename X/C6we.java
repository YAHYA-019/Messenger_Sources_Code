package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6we, reason: invalid class name */
/* loaded from: 6we.class */
public final class C6we {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6we[] A01;
    public static final C6we A02;
    public static final C6we A03;
    public static final C6we A04;
    public static final C6we A05;
    public static final C6we A06;
    public static final C6we A07;
    public static final C6we A08;
    public static final C6we A09;
    public static final C6we A0A;

    static {
        C6we c6we = new C6we("SEND", 0);
        A0A = c6we;
        C6we c6we2 = new C6we("FAVORITE", 1);
        A06 = c6we2;
        C6we c6we3 = new C6we("REMOVE_FROM_FAVORITES", 2);
        A08 = c6we3;
        C6we c6we4 = new C6we("AI_GOOD_RESPONSE_FEEDBACK", 3);
        A05 = c6we4;
        C6we c6we5 = new C6we("AI_BAD_RESPONSE_FEEDBACK", 4);
        A03 = c6we5;
        C6we c6we6 = new C6we("REPORT", 5);
        A09 = c6we6;
        C6we c6we7 = new C6we("REMOVE", 6);
        A07 = c6we7;
        C6we c6we8 = new C6we("AI_ANIMATE", 7);
        A02 = c6we8;
        C6we c6we9 = new C6we("AI_DEANIMATE", 8);
        A04 = c6we9;
        C6we[] c6weArr = {c6we, c6we2, c6we3, c6we4, c6we5, c6we6, c6we7, c6we8, c6we9};
        A01 = c6weArr;
        A00 = C00t.A00(c6weArr);
    }

    public C6we(String str, int i) {
    }

    public static C6we valueOf(String str) {
        return (C6we) Enum.valueOf(C6we.class, str);
    }

    public static C6we[] values() {
        return (C6we[]) A01.clone();
    }
}
