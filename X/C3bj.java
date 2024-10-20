package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: X.3bj, reason: invalid class name */
/* loaded from: 3bj.class */
public final class C3bj implements C3m6 {
    public C3ly A00;
    public final 4VS A01;
    public final C3Uu A02;
    public final Callable A03;
    public volatile Juw A04;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.3Uu, java.lang.Object] */
    public C3bj(final AwakeTimeSinceBootClock awakeTimeSinceBootClock, final HnI hnI, final C02q c02q, final C1hF c1hF, final 1IU r306, final Random random, final C15h c15h, final C15h c15h2, final C15h c15h3, final C15h c15h4, final C15h c15h5, final C15h c15h6, boolean z) {
        this.A03 = new Callable() { // from class: X.3iv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C02q c02q2 = c02q;
                C15h c15h7 = c15h;
                C15h c15h8 = c15h2;
                C15h c15h9 = c15h3;
                C15h c15h10 = c15h4;
                C15h c15h11 = c15h5;
                C15h c15h12 = c15h6;
                return new Juw(awakeTimeSinceBootClock, hnI, c02q2, c1hF, r306, random, c15h7, c15h8, c15h9, c15h10, c15h11, c15h12);
            }
        };
        if (!z) {
            A00();
        }
        this.A01 = new 4VS(r306, new LuE(this, 14));
        this.A02 = new Object();
    }

    public Juw A00() {
        if (this.A04 == null) {
            synchronized (this) {
                if (this.A04 == null) {
                    try {
                        Juw juw = (Juw) this.A03.call();
                        juw.getClass();
                        this.A04 = juw;
                        C3ly c3ly = this.A00;
                        if (c3ly != null) {
                            this.A04.A01(c3ly);
                        }
                    } catch (Exception e) {
                        throw AnonymousClass001.A0U(e);
                    }
                }
            }
        }
        return this.A04;
    }

    @Override // X.C3m6
    public MQZ Adl() {
        return A00();
    }

    @Override // X.C3m6
    public 3lJ B2u() {
        return this.A01;
    }

    @Override // X.C3m6
    public C4YI B2v() {
        return this.A02;
    }
}
