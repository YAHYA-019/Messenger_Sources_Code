package X;

import java.util.concurrent.Callable;

/* loaded from: J54.class */
public final class J54 implements Callable {
    public final /* synthetic */ Ht4 A00;
    public final /* synthetic */ IeR A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public J54(Ht4 ht4, IeR ieR, boolean z, boolean z2) {
        this.A01 = ieR;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = ht4;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        IeR ieR = this.A01;
        if (!ieR.isConnected()) {
            throw new RuntimeException(0Pz.A0W("Camera not initialised: ", "Failed to unlock automatics (focus, exposure, white-balance)"));
        }
        I4v i4v = ieR.A0I;
        if (i4v.A07) {
            i4v.A04 = true;
            i4v.A01();
        }
        boolean z = this.A02;
        if (!z && !this.A03) {
            return null;
        }
        Gun A00 = ieR.A0N.A00(ieR.A00);
        if (z) {
            try {
                IA2.A04(I82.A0P, A00, false);
            } catch (RuntimeException e) {
                this.A00.A03(e);
                return null;
            }
        }
        if (this.A03) {
            IA2.A04(I82.A0R, A00, false);
        }
        A00.A02();
        return null;
    }
}
