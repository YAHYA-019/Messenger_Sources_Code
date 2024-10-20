package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4If, reason: invalid class name */
/* loaded from: 4If.class */
public class C4If implements C4Ig {
    public final Handler A00 = Handler.createAsync(Looper.getMainLooper());

    @Override // X.C4Ig
    public void ADy(Runnable runnable) {
        this.A00.removeCallbacks(runnable);
    }

    @Override // X.C4Ig
    public void Cjo(Runnable runnable, long j) {
        this.A00.postDelayed(runnable, j);
    }
}
