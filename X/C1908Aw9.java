package X;

import java.util.BitSet;

/* renamed from: X.Aw9, reason: case insensitive filesystem */
/* loaded from: Aw9.class */
public final class C1908Aw9 extends C1rs {
    public 1Iw A00;
    public C1984Ayd A01;
    public final BitSet A02;
    public final String[] A03;

    public C1908Aw9(1Iw r302, C1984Ayd c1984Ayd) {
        super(c1984Ayd, r302, 0, 0);
        this.A03 = new String[]{"bookingStatus", "isFutureAppointment", "servicesList", "shouldShowAppointmentStatus"};
        BitSet A18 = 1BK.A18(4);
        this.A02 = A18;
        this.A01 = c1984Ayd;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A02(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
