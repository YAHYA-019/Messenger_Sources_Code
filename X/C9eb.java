package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.9eb, reason: invalid class name */
/* loaded from: 9eb.class */
public abstract class C9eb {
    public static final Handler A00 = AnonymousClass001.A07();

    public static final void A00(Runnable runnable) {
        if (11T.A0O(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
