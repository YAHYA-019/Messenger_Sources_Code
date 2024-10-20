package X;

import android.graphics.Point;

/* loaded from: Idi.class */
public final /* synthetic */ class Idi implements JGA {
    public final /* synthetic */ IeR A00;

    public final void BzD(Point point, Integer num) {
        IeR ieR = this.A00;
        if (ieR.A0d) {
            return;
        }
        long j = ieR.A0C ? 4000L : 2000L;
        synchronized (ieR) {
            IeR.A07(ieR);
            ieR.A0c = ieR.A0R.A02("reset_focus", new J5U(ieR, 14), j);
        }
    }
}
