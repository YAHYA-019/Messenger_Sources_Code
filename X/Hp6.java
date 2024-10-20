package X;

import android.hardware.Camera;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: Hp6.class */
public final class Hp6 {
    public final Hrg A00 = new Hrg();
    public final I4V A01 = I4V.A00();
    public final I4V A02 = I4V.A00();
    public volatile HrO A03;

    public void A00(boolean z, Camera camera) {
        Hrg hrg = this.A00;
        ReentrantLock reentrantLock = hrg.A01;
        reentrantLock.lock();
        if (camera != null) {
            try {
                if (!hrg.A01()) {
                    0Sf.A02(camera);
                    reentrantLock.lock();
                    hrg.A00 = 0;
                    reentrantLock.unlock();
                    HrO hrO = this.A03;
                    if (hrO != null && !hrO.A00.isEmpty()) {
                        I9z.A00(new Iss(hrO));
                    }
                    if (z) {
                        I4V i4v = this.A02;
                        if (!i4v.A00.isEmpty()) {
                            I9z.A00(new Ixf(this, i4v.A00));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
