package X;

import com.facebook.messaging.service.model.FetchThreadResult;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.5pw, reason: invalid class name */
/* loaded from: 5pw.class */
public final class C5pw implements 5Vz {
    public final /* synthetic */ 5Xb A00;
    public final /* synthetic */ 1UV A01;
    public final /* synthetic */ C5pc A02;
    public final /* synthetic */ SettableFuture A03;

    public C5pw(5Xb r302, 1UV r303, C5pc c5pc, SettableFuture settableFuture) {
        this.A00 = r302;
        this.A02 = c5pc;
        this.A03 = settableFuture;
        this.A01 = r303;
    }

    public void Bq7(ImmutableList immutableList) {
        C5pc c5pc = this.A02;
        c5pc.A06 = immutableList;
        final FetchThreadResult A00 = c5pc.A00();
        ((Executor) this.A00.A01.A02.get()).execute(new Runnable() { // from class: X.5px
            public static final String __redex_internal_original_name = "MsysThreadViewAdapter$2$2$1";

            @Override // java.lang.Runnable
            public void run() {
                C5pw c5pw = C5pw.this;
                SettableFuture settableFuture = c5pw.A03;
                FetchThreadResult fetchThreadResult = A00;
                settableFuture.set(fetchThreadResult);
                c5pw.A01.CHj(fetchThreadResult);
                1Vn.A00((1Vn) c5pw.A00.A01.A0E.get()).markerEnd(5513388, (short) 2);
            }
        });
    }
}
