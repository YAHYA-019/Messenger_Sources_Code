package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: Hm4.class */
public final class Hm4 {
    public final /* synthetic */ IE8 A00;

    public Hm4(IE8 ie8) {
        this.A00 = ie8;
    }

    public void A00(96T r302) {
        IQ1 iq1;
        06Z childFragmentManager;
        9XF r303;
        int i;
        IDk A05 = IFM.A05(this.A00);
        if (r302.ordinal() != 0) {
            iq1 = A05.A00;
            CallerContext callerContext = IQ1.A1m;
            childFragmentManager = iq1.A1N.getChildFragmentManager();
            if (!((9Y7) iq1.A0Z.get()).A00()) {
                IQ1.A03(childFragmentManager, iq1);
                return;
            } else {
                r303 = (9XF) iq1.A0Y.get();
                i = 1;
            }
        } else {
            iq1 = A05.A00;
            CallerContext callerContext2 = IQ1.A1m;
            childFragmentManager = iq1.A1N.getChildFragmentManager();
            if (!((9Y7) iq1.A0Z.get()).A00()) {
                IQ1.A04(childFragmentManager, iq1);
                return;
            } else {
                r303 = (9XF) iq1.A0Y.get();
                i = 2;
            }
        }
        r303.A00(childFragmentManager, new J5x(childFragmentManager, iq1, i));
    }
}
