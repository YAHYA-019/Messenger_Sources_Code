package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueSmartlock;
import java.util.BitSet;

/* loaded from: B2h.class */
public final class B2h extends B2z {
    public static final String __redex_internal_original_name = "AccountLoginSmartlockFragment";
    public COx A00;
    public boolean A01;
    public final C00i A02 = AbI.A0N();
    public final C00i A09 = AlJ.A03(this);
    public final C00i A04 = 1BV.A00(756);
    public final C00i A05 = 1BV.A00(16430);
    public final C00i A03 = new 1HH(this, 50020);
    public final REe A0A = new REe(this);
    public final DIO A07 = new ChP(this, 5);
    public final BPY A08 = new B37(this, 14);
    public final DJV A06 = new ChO(this, 5);

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        AbF.A0V(this.A02).A0C(BMG.A2o);
        COx cOx = new COx(this, ((AlJ) this).A00, new B36(requireContext(), this.A07), this.A08, "auth_password", "auth_operation", "passwordCredentials", true);
        COx.A02(cOx);
        this.A00 = cOx;
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        FbUserSession A0C = 4YV.A0C(r303.A0D);
        C1804Atd c1804Atd = new C1804Atd(r303, new B0N());
        B0N b0n = c1804Atd.A01;
        b0n.A01 = A0C;
        BitSet bitSet = c1804Atd.A02;
        bitSet.set(1);
        b0n.A00 = ((AccountLoginSegueSmartlock) ((AlJ) this).A01).A01;
        bitSet.set(0);
        b0n.A03 = AbF.A0p(this.A09);
        bitSet.set(3);
        b0n.A02 = this.A0A;
        bitSet.set(2);
        C1rs.A02(bitSet, c1804Atd.A03);
        c1804Atd.A0J();
        return b0n;
    }
}
