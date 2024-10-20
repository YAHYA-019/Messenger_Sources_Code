package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Acl, reason: case insensitive filesystem */
/* loaded from: Acl.class */
public final class RunnableC1281Acl implements Runnable {
    public static final String __redex_internal_original_name = "PageResponsivenessHandler$updateFutureForPageResponsivenessFetch$1";
    public final /* synthetic */ C1279Acj A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ String A02;

    public RunnableC1281Acl(C1279Acj c1279Acj, SettableFuture settableFuture, String str) {
        this.A01 = settableFuture;
        this.A00 = c1279Acj;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.setFuture(C1279Acj.A00(this.A00, this.A02));
    }
}
