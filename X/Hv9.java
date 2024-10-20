package X;

import android.os.Handler;

/* loaded from: Hv9.class */
public abstract class Hv9 {
    public static void A00(Handler handler, JHq jHq) {
        if (jHq == null) {
            throw AnonymousClass001.A0L("stateCallback cannot be null");
        }
        if (handler == null) {
            throw AnonymousClass001.A0L("handler cannot be null");
        }
        handler.post(new Iog(jHq));
    }

    public static void A01(Handler handler, JHq jHq, Throwable th) {
        if (jHq == null) {
            throw AnonymousClass001.A0L("stateCallback cannot be null");
        }
        if (handler == null) {
            throw AnonymousClass001.A0L("handler cannot be null");
        }
        handler.post(new SAU(jHq, th));
    }
}
