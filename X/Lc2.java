package X;

import android.view.Display;

/* loaded from: Lc2.class */
public final /* synthetic */ class Lc2 implements 7yR {
    public final /* synthetic */ 6WN A00;

    public final void Bsw(Display display) {
        long j;
        6WN r0 = this.A00;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            r0.A05 = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            5My.A04(4YT.A00(808), "Unable to query display refresh rate");
            j = -9223372036854775807L;
            r0.A05 = -9223372036854775807L;
        }
        r0.A06 = j;
    }
}
