package X;

import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;

/* loaded from: J23.class */
public final class J23 implements Runnable {
    public static final String __redex_internal_original_name = "OrcaRsysConnectFunnelProxy$associateCallIds$1";
    public final /* synthetic */ Gwb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public J23(Gwb gwb, String str, String str2, boolean z) {
        this.A00 = gwb;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1Br.A0C(this.A00.A00);
        ConnectFunnel.CProxy.associateCallIds(this.A02, this.A01, this.A03);
    }
}
