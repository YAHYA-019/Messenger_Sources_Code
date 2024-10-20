package X;

import android.os.Bundle;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import java.util.HashMap;

/* loaded from: B2w.class */
public final class B2w extends B2y {
    public static final String __redex_internal_original_name = "AccountLoginRecPinFragment";
    public long A00;
    public boolean A01;
    public AccountCandidateModel A02;
    public EwP A03;
    public final C00i A07 = AbI.A0N();
    public final C00i A08 = AbH.A0M();
    public final REX A09 = new REX(this);
    public final GF9 A0A = new Ctt(this, 0);
    public final REg A06 = new REg();
    public final FEY A0B = (FEY) 1Bi.A03(85276);
    public final BWd A0C = (BWd) 1Bi.A03(85285);
    public final C00i A04 = AbH.A0a();
    public final C00i A05 = new 1HH(this, 99435);

    public static void A08(B2w b2w) {
        C00i c00i = b2w.A08;
        AbN.A17(c00i, 1BK.A0U(c00i), 725092849);
        if (b2w.A1g("action_recovery_confirm_received_code", null, false, b2w.A01)) {
            A09(b2w, BMG.A2R);
        }
    }

    public static void A09(B2w b2w, BMG bmg) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("contact_point", AlJ.A07(b2w));
        AbF.A0V(b2w.A07).A0O(bmg, A0u);
    }

    public void A1K() {
        super/*X.1pK*/.A1K();
        1BK.A0U(this.A08).markerEnd(725096125, (short) 2);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.B2y
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A03 = (EwP) 7zO.A0l(this, 100095);
        this.A00 = 1BL.A08(this.A04);
        EwP ewP = this.A03;
        ewP.getClass();
        ewP.A01();
        A09(this, BMG.A2T);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0142  */
    /* JADX WARN: Type inference failed for: r0v78, types: [com.facebook.mig.scheme.interfaces.MigColorScheme] */
    @Override // X.B2z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A1c(X.C7xz r302, X.1Iw r303) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B2w.A1c(X.7xz, X.1Iw):X.1LI");
    }

    @Override // X.B2y
    public void A1e() {
        this.A01 = false;
        this.A06.A00 = "";
        ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A05 = "";
        A1d();
        A09(this, BMG.A2S);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(1370951345);
        super.onDestroy();
        EwP ewP = this.A03;
        ewP.getClass();
        ewP.A00();
        0FI.A08(1714075022, A02);
    }

    public void onStart() {
        int A02 = 0FI.A02(794895234);
        super.onStart();
        FEY fey = this.A0B;
        fey.A00 = this.A0A;
        String str = fey.A01;
        fey.A01 = null;
        if (str != null) {
            this.A01 = true;
            ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A05 = str;
            A08(this);
        }
        0FI.A08(-1999847117, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(-196123321);
        super.onStop();
        FEY fey = this.A0B;
        if (fey.A00 == this.A0A) {
            fey.A00 = null;
        }
        0FI.A08(1531832276, A02);
    }
}
