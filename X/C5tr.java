package X;

/* renamed from: X.5tr, reason: invalid class name */
/* loaded from: 5tr.class */
public final class C5tr {
    public static final 1G9 A01;
    public static final 1G9 A02;
    public static final 1G9 A03;
    public static final 1G9 A04;
    public final 1Br A00 = 1Bq.A00(33013);

    static {
        1G9 A0F = 1G0.A0B.A0F("debug_thread_capabilities/");
        A01 = A0F;
        A02 = A0F.A0F("capability_1");
        A03 = A0F.A0F("capability_2");
        A04 = A0F.A0F("capability_3");
    }

    public static final void A00(C5tr c5tr, Long l, Long l2, Long l3) {
        1Ql A08 = 1Br.A08(c5tr.A00);
        if (l != null) {
            A08.CaH(A02, l.longValue());
        }
        if (l2 != null) {
            A08.CaH(A03, l2.longValue());
        }
        if (l3 != null) {
            A08.CaH(A04, l3.longValue());
        }
        A08.commit();
    }
}
