package X;

import android.os.Bundle;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: B2u.class */
public final class B2u extends B2y {
    public static final String __redex_internal_original_name = "AccountLoginRecSelectMethodFragment";
    public final C00i A00 = AbH.A0N();
    public final C00i A02 = AbI.A0N();
    public final C00i A01 = AbH.A0M();
    public final REa A03 = new REa(this);

    public static void A08(B2u b2u, BMG bmg) {
        HashMap A0u = AnonymousClass001.A0u();
        AccountCandidateModel accountCandidateModel = ((AccountLoginSegueRecBaseData) ((AlJ) b2u).A01).A02;
        if (accountCandidateModel != null) {
            int size = accountCandidateModel.A00().size();
            int size2 = accountCandidateModel.A02().size();
            AbG.A1Y("num_accounts", A0u, size + size2);
            AbG.A1Y("email", A0u, size);
            AbG.A1Y("phone", A0u, size2);
        }
        AbF.A0V(b2u.A02).A0O(bmg, A0u);
    }

    public void A1K() {
        super/*X.1pK*/.A1K();
        1BK.A0U(this.A01).markerEnd(725096220, (short) 2);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    @Override // X.B2y
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        A08(this, BMG.A2N);
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        AccountCandidateModel accountCandidateModel = ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A02;
        if (accountCandidateModel == null) {
            return AbK.A0N(r303).A00;
        }
        String str = accountCandidateModel.id;
        1UG A08 = 1BK.A08(1BK.A07(this.A00), 1BJ.A00(1433));
        if (A08.isSampled()) {
            A08.A7R("crypted_id", str);
            A08.BZL();
        }
        ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A02.A04();
        C1801Ata c1801Ata = new C1801Ata(r303, new B14());
        CHq A06 = AlJ.A06();
        B14 b14 = c1801Ata.A01;
        b14.A03 = A06;
        BitSet bitSet = c1801Ata.A02;
        bitSet.set(0);
        b14.A00 = c7xz;
        b14.A01 = ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A02;
        bitSet.set(1);
        b14.A02 = this.A03;
        C1rs.A00(bitSet, c1801Ata.A03);
        c1801Ata.A0J();
        return b14;
    }
}
