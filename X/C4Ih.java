package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.4Ih, reason: invalid class name */
/* loaded from: 4Ih.class */
public final class C4Ih implements C4Ii {
    public final C4Ij A01;
    public final 2Zs A03;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Executor A02 = new 4OT(this);

    public C4Ih(Executor executor) {
        C4Ij c4Ij = new C4Ij(executor);
        this.A01 = c4Ij;
        this.A03 = new 2Zq(c4Ij);
    }

    @Override // X.C4Ii
    public /* synthetic */ void ARK(Runnable runnable) {
        this.A01.execute(runnable);
    }
}
