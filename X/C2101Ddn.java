package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Ddn, reason: case insensitive filesystem */
/* loaded from: Ddn.class */
public final class C2101Ddn extends 1Dd {
    public static final 1Dj A00;
    public static final 1Dj A01;
    public static final 1Dj A02;
    public static final 1Dj A03;
    public static final 1Dj A04;
    public static final 1Dj A05;
    public static final 1Dj A06;
    public static final 1Dj A07;
    public static final 1Dj A08;
    public static final 1Dj A09;
    public static final 1Dj A0A;
    public static final 1Dj A0B;
    public static final 1Dj A0C;
    public static final 1Dj A0D;
    public static final 1Dj A0E;
    public static final 1Dj A0F;
    public static final 1rV A0G;
    public static final ImmutableList A0H;

    static {
        1Dj A0F2 = AbF.A0F("transaction_id", "INTEGER");
        A0D = A0F2;
        1Dj A0F3 = AbF.A0F("sender_id", "INTEGER");
        A0B = A0F3;
        1Dj A0F4 = AbF.A0F("receiver_id", "INTEGER");
        A0A = A0F4;
        1Dj A0F5 = AbF.A0F("transfer_status", "TEXT");
        A0E = A0F5;
        1Dj A0F6 = AbF.A0F("creation_time", "TEXT");
        A03 = A0F6;
        1Dj A0F7 = AbF.A0F("updated_time", "TEXT");
        A0F = A0F7;
        1Dj A0F8 = AbF.A0F("completed_time", "TEXT");
        A02 = A0F8;
        1Dj A0F9 = AbF.A0F("raw_amount", "INTEGER");
        A08 = A0F9;
        1Dj A0F10 = AbF.A0F("amount_offset", "INTEGER");
        A00 = A0F10;
        1Dj A0F11 = AbF.A0F("currency", "TEXT");
        A04 = A0F11;
        1Dj A0F12 = AbF.A0F("raw_amount_fb_discount", "INTEGER");
        A09 = A0F12;
        1Dj A0F13 = AbF.A0F("memo_text", "TEXT");
        A06 = A0F13;
        1Dj A0F14 = AbF.A0F("memo_image_list", "IMAGELIST");
        A05 = A0F14;
        1Dj A0F15 = AbF.A0F("theme", "THEME");
        A0C = A0F15;
        1Dj A0F16 = AbF.A0F("platform_item", "TEXT");
        A07 = A0F16;
        1Dj A0F17 = AbF.A0F("commerce_order", "TEXT");
        A01 = A0F17;
        A0G = DKD.A0I(A0F2);
        A0H = ImmutableList.of(A0F2, A0F3, A0F4, A0F5, A0F6, A0F7, A0F8, A0F9, A0F10, A0F11, A0F12, A0F13, A0F14, A0F15, A0F16, A0F17);
    }

    public C2101Ddn() {
        super(A0G, A0H, "transactions");
    }
}
