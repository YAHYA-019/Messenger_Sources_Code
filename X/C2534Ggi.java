package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.Ggi, reason: case insensitive filesystem */
/* loaded from: Ggi.class */
public final class C2534Ggi extends KTY {
    public final int A00;
    public final Object A01;

    public C2534Ggi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(View view) {
        if (2 - this.A00 != 0) {
            super.A00(view);
        } else {
            C5fi.A01(((I8Y) this.A01).A0K);
        }
    }

    public void A01(View view, int i, int i2) {
        if (this.A00 != 0) {
            super.A01(view, i, i2);
        } else {
            ((JUV) this.A01).A00.A04((i - view.getTop()) / i);
        }
    }

    public void A03(View view, MFG mfg) {
        Dialog dialog;
        switch (this.A00) {
            case 0:
                if (mfg == JUV.A06) {
                    JUV juv = (JUV) this.A01;
                    if (!juv.A01) {
                        juv.cancel();
                    }
                    juv.A00();
                    return;
                }
                return;
            case 1:
                if (mfg != C3229Jn6.A04 || (dialog = ((0D2) this.A01).A01) == null) {
                    return;
                }
                dialog.cancel();
                return;
            default:
                if (mfg == I8Y.A0Q) {
                    I8Y i8y = (I8Y) this.A01;
                    i8y.A0C.setVisibility(8);
                    i8y.A0K.A04();
                    Hm0 hm0 = i8y.A04;
                    if (hm0 != null) {
                        IFl iFl = hm0.A00;
                        if (!GOo.A1W(HAq.A0J, HAq.A0I, iFl.A0M)) {
                            IFl.A0B(iFl, HAq.A0G);
                        }
                        2EU.A04(i8y.A03);
                        2EU.A04(i8y.A02);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
