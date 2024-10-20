package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6hj, reason: invalid class name */
/* loaded from: 6hj.class */
public final class C6hj implements 2eF {
    public final /* synthetic */ ThreadSummary A00;

    public C6hj(ThreadSummary threadSummary) {
        this.A00 = threadSummary;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        C2sg c2sg = (C2sg) obj;
        if (c2sg != null) {
            return new 1hM(new C6hk(c2sg, this.A00));
        }
        throw 1BK.A0h();
    }
}
