package X;

import java.util.concurrent.Executor;

/* renamed from: X.1i6, reason: invalid class name */
/* loaded from: 1i6.class */
public abstract class C1i6 extends C1i8 {
    public static final String __redex_internal_original_name = "CombinedFuture$CombinedFutureInterruptibleTask";
    public final Executor listenerExecutor;
    public final /* synthetic */ C1hn this$0;

    public C1i6(C1hn c1hn, Executor executor) {
        this.this$0 = c1hn;
        executor.getClass();
        this.listenerExecutor = executor;
    }

    @Override // X.C1i8
    public final void A04(Object obj) {
        C1hn c1hn = this.this$0;
        1GE r0 = C1hp.A03;
        c1hn.A00 = null;
        ((C1i5) this).this$0.set(obj);
    }

    @Override // X.C1i8
    public final boolean A06() {
        return this.this$0.isDone();
    }
}
