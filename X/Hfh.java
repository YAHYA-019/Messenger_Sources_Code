package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.PriorityQueue;

/* loaded from: Hfh.class */
public final class Hfh {
    public final PriorityQueue A02;
    public final C0dr A03;
    public final Runnable A01 = new IpX(this);
    public final 1Br A00 = 1Bu.A00(16459);

    public Hfh() {
        1Bn.A0A(115549);
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        11T.A0A(realtimeSinceBootClock);
        this.A03 = realtimeSinceBootClock;
        this.A02 = new PriorityQueue();
    }
}
