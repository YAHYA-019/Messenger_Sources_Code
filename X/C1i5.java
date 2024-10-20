package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.1i5, reason: invalid class name */
/* loaded from: 1i5.class */
public final class C1i5 extends C1i6 {
    public static final String __redex_internal_original_name = "CombinedFuture$CallableInterruptibleTask";
    public final Callable callable;
    public final /* synthetic */ C1hn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1i5(C1hn c1hn, Callable callable, Executor executor) {
        super(c1hn, executor);
        this.this$0 = c1hn;
        this.callable = callable;
    }

    @Override // X.C1i8
    public Object A01() {
        return this.callable.call();
    }
}
