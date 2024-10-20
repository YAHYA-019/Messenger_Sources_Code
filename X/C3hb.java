package X;

import android.content.Intent;

/* renamed from: X.3hb, reason: invalid class name */
/* loaded from: 3hb.class */
public final /* synthetic */ class C3hb implements Runnable {
    public static final String __redex_internal_original_name = "FbNetworkManager$NetworkChangedActionReceiver$$ExternalSyntheticLambda0";
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ 5GQ A01;
    public final /* synthetic */ C01q A02;

    public /* synthetic */ C3hb(Intent intent, 5GQ r303, C01q c01q) {
        this.A01 = r303;
        this.A00 = intent;
        this.A02 = c01q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        5GQ.A00(this.A00, this.A01, this.A02);
    }
}
