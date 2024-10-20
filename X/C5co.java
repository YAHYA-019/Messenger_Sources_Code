package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.5co, reason: invalid class name */
/* loaded from: 5co.class */
public abstract class C5co {
    public static final 05U A00;

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        05Q r0 = new 05Q() { // from class: X.5cq
            public /* bridge */ /* synthetic */ Object AIk() {
                return new C5cp();
            }

            public /* bridge */ /* synthetic */ void CG5(Object obj) {
                C5cp c5cp = (C5cp) obj;
                c5cp.getClass();
                c5cp.A08 = null;
                c5cp.A04 = -1;
                c5cp.A05 = 0L;
                c5cp.A06 = 0S2.A00;
                c5cp.A02 = -1;
                c5cp.A07 = null;
                c5cp.A09 = false;
                c5cp.A00 = 0.0f;
                c5cp.A01 = 0.0f;
                c5cp.A03 = 0;
            }
        };
        if (awakeTimeSinceBootClock == null) {
            throw AnonymousClass001.A0L("Must add a clock to the object pool builder");
        }
        A00 = new 05U(r0, awakeTimeSinceBootClock, C5cp.class, 16, 1024, 16);
    }
}
