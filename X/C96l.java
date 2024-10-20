package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96l, reason: invalid class name */
/* loaded from: 96l.class */
public final class C96l {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96l[] A01;
    public static final C96l A02;
    public static final C96l A03;
    public static final C96l A04;
    public static final C96l A05;
    public static final C96l A06;
    public static final C96l A07;
    public static final C96l A08;
    public static final C96l A09;
    public static final C96l A0A;
    public static final C96l A0B;
    public static final C96l A0C;
    public final int value;

    static {
        C96l c96l = new C96l("NONE", 0, 0);
        A08 = c96l;
        C96l c96l2 = new C96l("STICKER", 1, 1);
        A0A = c96l2;
        C96l c96l3 = new C96l("IMAGE", 2, 2);
        A07 = c96l3;
        C96l c96l4 = new C96l("ANIMATED_IMAGE", 3, 3);
        A02 = c96l4;
        C96l c96l5 = new C96l("VIDEO", 4, 4);
        A0B = c96l5;
        C96l c96l6 = new C96l("AUDIO", 5, 5);
        A03 = c96l6;
        C96l c96l7 = new C96l("FILE", 6, 6);
        A06 = c96l7;
        C96l c96l8 = new C96l("XMA", 7, 7);
        A0C = c96l8;
        C96l c96l9 = new C96l("EPHEMERAL_IMAGE", 8, 8);
        A04 = c96l9;
        C96l c96l10 = new C96l("EPHEMERAL_VIDEO", 9, 9);
        A05 = c96l10;
        C96l c96l11 = new C96l("SELFIE_STICKER", 10, 10);
        A09 = c96l11;
        C96l[] c96lArr = {c96l, c96l2, c96l3, c96l4, c96l5, c96l6, c96l7, c96l8, c96l9, c96l10, c96l11, new C96l("THIRD_PARTY_STICKER", 11, 15)};
        A01 = c96lArr;
        A00 = C00t.A00(c96lArr);
    }

    public C96l(String str, int i, int i2) {
        this.value = i2;
    }

    public static C96l valueOf(String str) {
        return (C96l) Enum.valueOf(C96l.class, str);
    }

    public static C96l[] values() {
        return (C96l[]) A01.clone();
    }
}
