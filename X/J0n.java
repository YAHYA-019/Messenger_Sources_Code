package X;

import com.facebook.messaging.rtc.incall.plugins.notification.feature.raisehand.RaiseHandImplementation;

/* loaded from: J0n.class */
public final class J0n implements Runnable {
    public static final String __redex_internal_original_name = "RaiseHandImplementation$showRaiseHandTopNotification$1";
    public final /* synthetic */ RaiseHandImplementation A00;
    public final /* synthetic */ I9O A01;
    public final /* synthetic */ String A02;

    public J0n(RaiseHandImplementation raiseHandImplementation, I9O i9o, String str) {
        this.A00 = raiseHandImplementation;
        this.A01 = i9o;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RaiseHandImplementation raiseHandImplementation = this.A00;
        I9O i9o = this.A01;
        ((I8j) 1Br.A0B(raiseHandImplementation.A02)).A03(new SD6(raiseHandImplementation, i9o, this.A02), 11T.A03(i9o));
    }
}
