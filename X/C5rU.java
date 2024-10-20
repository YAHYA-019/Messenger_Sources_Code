package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.5rU, reason: invalid class name */
/* loaded from: 5rU.class */
public final class C5rU {
    public static ThreadKey A00;
    public static final C5rU A01 = new Object();

    public final void A00(ThreadKey threadKey) {
        synchronized (this) {
            A00 = threadKey;
        }
    }
}
