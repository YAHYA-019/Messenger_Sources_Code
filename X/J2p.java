package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: J2p.class */
public final class J2p implements Runnable {
    public static final String __redex_internal_original_name = "MontageEffectController$applyMaskEffect$1$onEffectLoadSuccess$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ IWd A01;
    public final /* synthetic */ EffectItem A02;
    public final /* synthetic */ I4D A03;
    public final /* synthetic */ boolean A04;

    public J2p(IWd iWd, EffectItem effectItem, I4D i4d, int i, boolean z) {
        this.A04 = z;
        this.A01 = iWd;
        this.A03 = i4d;
        this.A02 = effectItem;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A04;
        IWd iWd = this.A01;
        Hm8 hm8 = iWd.A0H;
        I4D i4d = this.A03;
        EffectItem effectItem = this.A02;
        if (z) {
            IQ1 iq1 = hm8.A00;
            CallerContext callerContext = IQ1.A1m;
            ICe iCe = iq1.A08;
            if (iCe != null) {
                iCe.A08(effectItem, i4d);
                ICe iCe2 = iq1.A08;
                IQ1.A0D(iq1, iCe2.A01, iCe2.A03);
            }
        } else {
            hm8.A00(effectItem, i4d, this.A00);
        }
        I8L i8l = (I8L) 1Br.A0B(iWd.A0D);
        IQ1 iq12 = iWd.A0G.A00;
        CallerContext callerContext2 = IQ1.A1m;
        String str = iq12.A0C;
        if (str == null || i8l.A05) {
            return;
        }
        AbstractC2326GOr.A1P(1Br.A02(i8l.A03), 1BJ.A00(1775), str);
    }
}
