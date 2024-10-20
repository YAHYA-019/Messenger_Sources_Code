package X;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: X.0T8, reason: invalid class name */
/* loaded from: 0T8.class */
public abstract class C0T8 {
    public static final java.util.Map A00 = Collections.synchronizedMap(AnonymousClass001.A0u());

    public static final void A00(HandlerThread handlerThread) {
        try {
            java.util.Map map = A00;
            11T.A0B(map);
            map.put(handlerThread.getName(), new WeakReference(handlerThread));
        } catch (Exception unused) {
        }
    }
}
