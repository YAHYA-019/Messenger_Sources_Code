package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: J0d.class */
public final class J0d implements Runnable {
    public static final String __redex_internal_original_name = "RsysRtcEngine$startConferenceCall$1";
    public final /* synthetic */ IFQ A00;
    public final /* synthetic */ Hsu A01;
    public final /* synthetic */ SettableFuture A02;

    public J0d(IFQ ifq, Hsu hsu, SettableFuture settableFuture) {
        this.A02 = settableFuture;
        this.A00 = ifq;
        this.A01 = hsu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.setFuture(IFQ.A00(this.A00, this.A01));
    }
}
