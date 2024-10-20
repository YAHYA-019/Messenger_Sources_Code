package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.2rc, reason: invalid class name */
/* loaded from: 2rc.class */
public abstract class C2rc {
    public static final 05U A00;

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        30J r0 = new 30J(1);
        if (awakeTimeSinceBootClock == null) {
            throw AnonymousClass001.A0L("Must add a clock to the object pool builder");
        }
        A00 = new 05U(r0, awakeTimeSinceBootClock, C2k8.class, 16, 1024, 16);
    }
}
