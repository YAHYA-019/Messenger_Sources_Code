package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Eru.class */
public final class Eru {
    public final EcU A00;

    public Eru(EcU ecU) {
        this.A00 = ecU;
    }

    public boolean A00() {
        F5Q f5q = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = f5q.A01;
        r0.A08("com.facebook.messaging.neue.nux.plugins.interfaces.interactions.NeueNuxOnBackSpec", "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "shouldNavigate", andIncrement);
        boolean z = false;
        try {
            if (F5Q.A00(f5q)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.neue.nux.plugins.interactions.mobile.impl.GoToLauncherImpl", "messaging.neue.nux.interactions.mobile.impl.GoToLauncherImpl", "com.facebook.messaging.neue.nux.plugins.interfaces.interactions.NeueNuxOnBackSpec", andIncrement2, "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "com.facebook.messaging.neue.nux.plugins.interactions.mobile.NeueNuxInteractionsMobileKillSwitch", "shouldNavigate");
                z = true;
                r0.A09("messaging.neue.nux.interactions.mobile.impl.GoToLauncherImpl", "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "shouldNavigate", andIncrement2);
            }
            r0.A02((Exception) null, "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "shouldNavigate", andIncrement);
            return z;
        } catch (Throwable th) {
            r0.A02((Exception) null, "messaging.neue.nux.interactions.NeueNuxOnBackSpec", "shouldNavigate", andIncrement);
            throw th;
        }
    }
}
