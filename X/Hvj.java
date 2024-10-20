package X;

import android.os.Handler;

/* loaded from: Hvj.class */
public abstract class Hvj {
    public static void A00(Handler handler, HDP hdp, JIk jIk) {
        if (jIk == null) {
            throw AnonymousClass001.A0L("stateCallback cannot be null");
        }
        if (handler == null) {
            throw AnonymousClass001.A0L("handler cannot be null");
        }
        handler.post(new SBf(hdp, jIk));
    }

    public static void A01(JIk jIk, Handler handler) {
        if (jIk == null) {
            throw AnonymousClass001.A0L("stateCallback cannot be null");
        }
        if (handler == null) {
            throw AnonymousClass001.A0L("handler cannot be null");
        }
        handler.post(new IsV(jIk));
    }
}
