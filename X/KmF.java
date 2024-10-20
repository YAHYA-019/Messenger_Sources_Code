package X;

import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.google.common.collect.ImmutableMap;
import java.util.Random;
import java.util.Set;

/* loaded from: KmF.class */
public final class KmF {
    public final C01s A00;
    public final C00i A01;
    public final JvI A02;
    public final C1o0 A03;
    public final C16v A04;
    public final ImmutableMap A05;
    public final Set A06;
    public final RealtimeSinceBootClock A07;
    public final Random A08 = new Random();
    public volatile C16q A09;

    public KmF(C01s c01s, C00i c00i, JvI jvI, C1o0 c1o0, RealtimeSinceBootClock realtimeSinceBootClock, C16q c16q, C16v c16v, ImmutableMap immutableMap, Set set) {
        this.A02 = jvI;
        this.A03 = c1o0;
        this.A04 = c16v;
        this.A06 = set;
        this.A05 = immutableMap;
        this.A07 = realtimeSinceBootClock;
        this.A00 = c01s;
        this.A09 = c16q;
        this.A01 = c00i;
    }
}
