package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: Kqd.class */
public final class Kqd {
    public final /* synthetic */ L4G A00;
    public final /* synthetic */ Ke7 A01;
    public final /* synthetic */ L1x A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public Kqd(L4G l4g, Ke7 ke7, L1x l1x, Integer num, String str, String str2, String str3, String str4) {
        this.A00 = l4g;
        this.A02 = l1x;
        this.A01 = ke7;
        this.A03 = num;
        this.A04 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A06 = str4;
    }

    public void A00(Throwable th) {
        11T.A0F(th, 0);
        L4G l4g = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = l4g.A02;
        int i = l4g.A00;
        int i2 = l4g.A01;
        lightweightQuickPerformanceLogger.markerPoint(i, i2, "init_register_network_end");
        JQx.A1H(lightweightQuickPerformanceLogger, "init_register_network_call_error", message, i, i2);
        L1x.A00(null, KNA.A06, this.A02, th);
    }
}
