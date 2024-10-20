package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.2nx, reason: invalid class name */
/* loaded from: 2nx.class */
public final class C2nx implements C2nj {
    @Override // X.C2nj
    public AnonymousClass207 Asi() {
        return 2oO.A01;
    }

    @Override // X.C2nj
    public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        String str = threadSummary.A1r;
        if (!ThreadKey.A0a(threadSummary.A0n) || str == null || str.length() == 0) {
            return null;
        }
        return new 2oO(str);
    }
}
