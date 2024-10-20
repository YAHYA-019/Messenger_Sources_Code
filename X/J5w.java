package X;

import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: J5w.class */
public final class J5w implements C00l, C00m {
    public final int A00;
    public final Object A01;

    public J5w(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C00m
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                IEh iEh = (IEh) this.A01;
                JK0 jk0 = iEh.A08;
                if (jk0 == null) {
                    return null;
                }
                94S r0 = MigBottomSheetDialogFragment.A01;
                9EE.A00(jk0.AnP(), new Ilv(iEh));
                return null;
            case 1:
                JL6 jl6 = ((IDV) this.A01).A03;
                if (jl6 != null) {
                    jl6.BLx();
                }
                return 04S.A00;
            case 2:
                C2767Gnk c2767Gnk = (C2767Gnk) this.A01;
                c2767Gnk.A09.A01.A0d.D6o(C6x4.A06, true);
                C2767Gnk.A01(c2767Gnk);
                return 04S.A00;
            default:
                C2397Gbz.A0j(((HrG) this.A01).A00);
                return 04S.A00;
        }
    }
}
