package X;

import android.content.Context;

/* loaded from: D8m.class */
public final class D8m implements Runnable {
    public static final String __redex_internal_original_name = "AccountLoginAutoIdentificationOauthContinueAsFragment$3$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ChO A02;

    public D8m(Context context, ChO chO, int i) {
        this.A02 = chO;
        this.A01 = context;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        6HM r0 = (6HM) ((B2i) this.A02.A01).A02.get();
        C8S A00 = COW.A00(this.A01);
        A00.A00(this.A00);
        COW.A01(A00, r0);
    }
}
