package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.2nz, reason: invalid class name */
/* loaded from: 2nz.class */
public final class C2nz implements C2nj {
    public final AnonymousClass207 A00 = C2o0.A01;

    @Override // X.C2nj
    public AnonymousClass207 Asi() {
        return this.A00;
    }

    @Override // X.C2nj
    public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        long j = threadSummary.A0F;
        if (j > 0) {
            return new C2o0(j);
        }
        return null;
    }
}
