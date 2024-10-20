package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Abr, reason: case insensitive filesystem */
/* loaded from: Abr.class */
public final class C1249Abr implements DGW {
    public Object A00;
    public final Context A01;
    public final 1YC A02 = 1YC.A03;

    public C1249Abr(Context context) {
        this.A01 = context;
    }

    private boolean A00() {
        Object obj;
        if (this.A00 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A02;
            r0.A0B("com.facebook.messaging.aibot.plugins.core.core.AiBotPluginImpl", "messaging.aibot.core.core.AiBotPluginImpl", "com.facebook.messaging.aibot.plugins.interfaces.intf.AiBotPluginSpec", "messaging.aibot.intf.AiBotPluginSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1P(r0, atomicInteger)) {
                        obj = C1Y6.A02;
                        this.A00 = obj;
                    } else {
                        obj = C1Y6.A03;
                        this.A00 = obj;
                    }
                    r0.A07("messaging.aibot.core.core.AiBotPluginImpl", "messaging.aibot.intf.AiBotPluginSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A00 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.aibot.core.core.AiBotPluginImpl", "messaging.aibot.intf.AiBotPluginSpec", andIncrement, 1BL.A1U(this.A00));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.aibot.core.core.AiBotPluginImpl", "messaging.aibot.intf.AiBotPluginSpec", andIncrement, 1BL.A1U(this.A00));
                throw th;
            }
        }
        return 1BK.A1U(this.A00);
    }

    public BS1 AW9() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A02;
        r0.A08("com.facebook.messaging.aibot.plugins.interfaces.intf.AiBotPluginSpec", "messaging.aibot.intf.AiBotPluginSpec", "getAiBotFacebookProfileProvider", andIncrement);
        BS1 bs1 = null;
        try {
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.aibot.plugins.core.core.AiBotPluginImpl", "messaging.aibot.core.core.AiBotPluginImpl", "com.facebook.messaging.aibot.plugins.interfaces.intf.AiBotPluginSpec", andIncrement2, "messaging.aibot.intf.AiBotPluginSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", "getAiBotFacebookProfileProvider");
                try {
                    try {
                        new Object();
                        r0.A09("messaging.aibot.core.core.AiBotPluginImpl", "messaging.aibot.intf.AiBotPluginSpec", "getAiBotFacebookProfileProvider", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.aibot.core.core.AiBotPluginImpl", "messaging.aibot.intf.AiBotPluginSpec", "getAiBotFacebookProfileProvider", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.aibot.intf.AiBotPluginSpec", "getAiBotFacebookProfileProvider", andIncrement);
            return bs1;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.aibot.intf.AiBotPluginSpec", "getAiBotFacebookProfileProvider", andIncrement);
            throw th2;
        }
    }

    public 83Z AtQ() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A02;
        r0.A08("com.facebook.messaging.aibot.plugins.interfaces.intf.AiBotPluginSpec", "messaging.aibot.intf.AiBotPluginSpec", "getLauncher", andIncrement);
        83Z r308 = null;
        try {
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.aibot.plugins.core.core.AiBotPluginImpl", "messaging.aibot.core.core.AiBotPluginImpl", "com.facebook.messaging.aibot.plugins.interfaces.intf.AiBotPluginSpec", andIncrement2, "messaging.aibot.intf.AiBotPluginSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", "getLauncher");
                try {
                    try {
                        new 83Z();
                        r0.A09("messaging.aibot.core.core.AiBotPluginImpl", "messaging.aibot.intf.AiBotPluginSpec", "getLauncher", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.aibot.core.core.AiBotPluginImpl", "messaging.aibot.intf.AiBotPluginSpec", "getLauncher", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.aibot.intf.AiBotPluginSpec", "getLauncher", andIncrement);
            return r308;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.aibot.intf.AiBotPluginSpec", "getLauncher", andIncrement);
            throw th2;
        }
    }
}
