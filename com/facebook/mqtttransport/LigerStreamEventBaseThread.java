package com.facebook.mqtttransport;

import X.0fH;
import X.C0il;
import X.C1o2;
import com.facebook.mqtttransport.LigerStreamEventBaseThread;

/* loaded from: LigerStreamEventBaseThread.class */
public class LigerStreamEventBaseThread {
    public static volatile LigerStreamEventBaseThread sInstance;
    public Thread mThread = null;

    static {
        synchronized (C1o2.class) {
            if (!C1o2.A00) {
                C0il.A0B("mqtttransport_jni");
                C1o2.A00 = true;
            }
        }
    }

    public static void ligerStreamEventBaseAttachToThread(final long j) {
        final LigerStreamEventBaseThread ligerStreamEventBaseThread;
        synchronized (LigerStreamEventBaseThread.class) {
            if (sInstance == null) {
                sInstance = new LigerStreamEventBaseThread();
            }
            ligerStreamEventBaseThread = sInstance;
        }
        synchronized (ligerStreamEventBaseThread) {
            if (ligerStreamEventBaseThread.mThread == null) {
                Thread thread = new Thread() { // from class: X.1o3
                    public static final String __redex_internal_original_name = "LigerStreamEventBaseThread$1";

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("XplatMqttLigerEventBased");
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        LigerStreamEventBaseThread.nativeLigerStreamEventBaseThreadRun(j);
                    }
                };
                ligerStreamEventBaseThread.mThread = thread;
                thread.setPriority(5);
                ligerStreamEventBaseThread.mThread.start();
            } else {
                0fH.A0j("mqtt.liger", "attach_thread");
            }
        }
    }

    public static native void nativeLigerStreamEventBaseThreadRun(long j);
}
