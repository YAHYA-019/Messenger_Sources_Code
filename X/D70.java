package X;

import android.os.Looper;

/* loaded from: D70.class */
public final /* synthetic */ class D70 implements Runnable {
    public static final String __redex_internal_original_name = "PlayerWarmupScheduler$$ExternalSyntheticLambda7";
    public final /* synthetic */ 5N9 A00;

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myQueue().addIdleHandler(new CSP(this.A00, 1));
    }
}
