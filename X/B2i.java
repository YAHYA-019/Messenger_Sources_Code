package X;

import android.os.Bundle;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueAutoIdentificationOauthContinueAs;
import java.util.BitSet;

/* loaded from: B2i.class */
public final class B2i extends B2z {
    public static final String __redex_internal_original_name = "AccountLoginAutoIdentificationOauthContinueAsFragment";
    public boolean A00;
    public final C00i A04 = 1BV.A00(756);
    public final C00i A01 = AbI.A0N();
    public final C00i A02 = new 1HH(this, 50020);
    public final C00i A05 = 1BV.A00(16430);
    public final C00i A0A = AlJ.A03(this);
    public final C00i A03 = 1BV.A00(84025);
    public final DIO A08 = new ChP(this, 0);
    public final BPY A09 = new B37(this, 0);
    public final DJV A07 = new ChO(this, 0);
    public final REV A06 = new REV(this);

    public 1iF A1R() {
        return AbK.A0F();
    }

    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        AbF.A0V(this.A01).A0F(BMG.A0E, A1e());
        this.A00 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        FbUserSession A0G = 1BL.A0G(this);
        AtX atX = new AtX(r303, new B0P());
        B0P b0p = atX.A01;
        b0p.A01 = A0G;
        BitSet bitSet = atX.A02;
        bitSet.set(2);
        AccountLoginSegueAutoIdentificationOauthContinueAs accountLoginSegueAutoIdentificationOauthContinueAs = (AccountLoginSegueAutoIdentificationOauthContinueAs) ((AlJ) this).A01;
        b0p.A00 = accountLoginSegueAutoIdentificationOauthContinueAs.A00;
        bitSet.set(1);
        b0p.A02 = this.A06;
        bitSet.set(0);
        b0p.A05 = accountLoginSegueAutoIdentificationOauthContinueAs.A06;
        bitSet.set(4);
        b0p.A04 = AbF.A0p(this.A0A);
        bitSet.set(3);
        b0p.A03 = ((AccountLoginSegueAutoIdentificationOauthContinueAs) ((AlJ) this).A01).A08;
        C1rs.A04(bitSet, atX.A03);
        atX.A0J();
        return b0p;
    }

    public String A1e() {
        AccountLoginSegueAutoIdentificationOauthContinueAs accountLoginSegueAutoIdentificationOauthContinueAs = (AccountLoginSegueAutoIdentificationOauthContinueAs) ((AlJ) this).A01;
        BLt bLt = accountLoginSegueAutoIdentificationOauthContinueAs.A08;
        if (bLt == BLt.A02) {
            return "ltm_login_with_google";
        }
        String str = bLt == BLt.A03 ? "sso_like_oauth_" : "auto_identification_continue_as_oauth_login_";
        AccountCandidateModel accountCandidateModel = accountLoginSegueAutoIdentificationOauthContinueAs.A00;
        return 0Pz.A0W(str, (accountCandidateModel == null || accountCandidateModel.firstName == null) ? "non_fully_displayed_" : "fully_displayed_");
    }
}
