package X;

import com.facebook.messaging.sup.plugins.videocalling.impl.SUPVideoCallingImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4g2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4g2.class */
public final class C06144g2 {
    public final C06164g4 A00;

    public C06144g2(C06164g4 c06164g4) {
        this.A00 = c06164g4;
    }

    public static C06144g2 A00() {
        return new C06144g2((C06164g4) C1Y6.A00(null, "com_facebook_messaging_sup_plugins_interfaces_videocalling_SUPVideoCallingSpec", "All", new Object[0]));
    }

    public boolean A01() {
        C06204g8 c06204g8 = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = c06204g8.A02;
        r0.A08("com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", "messaging.sup.videocalling.SUPVideoCallingSpec", "isPluginEnabled", andIncrement);
        boolean z = false;
        Exception e = null;
        try {
            if (C06204g8.A00(c06204g8)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.sup.plugins.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.impl.SUPVideoCallingImpl", "com.facebook.messaging.sup.plugins.interfaces.videocalling.SUPVideoCallingSpec", andIncrement2, "messaging.sup.videocalling.SUPVideoCallingSpec", "com.facebook.messaging.sup.plugins.videocalling.SUPVideoCallingKillSwitch", "isPluginEnabled");
                try {
                    try {
                        z = SUPVideoCallingImpl.A08;
                        r0.A09("messaging.sup.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.SUPVideoCallingSpec", "isPluginEnabled", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.sup.videocalling.impl.SUPVideoCallingImpl", "messaging.sup.videocalling.SUPVideoCallingSpec", "isPluginEnabled", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.sup.videocalling.SUPVideoCallingSpec", "isPluginEnabled", andIncrement);
            return z;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.sup.videocalling.SUPVideoCallingSpec", "isPluginEnabled", andIncrement);
            throw th2;
        }
    }
}
