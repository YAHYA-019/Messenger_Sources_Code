package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.6ta, reason: invalid class name */
/* loaded from: 6ta.class */
public final class C6ta extends C1q6 {
    public boolean A00;
    public final /* synthetic */ 6tZ A01;

    public C6ta(6tZ r302) {
        this.A01 = r302;
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void Bic(Fragment fragment) {
        this.A01.A07();
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
        this.A01.A06();
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CL1(Fragment fragment, boolean z, boolean z2) {
        5TY r0;
        boolean z3 = this.A00;
        this.A00 = z;
        if (!z3 || z) {
            return;
        }
        6tZ r02 = this.A01;
        if (1Br.A07(((HY4) r02.A0F.get()).A00).AZk(36311298497448664L)) {
            5TY r03 = r02.A06;
            if ((r03 == null || !Boolean.TRUE.equals(r03.A03("IGNORE_USER_VISIBLE_HINT_CHECK"))) && (r0 = r02.A06) != null) {
                r0.A03("DYNAMIC_TTRC");
            }
        }
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
        6tZ r0 = this.A01;
        1sP.A00();
        r0.A0G.A00();
        this.A00 = true;
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CNf(Fragment fragment) {
        6tZ.A03(this.A01);
        this.A00 = false;
    }
}
