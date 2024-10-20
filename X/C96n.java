package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96n, reason: invalid class name */
/* loaded from: 96n.class */
public final class C96n {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96n[] A01;
    public static final C96n A02;
    public static final C96n A03;
    public static final C96n A04;
    public static final C96n A05;
    public static final C96n A06;
    public static final C96n A07;
    public static final C96n A08;
    public static final C96n A09;
    public static final C96n A0A;
    public static final C96n A0B;
    public static final C96n A0C;
    public static final C96n A0D;
    public final int type;

    static {
        C96n c96n = new C96n("DEFAULT", 0, 0);
        A03 = c96n;
        C96n c96n2 = new C96n("COLLAGE", 1, 1);
        A02 = c96n2;
        C96n c96n3 = new C96n("VIDEO", 2, 2);
        A0B = c96n3;
        C96n c96n4 = new C96n("MESSENGER_ICON", 3, 3);
        A06 = c96n4;
        C96n c96n5 = new C96n("INSTAGRAM_ICON", 4, 4);
        A04 = c96n5;
        C96n c96n6 = new C96n("SHOPPING", 5, 5);
        A09 = c96n6;
        C96n c96n7 = new C96n("UPCOMING_EVENT", 6, 6);
        A0A = c96n7;
        C96n c96n8 = new C96n("LIVE", 7, 7);
        A05 = c96n8;
        C96n c96n9 = new C96n("REELS_ICON", 8, 8);
        A08 = c96n9;
        C96n c96n10 = new C96n("YOU_TUBE_VIDEO", 9, 10);
        A0D = c96n10;
        C96n c96n11 = new C96n("YOU_TUBE_SHORTS", 10, 11);
        A0C = c96n11;
        C96n c96n12 = new C96n("PILL", 11, 14);
        A07 = c96n12;
        C96n[] c96nArr = {c96n, c96n2, c96n3, c96n4, c96n5, c96n6, c96n7, c96n8, c96n9, c96n10, c96n11, c96n12, new C96n("MESSENGER_CHANNEL_IMAGE", 12, 15)};
        A01 = c96nArr;
        A00 = C00t.A00(c96nArr);
    }

    public C96n(String str, int i, int i2) {
        this.type = i2;
    }

    public static C96n valueOf(String str) {
        return (C96n) Enum.valueOf(C96n.class, str);
    }

    public static C96n[] values() {
        return (C96n[]) A01.clone();
    }
}
