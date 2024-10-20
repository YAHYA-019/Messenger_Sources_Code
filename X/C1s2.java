package X;

import android.os.Handler;

/* renamed from: X.1s2, reason: invalid class name */
/* loaded from: 1s2.class */
public final class C1s2 extends Handler implements 1cU {
    public boolean BWo() {
        return false;
    }

    public void CXs(Runnable runnable, String str) {
        11T.A0F(runnable, 0);
        post(runnable);
    }

    public void CXu(Runnable runnable, String str) {
        11T.A0F(runnable, 0);
        postAtFrontOfQueue(runnable);
    }

    public void Cdn(Runnable runnable) {
        11T.A0F(runnable, 0);
        removeCallbacks(runnable);
    }
}
