package X;

import com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.EffectImplementation;

/* loaded from: J2u.class */
public final class J2u implements Runnable {
    public static final String __redex_internal_original_name = "EffectImplementation$remoteEffectSharedStateListener$1$onPeerSharedMultipeerEffect$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ EffectImplementation A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public J2u(EffectImplementation effectImplementation, String str, String str2, int i, long j) {
        this.A02 = effectImplementation;
        this.A01 = j;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ICN) 1Br.A0B(this.A02.A0E)).A03(this.A01, this.A04, 0S2.A1G, this.A03);
    }
}
