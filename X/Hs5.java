package X;

import java.lang.ref.WeakReference;

/* loaded from: Hs5.class */
public final class Hs5 {
    public final Hsn A00;
    public final Integer A01;
    public final WeakReference A02;

    public Hs5(Hsn hsn, Integer num, WeakReference weakReference) {
        this.A02 = weakReference;
        this.A00 = hsn;
        this.A01 = num;
    }

    public void A00() {
        IFE ife = (IFE) this.A02.get();
        if (ife != null) {
            ife.A09 = DKD.A11();
            IFE.A05(ife, this.A01);
        }
    }

    public void A01(HyG hyG) {
        IFE ife = (IFE) this.A02.get();
        if (ife != null) {
            ife.A09 = 7zL.A14(GOn.A0G(this.A00, hyG));
            IFE.A04(ife, hyG, this.A01);
        }
    }
}
