package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNQ.class */
public final class KNQ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNQ[] A01;
    public static final KNQ A02;
    public static final KNQ A03;
    public static final KNQ A04;
    public static final KNQ A05;
    public static final KNQ A06;
    public static final KNQ A07;
    public static final KNQ A08;
    public static final KNQ A09;
    public static final KNQ A0A;
    public static final KNQ A0B;
    public static final KNQ A0C;
    public static final KNQ A0D;
    public static final KNQ A0E;
    public static final KNQ A0F;
    public static final KNQ A0G;
    public static final KNQ A0H;
    public static final KNQ A0I;
    public static final KNQ A0J;
    public static final KNQ A0K;
    public static final KNQ A0L;
    public static final KNQ A0M;
    public static final KNQ A0N;
    public static final KNQ A0O;

    static {
        KNQ knq = new KNQ("BROWSER_BACK", 0);
        A03 = knq;
        KNQ knq2 = new KNQ("BROWSER_CLOSE", 1);
        A04 = knq2;
        KNQ knq3 = new KNQ("BROWSER_FORWARD", 2);
        A05 = knq3;
        KNQ knq4 = new KNQ("BWP_MORE_INFO", 3);
        A08 = knq4;
        KNQ knq5 = new KNQ("BWP_MORE_INFO_OVERFLOW", 4);
        A09 = knq5;
        KNQ knq6 = new KNQ("COPY_LINK", 5);
        A0A = knq6;
        KNQ knq7 = new KNQ("CRASH_RENDERER", 6);
        A0B = knq7;
        KNQ knq8 = new KNQ("TAB_SELECTOR", 7);
        A0M = knq8;
        KNQ knq9 = new KNQ("SHARE", 8);
        A0K = knq9;
        KNQ knq10 = new KNQ("BOOKMARK", 9);
        A02 = knq10;
        KNQ knq11 = new KNQ("SAVED_SESSION", 10);
        A0H = knq11;
        KNQ knq12 = new KNQ("HISTORY", 11);
        A0D = knq12;
        KNQ knq13 = new KNQ("HISTORY_OVERFLOW", 12);
        A0E = knq13;
        KNQ knq14 = new KNQ("DIVIDER", 13);
        A0C = knq14;
        KNQ knq15 = new KNQ("BROWSER_REFRESH", 14);
        A06 = knq15;
        KNQ knq16 = new KNQ("OPEN_EXTERNAL_BROWSER", 15);
        A0G = knq16;
        KNQ knq17 = new KNQ("MARK_LINK_AS_SUSPICIOUS", 16);
        A0F = knq17;
        KNQ knq18 = new KNQ("WEBSITE_SECURITY", 17);
        A0O = knq18;
        KNQ knq19 = new KNQ("USING_HELIUM", 18);
        A0N = knq19;
        KNQ knq20 = new KNQ("BROWSER_SETTINGS", 19);
        A07 = knq20;
        KNQ knq21 = new KNQ("SEARCH", 20);
        A0I = knq21;
        KNQ knq22 = new KNQ("SEARCH_BOTTOM", 21);
        A0J = knq22;
        KNQ knq23 = new KNQ("TAB_SEARCH", 22);
        A0L = knq23;
        KNQ[] knqArr = {knq, knq2, knq3, knq4, knq5, knq6, knq7, knq8, knq9, knq10, knq11, knq12, knq13, knq14, knq15, knq16, knq17, knq18, knq19, knq20, knq21, knq22, knq23};
        A01 = knqArr;
        A00 = C00t.A00(knqArr);
    }

    public KNQ(String str, int i) {
    }

    public static KNQ valueOf(String str) {
        return (KNQ) Enum.valueOf(KNQ.class, str);
    }

    public static KNQ[] values() {
        return (KNQ[]) A01.clone();
    }
}
