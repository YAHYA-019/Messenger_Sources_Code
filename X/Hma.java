package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.webrtc.config.WebrtcConfigInterface;

/* loaded from: Hma.class */
public final class Hma {
    public final 1De A00;

    public Hma(1De r302) {
        this.A00 = r302;
    }

    public IFQ A00(Context context, FbUserSession fbUserSession, SignalingTransportProxy signalingTransportProxy, IRF irf, I5r i5r, WebrtcConfigInterface webrtcConfigInterface, KxX kxX) {
        7zT.A1S(context, fbUserSession, signalingTransportProxy);
        11T.A0F(webrtcConfigInterface, 4);
        7zS.A18(6, "RtcInitializer.init", kxX, i5r);
        HeY heY = (HeY) 1Bn.A0E(context, (1BY) null, 115746);
        C01s A0G = 4YV.A0G();
        1qC r0 = (1qC) 1Bi.A03(116294);
        Object A03 = 1Bi.A03(115725);
        11T.A0I(A03, "null cannot be cast to non-null type com.facebook.messaging.rtc.incall.engine.rsys.api.delegate.RsysApiDelegateImpl");
        42L r02 = (42L) A03;
        2JN r03 = (2JN) 1Lo.A04(context, fbUserSession, (1BY) null, 33088);
        1BY r04 = this.A00.A00;
        return new IFQ(context, fbUserSession, r0, A0G, r02, r03, heY, signalingTransportProxy, irf, (IDc) 1Lo.A04((Context) null, fbUserSession, r04, 85223), i5r, webrtcConfigInterface, C0s8.A14((JId) 1Bn.A0E((Context) null, r04, 115607), (JId) 1Bn.A0E((Context) null, r04, 115609), (JId) 1Bn.A0E((Context) null, r04, 115610), (JId) 1Bn.A0E((Context) null, r04, 115605), (JId) 1Bn.A0E((Context) null, r04, 115611), (JId) 1Bn.A0E((Context) null, r04, 115608), (JId) 1Bn.A0E((Context) null, r04, 115606), (JId) 1Bn.A0E((Context) null, r04, 115747)));
    }
}
