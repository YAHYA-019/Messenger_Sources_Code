package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: Kqp.class */
public final class Kqp {
    public final /* synthetic */ L4G A00;
    public final /* synthetic */ Ke7 A01;
    public final /* synthetic */ L1x A02;
    public final /* synthetic */ RKD A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ byte[] A08;
    public final /* synthetic */ byte[] A09;

    public Kqp(L4G l4g, Ke7 ke7, L1x l1x, RKD rkd, Integer num, String str, String str2, String str3, byte[] bArr, byte[] bArr2) {
        this.A00 = l4g;
        this.A01 = ke7;
        this.A04 = num;
        this.A07 = str;
        this.A05 = str2;
        this.A03 = rkd;
        this.A09 = bArr;
        this.A08 = bArr2;
        this.A06 = str3;
        this.A02 = l1x;
    }

    public void A00(Throwable th) {
        11T.A0F(th, 0);
        L4G l4g = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = l4g.A02;
        int i = l4g.A00;
        int i2 = l4g.A01;
        lightweightQuickPerformanceLogger.markerPoint(i, i2, "begin_register_network_end");
        JQx.A1H(lightweightQuickPerformanceLogger, "begin_register_network_call_error", message, i, i2);
        L1x.A00(null, KNA.A06, this.A02, th);
    }
}
