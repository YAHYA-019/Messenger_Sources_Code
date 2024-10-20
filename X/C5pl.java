package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5pl, reason: invalid class name */
/* loaded from: 5pl.class */
public final class C5pl {
    public final 1Br A02 = 1Bq.A00(16385);
    public final 1Br A01 = 1Bq.A00(66481);
    public final 1Br A00 = 1Bq.A00(68470);
    public final 1Br A03 = 1Bq.A00(67773);

    public static final boolean A00(C5pl c5pl, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        if (capabilities == null || !capabilities.A00.get(ActionId.APP_FIRST_VIEW_CONTROLLER)) {
            return false;
        }
        if (threadSummary != null && ThreadKey.A0b(threadSummary.A0n) && !5yJ.A00(threadSummary)) {
            return z;
        }
        C00i c00i = c5pl.A03.A00;
        c00i.get();
        ThreadKey threadKey = null;
        if (!5lO.A00(threadSummary != null ? threadSummary.A0n : null)) {
            return true;
        }
        5lO r0 = (5lO) c00i.get();
        if (threadSummary != null) {
            threadKey = threadSummary.A0n;
        }
        return r0.A01(threadKey);
    }

    public final boolean A01(ThreadSummary threadSummary, Capabilities capabilities) {
        return A00(this, threadSummary, capabilities, !((2yD) this.A02.A00.get()).AZk(36321395961053513L));
    }
}
