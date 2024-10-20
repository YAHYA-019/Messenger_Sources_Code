package X;

import android.os.Handler;

/* loaded from: J0v.class */
public final /* synthetic */ class J0v implements Runnable {
    public static final String __redex_internal_original_name = "SurfaceVideoEncoderImpl$$ExternalSyntheticLambda1";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ JIk A01;
    public final /* synthetic */ IdT A02;

    public /* synthetic */ J0v(Handler handler, JIk jIk, IdT idT) {
        this.A02 = idT;
        this.A01 = jIk;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IdT idT = this.A02;
        IdT.A01(this.A00, this.A01, idT, true);
    }
}
