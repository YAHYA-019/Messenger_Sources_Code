package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.3d4, reason: invalid class name */
/* loaded from: 3d4.class */
public final class C3d4 implements C2nj {
    public final AnonymousClass207 A00 = 2pL.A01;

    @Override // X.C2nj
    public AnonymousClass207 Asi() {
        return this.A00;
    }

    @Override // X.C2nj
    public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        Capabilities capabilities = threadSummary.A1C;
        2pL r305 = null;
        if (capabilities != null && 5yU.A00(capabilities)) {
            r305 = new 2pL();
        }
        return r305;
    }
}
