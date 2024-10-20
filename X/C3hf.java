package X;

import android.content.Context;

/* renamed from: X.3hf, reason: invalid class name */
/* loaded from: 3hf.class */
public final class C3hf implements Runnable {
    public static final String __redex_internal_original_name = "CcInboxUpsellsGraphqlRepository$fetchAndSubscribeCcUpsellRecommendation$runnable$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CND A01;
    public final /* synthetic */ C3Nb A02;

    public C3hf(Context context, CND cnd, C3Nb c3Nb) {
        this.A01 = cnd;
        this.A02 = c3Nb;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CND.A00(this.A00, this.A01, this.A02);
    }
}
