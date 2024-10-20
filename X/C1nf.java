package X;

import android.content.Context;

/* renamed from: X.1nf, reason: invalid class name */
/* loaded from: 1nf.class */
public final class C1nf implements Runnable {
    public static final String __redex_internal_original_name = "DozeAwareClientWrapper$maybeUpdateClient$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1nT A01;

    public C1nf(Context context, 1nT r303) {
        this.A01 = r303;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1nT r0 = this.A01;
        1nT.A02(r0, new C2xu(this.A00, r0, 17));
    }
}
