package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.Execution;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.3Zk, reason: invalid class name */
/* loaded from: 3Zk.class */
public final class C3Zk implements DFQ {
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ C3Qu A01;

    public C3Zk(ThreadKey threadKey, C3Qu c3Qu) {
        this.A01 = c3Qu;
        this.A00 = threadKey;
    }

    public final void CHd(ImmutableSet immutableSet) {
        if (immutableSet != null) {
            C3Qu c3Qu = this.A01;
            ((C3Qq) 1Br.A0B(c3Qu.A01)).A01(c3Qu.A00, immutableSet);
        }
        Cbd A00 = C3Qu.A00(this.A01);
        Blr blr = new Blr(this.A00, A00);
        (Execution.getExecutionContext() != 0 ? 1BK.A1E(A00.A0F) : 2eQ.A01).execute(new D7t(blr, A00));
    }
}
