package X;

import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cji.class */
public final class Cji implements C5xz {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fwk A02;
    public final /* synthetic */ 1Br A03;

    public Cji(Context context, Fwk fwk, 1Br r304, long j) {
        this.A00 = j;
        this.A03 = r304;
        this.A01 = context;
        this.A02 = fwk;
    }

    @Override // X.C5xz
    public final void CHX(ThreadSummary threadSummary) {
        ((AnonymousClass472) 1Br.A0B(this.A03)).A00(AbH.A0v(this.A00)).A02(new Ck0(0, this.A01, this.A02, threadSummary));
    }
}
