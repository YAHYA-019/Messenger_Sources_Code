package com.facebook.profilo.provider.perfevents;

import X.0FI;
import X.0mT;
import X.AnonymousClass001;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: PerfEventsSession.class */
public class PerfEventsSession {
    public long mNativeHandle;
    public final Runnable mSessionRunnable = new 0mT(this);
    public Thread mThread;

    public static native long nativeAttach(boolean z, int i, int i2, float f, MultiBufferLogger multiBufferLogger);

    public static native void nativeDetach(long j);

    public static native void nativeRun(long j);

    public static native void nativeStop(long j);

    public void finalize() {
        int A03 = 0FI.A03(1734357246);
        stop();
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    nativeDetach(j);
                }
            } catch (Throwable th) {
                0FI.A09(1111556274, A03);
                throw th;
            }
        }
        0FI.A09(76533778, A03);
    }

    public void stop() {
        RuntimeException A0U;
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeStop(j);
                try {
                    this.mThread.join();
                    this.mThread = null;
                } catch (InterruptedException e) {
                    A0U = AnonymousClass001.A0U(e);
                }
            } else if (this.mThread != null) {
                A0U = AnonymousClass001.A0N("Inconsistent state: have thread but no handle");
                throw A0U;
            }
        }
    }
}
