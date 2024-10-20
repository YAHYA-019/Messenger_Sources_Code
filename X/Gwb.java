package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy;

/* loaded from: Gwb.class */
public final class Gwb extends ConnectFunnelProxy {
    public final 1Br A00;
    public final Handler A01;
    public final FbUserSession A02;

    public Gwb(FbUserSession fbUserSession, Context context) {
        1BL.A1F(fbUserSession, context);
        this.A02 = fbUserSession;
        this.A00 = 1Lm.A00(context, fbUserSession, 115096);
        this.A01 = AnonymousClass001.A07();
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public void annotateMultiple(String str, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4) {
        11T.A0F(str, 0);
        7zT.A1U(map2, map3, map4);
        this.A01.post(new J2w(this, str, map2, map3, map4));
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public void associateCallIds(String str, String str2, boolean z) {
        11T.A0H(str, str2);
        this.A01.post(new J23(this, str, str2, z));
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public void markPoint(String str, int i) {
        11T.A0F(str, 0);
        this.A01.post(new J0p(this, str, i));
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public void start(String str, int i, java.util.Map map) {
        11T.A0F(str, 0);
        this.A01.post(new J0q(this, str, i));
    }

    @Override // com.facebook.rsys.connectfunnel.gen.ConnectFunnelProxy
    public void upload(String str, McfReference mcfReference) {
        11T.A0F(str, 0);
        this.A01.post(new J0r(mcfReference, this, str));
    }
}
