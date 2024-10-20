package X;

import android.content.Intent;

/* loaded from: Loy.class */
public final /* synthetic */ class Loy implements Runnable {
    public static final String __redex_internal_original_name = "zzd";
    public final Intent A00;
    public final KqA A01;

    public Loy(Intent intent, KqA kqA) {
        this.A01 = kqA;
        this.A00 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KqA kqA = this.A01;
        String action = this.A00.getAction();
        StringBuilder A0l = AnonymousClass001.A0l(1BK.A02(action) + 61);
        A0l.append("Service took too long to process intent: ");
        A0l.append(action);
        android.util.Log.w("EnhancedIntentService", AnonymousClass001.A0d(" App may get closed.", A0l));
        kqA.A00();
    }
}
