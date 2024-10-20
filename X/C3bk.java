package X;

import android.os.Looper;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.3bk, reason: invalid class name */
/* loaded from: 3bk.class */
public final class C3bk implements 1ST {
    public final AwakeTimeSinceBootClock A00;
    public final 1SP A01;
    public final Thread A02;

    public C3bk(AwakeTimeSinceBootClock awakeTimeSinceBootClock, 1SP r303) {
        1BL.A1F(r303, awakeTimeSinceBootClock);
        this.A01 = r303;
        this.A00 = awakeTimeSinceBootClock;
        Thread thread = Looper.getMainLooper().getThread();
        11T.A0A(thread);
        this.A02 = thread;
    }
}
