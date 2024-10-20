package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;

/* loaded from: J0r.class */
public final class J0r implements Runnable {
    public static final String __redex_internal_original_name = "OrcaRsysConnectFunnelProxy$upload$1";
    public final /* synthetic */ McfReference A00;
    public final /* synthetic */ Gwb A01;
    public final /* synthetic */ String A02;

    public J0r(McfReference mcfReference, Gwb gwb, String str) {
        this.A01 = gwb;
        this.A02 = str;
        this.A00 = mcfReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9T i9t = (I9T) 1Br.A0B(this.A01.A00);
        String str = this.A02;
        McfReference mcfReference = this.A00;
        if (7zQ.A1a(i9t.A09)) {
            ConnectFunnel.CProxy.succeed(str, mcfReference);
        }
    }
}
