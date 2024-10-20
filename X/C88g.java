package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.88g, reason: invalid class name */
/* loaded from: 88g.class */
public final class C88g implements Runnable {
    public static final String __redex_internal_original_name = "AdContextUpdateHandlerImpl$onNewLoaderResult$2";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ 6I4 A01;

    public C88g(ThreadKey threadKey, 6I4 r303) {
        this.A01 = r303;
        this.A00 = threadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6I4.A00(this.A00, this.A01);
    }
}
