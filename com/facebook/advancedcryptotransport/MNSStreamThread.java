package com.facebook.advancedcryptotransport;

import X.0fH;
import X.C1z8;
import com.facebook.advancedcryptotransport.MNSStreamThread;

/* loaded from: MNSStreamThread.class */
public class MNSStreamThread {
    public static volatile MNSStreamThread sInstance;
    public Thread mThread = null;

    static {
        C1z8.A00();
    }

    public static void mnsStreamAttachLoopToThread(final long j) {
        final MNSStreamThread mNSStreamThread;
        synchronized (MNSStreamThread.class) {
            if (sInstance == null) {
                sInstance = new MNSStreamThread();
            }
            mNSStreamThread = sInstance;
        }
        synchronized (mNSStreamThread) {
            if (mNSStreamThread.mThread == null) {
                Thread thread = new Thread() { // from class: X.3jp
                    public static final String __redex_internal_original_name = "MNSStreamThread$1";

                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        MNSStreamThread.nativeMNSStreamThreadRun(j);
                    }
                };
                mNSStreamThread.mThread = thread;
                thread.setPriority(5);
                mNSStreamThread.mThread.start();
            } else {
                0fH.A0k("mccw.mns", "attach_thread");
            }
        }
    }

    public static native void nativeMNSStreamThreadRun(long j);
}
