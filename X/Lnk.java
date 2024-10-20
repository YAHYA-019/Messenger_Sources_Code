package X;

import android.os.Looper;

/* loaded from: Lnk.class */
public final class Lnk implements Runnable {
    public static final String __redex_internal_original_name = "HandlerUtils$DefaultIdleUiSurfaceHandler$2";
    public final /* synthetic */ 5TV A00;
    public final /* synthetic */ Runnable A01;

    public Lnk(5TV r302, Runnable runnable) {
        this.A00 = r302;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.myQueue().addIdleHandler(new LGU(this.A00, this.A01));
    }
}
