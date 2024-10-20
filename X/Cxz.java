package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Cxz.class */
public final class Cxz implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public Cxz(FbUserSession fbUserSession, 5dN r303, C5dO c5dO, int i, boolean z) {
        this.A00 = i;
        this.A03 = c5dO;
        this.A02 = fbUserSession;
        this.A04 = z;
        this.A01 = r303;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        int i = this.A00;
        2CM r0 = (2CM) obj;
        11T.A0F(r0, 0);
        boolean z = r0.A00;
        C5dO c5dO = (C5dO) this.A03;
        1G1 r02 = (FbUserSession) this.A02;
        boolean z2 = this.A04;
        CmE cmE = (5dN) this.A01;
        if (i != 0) {
            if (z) {
                String str = r02.A02;
                if (0Pz.A0W("should_present_peer_device_change_security_alert/", str) != null) {
                    InterfaceC00051a0 AP5 = c5dO.A00.AP5();
                    AP5.Ca2(0Pz.A0W("should_present_peer_device_change_security_alert/", str), z2);
                    AP5.apply();
                    cmE.CsW(z2);
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            String str2 = r02.A02;
            if (0Pz.A0W("should_present_security_alert/", str2) != null) {
                InterfaceC00051a0 AP52 = c5dO.A00.AP5();
                AP52.Ca2(0Pz.A0W("should_present_security_alert/", str2), z2);
                AP52.apply();
                B96 b96 = cmE.A00;
                b96.A04 = z2;
                1GU r03 = b96.A01;
                if (r03 == null) {
                    11T.A0L("threadUtil");
                    throw 0Q8.createAndThrow();
                }
                r03.Ciz(new D5p(b96));
            }
        }
    }
}
