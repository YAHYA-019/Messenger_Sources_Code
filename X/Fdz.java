package X;

import android.content.Context;
import android.widget.Scroller;

/* loaded from: Fdz.class */
public final class Fdz implements GHj {
    public final Scroller A00;
    public final Scroller A01;
    public final Scroller A02;

    public Fdz(Context context) {
        this.A02 = new Scroller(context, ENH.A02.value);
        this.A01 = new Scroller(context, ENH.A03.value);
        this.A00 = new Scroller(context, ENH.A08.value);
    }

    @Override // X.GHj
    public int AiV(Integer num) {
        int intValue = num.intValue();
        return EVc.A00(intValue != 0 ? intValue != 1 ? 0S2.A0j : 0S2.A1G : 0S2.A15);
    }

    @Override // X.GHj
    public Scroller B9G(Integer num) {
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? this.A00 : this.A01 : this.A02;
    }
}
