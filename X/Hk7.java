package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: Hk7.class */
public final class Hk7 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public final Context A06;
    public final 1De A07;
    public final 1Br A08;
    public final 1Br A09;
    public final Runnable A0A;
    public final ArrayList A0B;

    public Hk7(1De r302) {
        this.A07 = r302;
        1BY r0 = r302.A00;
        this.A08 = 1Bu.A03(r0, 16452);
        this.A09 = GOn.A0Q();
        this.A0A = new IpU(this);
        this.A02 = 10000L;
        this.A0B = AnonymousClass001.A0s();
        this.A06 = 7zQ.A0I(r0);
        this.A00 = 1Br.A01(this.A09) - SystemClock.elapsedRealtime();
        this.A03 = 0L;
    }
}
