package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6vc, reason: invalid class name */
/* loaded from: 6vc.class */
public final class C6vc {
    public ThreadKey A00;
    public C6vd A01;

    public final C6vd A00(ThreadKey threadKey) {
        C6vd c6vd;
        synchronized (this) {
            if (!11T.A0O(this.A00, threadKey)) {
                this.A00 = threadKey;
                this.A01 = new C6vd();
            }
            c6vd = this.A01;
            if (c6vd == null) {
                11T.A0L("currentRepository");
                throw 0Q8.createAndThrow();
            }
        }
        return c6vd;
    }
}
