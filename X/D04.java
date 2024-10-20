package X;

import com.google.common.collect.ImmutableList;

/* loaded from: D04.class */
public final class D04 implements DGO {
    public final /* synthetic */ C1706Aqc A00;
    public final /* synthetic */ DEw A01;
    public final /* synthetic */ CNU A02;
    public final /* synthetic */ ImmutableList A03;

    public D04(C1706Aqc c1706Aqc, DEw dEw, CNU cnu, ImmutableList immutableList) {
        this.A02 = cnu;
        this.A00 = c1706Aqc;
        this.A03 = immutableList;
        this.A01 = dEw;
    }

    public final void CGs(boolean z, Throwable th) {
        CNU cnu = this.A02;
        if (!z) {
            CNU.A01(cnu, th);
            return;
        }
        CNU.A00(this.A00, this.A01, cnu, this.A03);
    }
}
