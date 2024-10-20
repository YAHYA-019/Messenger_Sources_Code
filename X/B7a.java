package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: B7a.class */
public final class B7a extends 9xL {
    public final /* synthetic */ C1587Am6 A00;

    public B7a(C1587Am6 c1587Am6) {
        this.A00 = c1587Am6;
    }

    public void C8f() {
        ((B7g) this.A00.A01.getValue()).A0d();
    }

    public void CCs() {
        B7g b7g = (B7g) this.A00.A01.getValue();
        b7g.A00 = true;
        C00i c00i = b7g.A06.A00;
        ThreadKey threadKey = AbJ.A0j(c00i).A05;
        C00i c00i2 = b7g.A09.A00;
        if (((CJ5) c00i2.get()).A01 != 0S2.A01 || threadKey == null) {
            ((JOJ) 1Br.A0B(b7g.A07)).BZn(AbJ.A0j(c00i).A0X ? "SAFETY_WARNING_INTERSTITIAL_OUTGOING_ACCEPT" : "SAFETY_WARNING_INTERSTITIAL_INCOMING_ACCEPT");
        } else {
            CQS cqs = (CQS) 1Br.A0B(b7g.A05);
            CQS.A03(AbJ.A0j(c00i).A0X ? BOp.A0T : BOp.A0U, b7g.A01, threadKey, cqs);
        }
        if (AbM.A1Z(b7g)) {
            I2V i2v = (I2V) 1Br.A0B(((CJ5) c00i2.get()).A07);
            i2v.A05.Cvy(i2v, true, I2V.A06[1]);
            if (AbJ.A0j(c00i).A0X) {
                ((IRF) 1Br.A0B(b7g.A03)).A0x(true);
                return;
            }
            Hrj hrj = (Hrj) 1Br.A0B(b7g.A02);
            FbUserSession fbUserSession = b7g.A01;
            boolean z = AbJ.A0j(c00i).A0a;
            1pK r0 = (1pK) b7g.A0W().get();
            hrj.A00(r0 != null ? r0.A1P() : null, fbUserSession, 0S2.A00, z);
        }
    }
}
