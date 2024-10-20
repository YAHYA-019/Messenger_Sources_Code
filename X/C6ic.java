package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6ic, reason: invalid class name */
/* loaded from: 6ic.class */
public final class C6ic {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6ic[] A01;
    public static final C6ic A02;
    public static final C6ic A03;
    public static final C6ic A04;
    public static final C6ic A05;
    public static final C6ic A06;
    public static final C6ic A07;
    public static final C6ic A08;
    public static final C6ic A09;
    public static final C6ic A0A;
    public static final C6ic A0B;
    public static final C6ic A0C;
    public static final C6ic A0D;
    public static final C6ic A0E;
    public static final C6ic A0F;

    static {
        C6ic c6ic = new C6ic("OPEN_STAX", 0);
        A0E = c6ic;
        C6ic c6ic2 = new C6ic("ARMADILLO", 1);
        A04 = c6ic2;
        C6ic c6ic3 = new C6ic("COMMUNITY_MESSAGING", 2);
        A0D = c6ic3;
        C6ic c6ic4 = new C6ic("AI_BOT", 3);
        A02 = c6ic4;
        C6ic c6ic5 = new C6ic("BUSINESS_MESSAGING", 4);
        A0A = c6ic5;
        C6ic c6ic6 = new C6ic("BIZAPP_MESSENGER", 5);
        A07 = c6ic6;
        C6ic c6ic7 = new C6ic("BIZAPP_IGD", 6);
        A06 = c6ic7;
        C6ic c6ic8 = new C6ic("BIZAPP_MTV", 7);
        A08 = c6ic8;
        C6ic c6ic9 = new C6ic("CHANNELS", 8);
        A0B = c6ic9;
        C6ic c6ic10 = new C6ic("CHAT_HEAD", 9);
        A0C = c6ic10;
        C6ic c6ic11 = new C6ic("ARMADILLO_CHAT_HEAD", 10);
        A05 = c6ic11;
        C6ic c6ic12 = new C6ic("BUBBLES", 11);
        A09 = c6ic12;
        C6ic c6ic13 = new C6ic("WORKCHAT", 12);
        A0F = c6ic13;
        C6ic c6ic14 = new C6ic("ALL", 13);
        A03 = c6ic14;
        C6ic[] c6icArr = {c6ic, c6ic2, c6ic3, c6ic4, c6ic5, c6ic6, c6ic7, c6ic8, c6ic9, c6ic10, c6ic11, c6ic12, c6ic13, c6ic14};
        A01 = c6icArr;
        A00 = C00t.A00(c6icArr);
    }

    public C6ic(String str, int i) {
    }

    public static C6ic valueOf(String str) {
        return (C6ic) Enum.valueOf(C6ic.class, str);
    }

    public static C6ic[] values() {
        return (C6ic[]) A01.clone();
    }
}
