package X;

import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.wearable.common.comms.hera.host.applinks.LinkedDeviceManager;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHost;
import com.facebook.wearable.common.comms.hera.shared.host.mwa.MwaExistance;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;

/* loaded from: Huo.class */
public final class Huo {
    public final HPc A00;

    public Huo(HPc hPc) {
        this.A00 = hPc;
    }

    public HWQ A00() {
        Hz5 hz5 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hz5.A03;
        r0.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getRsysFactories", andIncrement);
        HWQ hwq = null;
        Exception e = null;
        try {
            if (Hz5.A00(hz5)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1B = GOp.A1B(r0, "getRsysFactories", andIncrement2);
                try {
                    try {
                        hwq = hz5.A01.A01;
                        r0.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getRsysFactories", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getRsysFactories", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getRsysFactories", andIncrement);
            return hwq;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getRsysFactories", andIncrement);
            throw th2;
        }
    }

    public IHeraHost A01() {
        Hz5 hz5 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hz5.A03;
        r0.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getHeraHost", andIncrement);
        IHeraHost iHeraHost = null;
        Exception e = null;
        try {
            if (Hz5.A00(hz5)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1B = GOp.A1B(r0, "getHeraHost", andIncrement2);
                try {
                    try {
                        iHeraHost = hz5.A01.A06;
                        if (iHeraHost == null) {
                            throw 1BK.A0h();
                        }
                        r0.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getHeraHost", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getHeraHost", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getHeraHost", andIncrement);
            return iHeraHost;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "getHeraHost", andIncrement);
            throw th2;
        }
    }

    public void A02() {
        Hz5 hz5 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hz5.A03;
        r0.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "release", andIncrement);
        Exception e = null;
        try {
            int i = hz5.A00;
            if (i == -1) {
                i = Hz5.A00(hz5) ? 1 : 0;
                hz5.A00 = i;
            }
            ArrayList A0t = AnonymousClass001.A0t(i);
            if (Hz5.A00(hz5)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1B = GOp.A1B(r0, "release", andIncrement2);
                try {
                    try {
                        HeraMessengerPluginImplementation heraMessengerPluginImplementation = hz5.A01;
                        C2aj A03 = 2aK.A03((Integer) null, 2Zo.A00(), new AJf(heraMessengerPluginImplementation, (0DR) null, 10), heraMessengerPluginImplementation.A0U, 2);
                        CompletableFuture completableFuture = new CompletableFuture();
                        completableFuture.handle((BiFunction) new J5d(A03));
                        A03.BQH(new GBo(completableFuture, 34));
                        A0t.add(completableFuture);
                        r0.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "release", andIncrement2);
                    } catch (Throwable th) {
                        r0.A04(e, A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "release", andIncrement2);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            }
            while (true) {
                int size = A0t.size();
                int i2 = hz5.A00;
                if (i2 == -1) {
                    i2 = Hz5.A00(hz5) ? 1 : 0;
                    hz5.A00 = i2;
                }
                if (size >= i2) {
                    r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "release", andIncrement);
                    return;
                }
                A0t.add(null);
            }
        } catch (Throwable th2) {
            r0.A02(e, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "release", andIncrement);
            throw th2;
        }
    }

    public boolean A03() {
        Hz5 hz5 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hz5.A03;
        r0.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "enableDebugView", andIncrement);
        boolean z = false;
        Exception e = null;
        try {
            if (Hz5.A00(hz5)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1B = GOp.A1B(r0, "enableDebugView", andIncrement2);
                try {
                    try {
                        z = 1Br.A07(C06404gp.A00).AZk(36322675861636867L);
                        r0.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "enableDebugView", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "enableDebugView", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "enableDebugView", andIncrement);
            return z;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "enableDebugView", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (X.1Br.A06(X.C06404gp.A00).AZk(36322675861767940L) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Huo.A04():boolean");
    }

    public boolean A05() {
        Hz5 hz5 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hz5.A03;
        r0.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isHeraHostActive", andIncrement);
        boolean z = false;
        try {
            if (Hz5.A00(hz5)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1B = GOp.A1B(r0, "isHeraHostActive", andIncrement2);
                try {
                    try {
                        z = hz5.A01.A0L.get();
                        r0.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isHeraHostActive", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isHeraHostActive", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isHeraHostActive", andIncrement);
            return z;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "isHeraHostActive", andIncrement);
            throw th2;
        }
    }

    public boolean A06() {
        Hz5 hz5 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hz5.A03;
        r0.A08("com.facebook.messaging.wearable.plugins.interfaces.hera.HeraMessengerPluginInterfaceSpec", "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "shouldEnableRsysPeerRenderer", andIncrement);
        boolean z = false;
        try {
            if (Hz5.A00(hz5)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1B = GOp.A1B(r0, "shouldEnableRsysPeerRenderer", andIncrement2);
                try {
                    try {
                        HeraMessengerPluginImplementation heraMessengerPluginImplementation = hz5.A01;
                        boolean z2 = false;
                        if (7zQ.A1a(heraMessengerPluginImplementation.A0Q)) {
                            LinkedDeviceManager linkedDeviceManager = heraMessengerPluginImplementation.A05;
                            Boolean hasSupportedDeviceForPeerVideo = linkedDeviceManager != null ? linkedDeviceManager.hasSupportedDeviceForPeerVideo() : null;
                            boolean isMwaInstalled = MwaExistance.isMwaInstalled(heraMessengerPluginImplementation.A0E, false);
                            if (hasSupportedDeviceForPeerVideo != null ? hasSupportedDeviceForPeerVideo.booleanValue() : isMwaInstalled) {
                                z2 = true;
                            }
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("shouldEnableRsysPeerRenderer(): ldm=");
                            A0k.append(hasSupportedDeviceForPeerVideo);
                            A0k.append(", mwa=");
                            A0k.append(isMwaInstalled);
                            A0k.append(", tcp=");
                            A0k.append(false);
                            0fH.A0j("Hera.MsgrPluginImpl", GOq.A13(JQw.A00(42), A0k, z2));
                        }
                        z = z2;
                        r0.A09(A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "shouldEnableRsysPeerRenderer", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A1B, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "shouldEnableRsysPeerRenderer", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "shouldEnableRsysPeerRenderer", andIncrement);
            return z;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.wearable.hera.HeraMessengerPluginInterfaceSpec", "shouldEnableRsysPeerRenderer", andIncrement);
            throw th2;
        }
    }
}
