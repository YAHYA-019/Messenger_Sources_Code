package X;

/* loaded from: Ci4.class */
public final class Ci4 implements AZy {
    public final 1Br A00 = 1BK.A0D();

    @Override // X.AZy
    public void Baj(long j, long j2) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1053));
        if (A08.isSampled()) {
            4YU.A1H(A08, j);
            AbI.A1K(A08, j2);
            A08.BZL();
        }
    }

    @Override // X.AZy
    public void Bbc(long j, long j2) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "biim_mark_as_x_thread_details_see_more_button_click");
        if (A08.isSampled()) {
            4YU.A1H(A08, j);
            AbI.A1K(A08, j2);
            A08.BZL();
        }
    }

    @Override // X.AZy
    public void Bbl(long j, long j2, long j3) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "biim_mark_as_x_thread_details_order_click");
        if (A08.isSampled()) {
            4YU.A1H(A08, j);
            AbI.A1K(A08, j2);
            A08.A6H("order_id", Long.valueOf(j3));
            A08.BZL();
        }
    }
}
