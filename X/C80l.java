package X;

import android.os.Handler;

/* renamed from: X.80l, reason: invalid class name */
/* loaded from: 80l.class */
public final class C80l implements 1Io {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C2lh A01;
    public final /* synthetic */ 89T A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;

    public C80l(Handler handler, C2lh c2lh, 89T r304, Runnable runnable, String str) {
        this.A01 = c2lh;
        this.A02 = r304;
        this.A00 = handler;
        this.A03 = runnable;
        this.A04 = str;
    }

    public /* bridge */ /* synthetic */ Object call(Object[] objArr) {
        C2lh c2lh = this.A01;
        c2lh.A04(new C83K(this.A04, 0));
        C89h c89h = (C89h) c2lh.A02;
        Handler handler = this.A00;
        Runnable runnable = this.A03;
        89Y r0 = c89h.A01;
        if (r0 == 89Y.A04 || r0 == 89Y.A03 || c89h.A00 >= 5) {
            return null;
        }
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 4000L);
        return null;
    }
}
