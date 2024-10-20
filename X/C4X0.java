package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.4X0, reason: invalid class name */
/* loaded from: 4X0.class */
public final class C4X0 implements Runnable {
    public static final String __redex_internal_original_name = "AbstractFuture$SetFuture";
    public final C4Kt A00;
    public final ListenableFuture A01;

    public C4X0(C4Kt c4Kt, ListenableFuture listenableFuture) {
        this.A00 = c4Kt;
        this.A01 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        C4Kt c4Kt = this.A00;
        if (c4Kt.value == this) {
            if (C4Kt.A00.A02(c4Kt, this, C4Kt.A00(this.A01))) {
                C4Kt.A03(c4Kt);
            }
        }
    }
}
