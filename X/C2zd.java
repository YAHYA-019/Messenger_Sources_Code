package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.base.Predicate;

/* renamed from: X.2zd, reason: invalid class name */
/* loaded from: 2zd.class */
public final class C2zd implements Predicate {
    public final long A00;

    public C2zd(long j) {
        this.A00 = j;
    }

    @Override // com.google.common.base.Predicate
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        ThreadSummary threadSummary = (ThreadSummary) obj;
        boolean z = false;
        11T.A0F(threadSummary, 0);
        if (threadSummary.A0N >= this.A00) {
            z = true;
        }
        return z;
    }
}
