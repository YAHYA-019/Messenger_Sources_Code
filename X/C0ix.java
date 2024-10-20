package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Collections;

/* renamed from: X.0ix, reason: invalid class name */
/* loaded from: 0ix.class */
public abstract class C0ix {
    public static void A00(String str) {
        C0iy.A00().Bnw(str, Collections.singletonMap("startTime", Long.toString(AwakeTimeSinceBootClock.INSTANCE.now())));
    }
}
