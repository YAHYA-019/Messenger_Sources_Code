package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.auth.protocol.LinkedFbUserFromIgSessionInfo;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueNewSSOInstagram;
import java.util.BitSet;

/* loaded from: B2m.class */
public final class B2m extends B2z {
    public static final String __redex_internal_original_name = "AccountLoginNewSSOInstagramFragment";
    public COx A00;
    public final C00i A02 = AlJ.A03(this);
    public final C00i A01 = AbI.A0N();
    public final DIO A04 = new ChP(this, 2);
    public final BPY A05 = new B37(this, 5);
    public final REW A03 = new REW(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(B2m b2m, String str) {
        CQH A0V = AbF.A0V(b2m.A01);
        String A0W = 0Pz.A0W("IG_SSO_", str);
        1UG A00 = CQH.A00(A0V);
        if (A00.isSampled()) {
            AbI.A1L(A00, A0W);
        }
        View view = b2m.mView;
        if (view != null) {
            L5Q A002 = L5Q.A00(view, b2m.getString(2131966183), 0, 2132213765);
            A002.A05(5);
            A002.A02();
        }
        b2m.A1b(BLp.A07);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        AbF.A0V(this.A01).A0A(BMG.A0g);
        COx cOx = new COx(this, ((AlJ) this).A00, (C00) null, this.A05, "auth_password", "auth_password", "passwordCredentials", true);
        COx.A02(cOx);
        this.A00 = cOx;
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        AtY atY = new AtY(r303, new B0L());
        LinkedFbUserFromIgSessionInfo linkedFbUserFromIgSessionInfo = ((AccountLoginSegueNewSSOInstagram) ((AlJ) this).A01).A06;
        B0L b0l = atY.A01;
        b0l.A00 = linkedFbUserFromIgSessionInfo;
        BitSet bitSet = atY.A02;
        bitSet.set(1);
        b0l.A01 = this.A03;
        bitSet.set(0);
        b0l.A02 = AbF.A0p(this.A02);
        bitSet.set(2);
        C1rs.A03(bitSet, atY.A03);
        atY.A0J();
        return b0l;
    }
}
