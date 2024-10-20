package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Cfl.class */
public final class Cfl implements GEo {
    public final /* synthetic */ C1706Aqc A00;
    public final /* synthetic */ DEw A01;
    public final /* synthetic */ CNU A02;
    public final /* synthetic */ ImmutableList A03;

    public Cfl(C1706Aqc c1706Aqc, DEw dEw, CNU cnu, ImmutableList immutableList) {
        this.A02 = cnu;
        this.A00 = c1706Aqc;
        this.A03 = immutableList;
        this.A01 = dEw;
    }

    @Override // X.GEo
    public void CGr(boolean z, String str) {
        CNU cnu = this.A02;
        if (z) {
            CNU.A00(this.A00, this.A01, cnu, this.A03);
        } else {
            CNU.A01(cnu, str != null ? AbF.A1D(str) : null);
        }
    }
}
