package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: I0y.class */
public final class I0y {
    public static final I0y A00 = new Object();

    public final Ic9 A00(Context context, Hxy hxy, JLs... jLsArr) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        HashMap A0u = AnonymousClass001.A0u();
        java.util.Map map = hxy.A00;
        A0u.putAll(map);
        GOn.A1Z(JQ4.A00, A0u, true);
        IdZ idZ = new IdZ(context, new Hxy(A0u), jLsArr);
        Ic9 ic9 = new Ic9(idZ);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        Object obj = map.get(Hxy.A02);
        if (obj == null) {
            throw 1BK.A0h();
        }
        idZ.A03(elapsedRealtimeNanos2, (String) obj);
        return ic9;
    }
}
