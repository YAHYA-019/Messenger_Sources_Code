package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.base.Present;

/* loaded from: Hnx.class */
public final class Hnx {
    public final 1Br A00;
    public final 1Br A01;

    public Hnx(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = 1Lm.A00(7zM.A0A(), fbUserSession, 99977);
        this.A00 = 1Lm.A01(fbUserSession, 115623);
    }

    public void A00(HBK hbk, String str) {
        IfG ifG = GOq.A0s(this.A01).A07;
        if (ifG == null) {
            4zI.A03.A06("StateSyncManager", "Attempt to send data to state sync topic (%s) for an unavailable conference call.", new Object[]{hbk});
            return;
        }
        String str2 = hbk.topicName;
        Present present = new Present(str);
        11T.A0F(str2, 0);
        IfG.A01(ifG, new D3k(present, ifG, str2, 2));
    }
}
