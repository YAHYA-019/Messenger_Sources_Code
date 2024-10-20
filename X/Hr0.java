package X;

import android.content.Context;

/* loaded from: Hr0.class */
public final class Hr0 {
    public final I7E A00() {
        0Q8 A0T;
        I7E i7e;
        synchronized (this) {
            if (I7E.A03) {
                i7e = I7E.A02;
                if (i7e == null) {
                    11T.A0L("grootSessionManager");
                    A0T = 0Q8.createAndThrow();
                }
            } else {
                A0T = AnonymousClass001.A0T("GrootSessionManager has not been configured yet");
            }
            throw A0T;
        }
        return i7e;
    }

    public final void A01(Context context, Hzo hzo) {
        synchronized (this) {
            if (!I7E.A03) {
                I7E.A02 = new I7E(hzo, 7zL.A14(context));
                I7E.A03 = true;
            }
        }
    }
}
