package X;

import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueTwoFacAuth;

/* loaded from: Ctt.class */
public final class Ctt implements GF9 {
    public final int A00;
    public final Object A01;

    public Ctt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GF9
    public void BpZ(String str) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                B2w b2w = (B2w) obj;
                b2w.A01 = true;
                b2w.A06.A00 = str;
                ((AccountLoginSegueRecBaseData) ((AlJ) b2w).A01).A05 = str;
                b2w.A1d();
                B2w.A08(b2w);
                return;
            case 1:
                B2v b2v = (B2v) obj;
                b2v.A01 = true;
                b2v.A07.A00 = str;
                ((AccountLoginSegueRecBaseData) ((AlJ) b2v).A01).A05 = str;
                b2v.A1d();
                B2v.A08(b2v);
                return;
            default:
                B2p b2p = (B2p) obj;
                ((AccountLoginSegueTwoFacAuth) ((AlJ) b2p).A01).A03 = str;
                B2p.A08(b2p);
                return;
        }
    }
}
