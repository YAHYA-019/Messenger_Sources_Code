package X;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: Ipx.class */
public final class Ipx implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerAdsLongVideoOptInController$4";
    public final /* synthetic */ IUQ A00;

    public Ipx(IUQ iuq) {
        this.A00 = iuq;
    }

    @Override // java.lang.Runnable
    public void run() {
        IUQ iuq = this.A00;
        iuq.A0B.A03(true);
        F7Y f7y = (F7Y) iuq.A08.get();
        Context context = iuq.A04;
        C2137Deq A01 = f7y.A01(context);
        A01.A0N(2131960445);
        A01.A03 = 2yD.A00(F4I.A00((F4I) 1Lo.A04(context, iuq.A06, (1BY) null, 99738)), 36593430600811832L);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279321);
        ViewGroup.MarginLayoutParams A0N = GOq.A0N(C2137Deq.A00(A01));
        A0N.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        C2137Deq.A00(A01).setLayoutParams(A0N);
        ((FIU) A01).A0L = new ISO(iuq, 1);
        A01.A0C(iuq.A05);
        iuq.A02 = true;
    }
}
