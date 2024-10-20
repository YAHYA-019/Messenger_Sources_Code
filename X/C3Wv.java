package X;

import java.util.concurrent.Semaphore;

/* renamed from: X.3Wv, reason: invalid class name */
/* loaded from: 3Wv.class */
public final class C3Wv implements 1Fk {
    public final /* synthetic */ 1Fs A00;
    public final /* synthetic */ Semaphore A01;

    public C3Wv(1Fs r302, Semaphore semaphore) {
        this.A00 = r302;
        this.A01 = semaphore;
    }

    public void CTJ(boolean z) {
        if (z) {
            return;
        }
        this.A01.release();
    }
}
