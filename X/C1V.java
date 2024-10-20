package X;

import com.facebook.litho.LithoView;
import com.google.common.collect.ImmutableList;

/* loaded from: C1V.class */
public final class C1V {
    public final /* synthetic */ AcQ A00;

    public C1V(AcQ acQ) {
        this.A00 = acQ;
    }

    public void A00(ImmutableList immutableList, int i) {
        AcQ acQ = this.A00;
        C1784AsI c1784AsI = acQ.A0D;
        if (c1784AsI != null) {
            c1784AsI.A02 = immutableList;
            c1784AsI.A00 = i;
            LithoView lithoView = acQ.A0E;
            if (lithoView != null) {
                AcQ.A0H(lithoView, acQ);
            }
            AcQ.A0Q(acQ, false);
        }
    }
}
