package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;

/* renamed from: X.3Ze, reason: invalid class name */
/* loaded from: 3Ze.class */
public final class C3Ze implements 7Qz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3Ze(4lI r302, ThreadKey threadKey, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = r302;
            this.A02 = threadKey;
        } else {
            this.A02 = threadKey;
            this.A01 = r302;
        }
    }

    public final void By6() {
        if (this.A00 != 0) {
            ((4lI) this.A01).A00((ThreadKey) this.A02, "MsysThreadViewLauncher parallel fetch title bar completed");
            return;
        }
        ThreadKey threadKey = (ThreadKey) this.A02;
        2dU.A01((6Bw) null, new PRELoggingEvent(1BK.A01(threadKey)));
        ((4lI) this.A01).A00(threadKey, "MsysThreadViewLauncher parallel fetch message list completed");
    }
}
