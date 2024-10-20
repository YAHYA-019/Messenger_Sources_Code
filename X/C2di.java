package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;

/* renamed from: X.2di, reason: invalid class name */
/* loaded from: 2di.class */
public final class C2di {
    public Context A00;
    public final C00i A01;
    public final ContentResolver A02;
    public final Handler A03 = (Handler) 1Bn.A0A(16453);

    public C2di() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A00 = context;
        this.A02 = (ContentResolver) 1Hv.A02(context, 100181);
        this.A01 = new 1BQ(17050);
    }
}
