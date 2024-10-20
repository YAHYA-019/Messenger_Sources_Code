package X;

import android.content.Context;

/* loaded from: F6f.class */
public final class F6f {
    public DMd A00;
    public final 1Br A01;
    public final 1Br A02;
    public final C01i A03;
    public final C01i A04;
    public final C01i A05;
    public final C01i A06;
    public final C01i A07;
    public final C01i A08;
    public final C01i A09;

    static {
        "proactive_checkout_cooldown_start_time_ms".getClass();
        "proactive_checkout_should_stop_showing_banner".getClass();
        "proactive_checkout_session_list".getClass();
    }

    public F6f(Context context) {
        if (context != null) {
            EyR A01 = C06014fk.A01();
            11T.A0D(A01);
            this.A00 = new DMd(context, A01);
            A01.A01(context);
        }
        this.A01 = 1BK.A0C();
        this.A02 = 1BK.A0E();
        this.A05 = GAY.A00(this, 21);
        this.A08 = GAY.A00(this, 24);
        this.A09 = GAY.A00(this, 25);
        this.A04 = GAY.A00(this, 20);
        this.A03 = GAY.A00(this, 19);
        this.A07 = GAY.A00(this, 23);
        this.A06 = GAY.A00(this, 22);
    }
}
