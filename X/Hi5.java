package X;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: Hi5.class */
public final class Hi5 {
    public final 1Br A02;
    public final 1De A05;
    public final HFX A01 = new C2529Ggc(this);
    public final List A03 = new CopyOnWriteArrayList();
    public final AtomicLong A04 = new AtomicLong(-1);
    public final long A00 = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    public Hi5(1De r302) {
        this.A05 = r302;
        this.A02 = 7zM.A0h(r302, 114890);
    }
}
