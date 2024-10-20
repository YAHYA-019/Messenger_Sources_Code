package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* loaded from: J56.class */
public final class J56 implements Callable {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public J56(int i, Object obj, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.A00) {
            case 0:
                IeR ieR = (IeR) this.A01;
                boolean z = this.A03;
                boolean z2 = this.A02;
                if (!ieR.isConnected()) {
                    throw new J77("Failed to lock automatics (focus, exposure, white-balance)");
                }
                I4v i4v = ieR.A0I;
                i4v.A06.A06("Lock focus can only happen on the Optic thread.");
                if (!i4v.A09) {
                    i4v.A07 = false;
                    I4v.A00(null, i4v.A02, i4v, 0S2.A0j);
                } else if (i4v.A09) {
                    int A0D = GOq.A0D(I82.A0D, i4v.A05.A02(i4v.A00));
                    if (A0D == 1 || A0D == 2) {
                        i4v.A04 = false;
                        if (!i4v.A07 && !i4v.A08) {
                            i4v.A03(null, null);
                        }
                    }
                }
                if (!z && !z2) {
                    return null;
                }
                Gun A00 = ieR.A0N.A00(ieR.A00);
                if (z) {
                    IA2.A04(I82.A0P, A00, true);
                }
                if (z2) {
                    IA2.A04(I82.A0R, A00, true);
                }
                A00.A02();
                return null;
            case 1:
                IeQ ieQ = (IeQ) this.A01;
                if (!ieQ.isConnected() || ieQ.A08 == null) {
                    throw new J77("Camera disconnected, failed to lock automatics (focus, AE, AWB)");
                }
                boolean z3 = this.A02;
                if (z3 || this.A03) {
                    I4E i4e = new I4E();
                    if (z3) {
                        i4e.A02(I82.A0P, true);
                    }
                    if (this.A03) {
                        i4e.A02(I82.A0R, true);
                    }
                    ieQ.BeT(new GuU(1), i4e.A01());
                }
                Huf huf = ieQ.A0R;
                huf.A0D = false;
                huf.A00();
                return null;
            case 2:
                IeQ ieQ2 = (IeQ) this.A01;
                if (!ieQ2.isConnected() || ieQ2.A08 == null) {
                    throw new J77("Camera disconnected, failed to unlock automatics (focus, AE, AWB)");
                }
                boolean z4 = this.A02;
                if (z4 || this.A03) {
                    I4E i4e2 = new I4E();
                    if (z4) {
                        i4e2.A02(I82.A0P, false);
                    }
                    if (this.A03) {
                        i4e2.A02(I82.A0R, false);
                    }
                    ieQ2.BeT(new GuU(1), i4e2.A01());
                }
                ieQ2.A0R.A0D = true;
                return null;
            default:
                try {
                    try {
                        ((IEe) this.A01).A0A(this.A02, this.A03);
                        return null;
                    } catch (CameraAccessException | IllegalArgumentException unused) {
                        return null;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(0Pz.A1B("Could not start preview: ", e));
                }
        }
    }
}
