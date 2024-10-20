package com.facebook.messaging.sup.appjob;

import X.1BJ;
import X.1Br;
import X.1YC;
import X.4YT;
import X.4gE;
import X.7zM;
import X.7zO;
import X.C00i;
import X.C06144g2;
import X.C06204g8;
import X.C1Y6;
import X.IlA;
import X.IlB;
import android.content.Context;
import com.facebook.messaging.sup.plugins.videocalling.impl.SUPVideoCallingImpl;
import com.facebook.wearable.mediastream.ul.voltron.loader.MediaStreamLibraryLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: SUPVideoCallingAppJob.class */
public final class SUPVideoCallingAppJob {
    public static C06144g2 A00;
    public static final ReentrantLock A02 = new ReentrantLock();
    public static final AtomicBoolean A01 = 7zO.A15();

    public static final void A00() {
        ReentrantLock reentrantLock = A02;
        reentrantLock.lock();
        try {
            if (A01.compareAndSet(false, true)) {
                C06144g2 c06144g2 = A00;
                if (c06144g2 != null) {
                    C06204g8 c06204g8 = c06144g2.A00.A00;
                    AtomicInteger atomicInteger = C1Y6.A04;
                    int andIncrement = atomicInteger.getAndIncrement();
                    1YC r0 = c06204g8.A02;
                    r0.A08("com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", "messaging.sup.videocalling.SUPVideoCallingSpec", "isModuleAvailable", andIncrement);
                    boolean z = false;
                    try {
                        if (C06204g8.A00(c06204g8)) {
                            int andIncrement2 = atomicInteger.getAndIncrement();
                            try {
                                r0.A0A(4YT.A00(14), "messaging.sup.videocalling.impl.SUPVideoCallingImpl", "com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", andIncrement2, "messaging.sup.videocalling.SUPVideoCallingSpec", 4YT.A00(13), "isModuleAvailable");
                                try {
                                    z = ((MediaStreamLibraryLoader) 1Br.A0B(c06204g8.A00.A02)).A04();
                                    r0.A09("messaging.sup.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.SUPVideoCallingSpec", "isModuleAvailable", andIncrement2);
                                } catch (Exception e) {
                                    throw e;
                                }
                            } catch (Throwable th) {
                                r0.A04((Exception) null, "messaging.sup.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.SUPVideoCallingSpec", "isModuleAvailable", andIncrement2);
                                throw th;
                            }
                        }
                        r0.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", "isModuleAvailable", andIncrement);
                        if (!z) {
                            Context A0A = 7zM.A0A();
                            4gE.A02.A01(1BJ.A00(2058), "Load media stream module using SUPVideoCalling Plugin");
                            C06204g8 c06204g82 = c06144g2.A00.A00;
                            int andIncrement3 = atomicInteger.getAndIncrement();
                            1YC r02 = c06204g82.A02;
                            r02.A08("com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", "messaging.sup.videocalling.SUPVideoCallingSpec", "loadMediaStreamModule", andIncrement3);
                            try {
                                if (C06204g8.A00(c06204g82)) {
                                    int andIncrement4 = atomicInteger.getAndIncrement();
                                    try {
                                        r02.A0A(4YT.A00(14), "messaging.sup.videocalling.impl.SUPVideoCallingImpl", "com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", andIncrement4, "messaging.sup.videocalling.SUPVideoCallingSpec", 4YT.A00(13), "loadMediaStreamModule");
                                        try {
                                            SUPVideoCallingImpl sUPVideoCallingImpl = c06204g82.A00;
                                            C00i c00i = sUPVideoCallingImpl.A02.A00;
                                            ((MediaStreamLibraryLoader) c00i.get()).A03(new IlA(A0A, sUPVideoCallingImpl));
                                            if (SUPVideoCallingImpl.A07 == null) {
                                                MediaStreamLibraryLoader.A02(new IlB(), (MediaStreamLibraryLoader) c00i.get(), false);
                                            }
                                            r02.A09("messaging.sup.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.SUPVideoCallingSpec", "loadMediaStreamModule", andIncrement4);
                                            r02.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", "loadMediaStreamModule", andIncrement3);
                                        } catch (Exception e2) {
                                            throw e2;
                                        }
                                    } catch (Throwable th2) {
                                        r02.A04((Exception) null, "messaging.sup.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.SUPVideoCallingSpec", "loadMediaStreamModule", andIncrement4);
                                        throw th2;
                                    }
                                } else {
                                    r02.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", "loadMediaStreamModule", andIncrement3);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r02.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", "loadMediaStreamModule", andIncrement3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r0.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", "isModuleAvailable", andIncrement);
                        throw th;
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
