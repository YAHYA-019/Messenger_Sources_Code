package com.facebook.advancedcryptotransport;

import X.0fH;
import X.2Fb;
import X.C1z8;

/* loaded from: LigerStreamEventBaseThread.class */
public class LigerStreamEventBaseThread {
    public static volatile LigerStreamEventBaseThread sInstance;
    public Thread mThread = null;

    static {
        C1z8.A00();
    }

    public static void ligerStreamEventBaseAttachToThread(long j) {
        LigerStreamEventBaseThread ligerStreamEventBaseThread;
        synchronized (LigerStreamEventBaseThread.class) {
            if (sInstance == null) {
                sInstance = new LigerStreamEventBaseThread();
            }
            ligerStreamEventBaseThread = sInstance;
        }
        synchronized (ligerStreamEventBaseThread) {
            if (ligerStreamEventBaseThread.mThread == null) {
                2Fb r0 = new 2Fb(ligerStreamEventBaseThread, j);
                ligerStreamEventBaseThread.mThread = r0;
                r0.setPriority(5);
                ligerStreamEventBaseThread.mThread.start();
            } else {
                0fH.A0k("mccw.liger", "attach_thread");
            }
        }
    }

    public static native void nativeLigerStreamEventBaseThreadRun(long j);
}
