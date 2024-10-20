package X;

import java.util.BitSet;

/* renamed from: X.Aw6, reason: case insensitive filesystem */
/* loaded from: Aw6.class */
public final class C1905Aw6 extends C1rs {
    public 1Iw A00;
    public AyY A01;
    public final BitSet A02;
    public final String[] A03;

    public C1905Aw6(1Iw r302, AyY ayY) {
        super(ayY, r302, 0, 0);
        this.A03 = new String[]{"appointmentDetail", "onCancelButtonClickListener", "onRecurringCancelEntireSeriesButtonClickListener"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = ayY;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
