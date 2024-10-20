package X;

import android.content.Context;
import android.os.SystemClock;

/* loaded from: I0x.class */
public final class I0x {
    public static final I0x A00 = new Object();

    public final HtK A00(Context context, Hxy hxy, JLs... jLsArr) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        IdZ idZ = new IdZ(context, hxy, jLsArr);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        Object obj = hxy.A00.get(Hxy.A02);
        if (obj == null) {
            throw 1BK.A0h();
        }
        idZ.A03(elapsedRealtimeNanos2, (String) obj);
        return new HtK(idZ);
    }
}
