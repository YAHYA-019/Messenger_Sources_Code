package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSSO;
import java.util.BitSet;

/* loaded from: B2j.class */
public final class B2j extends B2z {
    public static final String __redex_internal_original_name = "AccountLoginSSOFragment";
    public COx A00;
    public boolean A01;
    public final C00i A0A = AlJ.A03(this);
    public final C00i A02 = AbI.A0N();
    public final C00i A04 = 1BV.A00(756);
    public final C00i A03 = new 1HH(this, 50020);
    public final C00i A05 = 1BV.A00(16430);
    public final BPY A09 = new B37(this, 11);
    public final DIO A08 = new ChP(this, 4);
    public final RSA A06 = new RSA(this);
    public final DJV A07 = new ChO(this, 4);

    public static String A08(B2j b2j) {
        int size = ((AccountLoginSegueSSO) ((AlJ) b2j).A01).A06.size();
        return size > 1 ? "multi_" : size == 1 ? "single_" : "invalid_";
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        AbF.A0V(this.A02).A0P(0Pz.A0j(A08(this), "sso_", BMG.A31.name));
        COx cOx = new COx(this, ((AlJ) this).A00, (C00) null, this.A09, "auth_password", "auth_password", "passwordCredentials", true);
        COx.A02(cOx);
        this.A00 = cOx;
        this.A01 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        FbUserSession A0G = 1BL.A0G(this);
        QBO qbo = new QBO(r303, new QIp());
        1LI r0 = qbo.A01;
        ((QIp) r0).A00 = A0G;
        BitSet bitSet = qbo.A02;
        bitSet.set(2);
        ((QIp) r0).A03 = ((AccountLoginSegueSSO) ((AlJ) this).A01).A06;
        bitSet.set(1);
        ((QIp) r0).A02 = AbF.A0p(this.A0A);
        bitSet.set(3);
        ((QIp) r0).A01 = this.A06;
        bitSet.set(0);
        C1rs.A02(bitSet, qbo.A03);
        qbo.A0J();
        return r0;
    }
}
