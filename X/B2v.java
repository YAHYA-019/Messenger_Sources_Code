package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

/* loaded from: B2v.class */
public final class B2v extends B2y {
    public static final String __redex_internal_original_name = "AccountLoginRecSmartAuthPinFragment";
    public FbFragmentActivity A00;
    public boolean A01;
    public AccountCandidateModel A02;
    public final C00i A04 = 1BQ.A02(85269);
    public final C00i A08 = AlJ.A03(this);
    public final 1gL A03 = new C1591AmY(this, 1);
    public final REb A0B = new REb(this);
    public final GF9 A0C = new Ctt(this, 1);
    public final REh A07 = new REh();
    public final C00i A09 = 1BQ.A02(85276);
    public final C00i A0A = AbF.A0S(this, 100095);
    public final C00i A05 = 1BQ.A02(85285);
    public final C00i A06 = new 1HH(this, 99435);

    public static void A08(B2v b2v) {
        b2v.A05.get();
        ((CI0) b2v.A04.get()).A01(0S2.A03, b2v.A01 ? 0S2.A00 : 0S2.A01);
        b2v.A1g("action_recovery_confirm_received_code", null, false, b2v.A01);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    @Override // X.B2y
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        ((EwP) this.A0A.get()).A01();
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        AccountCandidateModel accountCandidateModel = ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A02;
        this.A02 = accountCandidateModel;
        accountCandidateModel.getClass();
        this.A02.A04();
        QBQ qbq = new QBQ(r303, new QMP());
        MigColorScheme A0p = AbF.A0p(this.A08);
        1LI r0 = qbq.A01;
        ((QMP) r0).A05 = A0p;
        BitSet bitSet = qbq.A02;
        bitSet.set(0);
        ((QMP) r0).A04 = AlJ.A06();
        bitSet.set(3);
        ((QMP) r0).A01 = c7xz;
        ((QMP) r0).A02 = this.A0B;
        bitSet.set(2);
        ((QMP) r0).A03 = this.A07;
        bitSet.set(6);
        AccountLoginSegueRecBaseData accountLoginSegueRecBaseData = (AccountLoginSegueRecBaseData) ((AlJ) this).A01;
        accountLoginSegueRecBaseData.A02.getClass();
        List list = accountLoginSegueRecBaseData.A02.A01;
        ((QMP) r0).A06 = list.isEmpty() ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
        bitSet.set(1);
        AccountCandidateModel accountCandidateModel2 = this.A02;
        ((QMP) r0).A07 = accountCandidateModel2.firstName;
        bitSet.set(4);
        ((QMP) r0).A08 = accountCandidateModel2.profilePictureUri;
        bitSet.set(5);
        ((QMP) r0).A00 = accountCandidateModel2.passwordResetNonceLength;
        7zP.A16(qbq, bitSet, qbq.A03);
        return r0;
    }

    @Override // X.B2y
    public void A1e() {
        this.A05.get();
        ((CI0) this.A04.get()).A01(0S2.A1J, this.A01 ? 0S2.A00 : 0S2.A01);
        this.A07.A00 = "";
        ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A05 = "";
        A1d();
    }

    @Override // X.B2y
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FbFragmentActivity) {
            this.A00 = (FbFragmentActivity) context;
        }
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-737368161);
        super.onDestroy();
        ((EwP) this.A0A.get()).A00();
        0FI.A08(-447939497, A02);
    }

    public void onDetach() {
        int A02 = 0FI.A02(-474133086);
        super.onDetach();
        this.A00 = null;
        0FI.A08(100708600, A02);
    }

    public void onStart() {
        int A02 = 0FI.A02(-87888242);
        super.onStart();
        FbFragmentActivity fbFragmentActivity = this.A00;
        if (fbFragmentActivity != null) {
            fbFragmentActivity.A5D(this.A03);
        }
        ((CI0) this.A04.get()).A00(0S2.A0u);
        C00i c00i = this.A09;
        ((FEY) c00i.get()).A00 = this.A0C;
        FEY fey = (FEY) c00i.get();
        String str = fey.A01;
        fey.A01 = null;
        if (str != null) {
            this.A01 = true;
            this.A07.A00 = str;
            ((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A05 = str;
            A08(this);
        }
        0FI.A08(-1720145930, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(90156072);
        super.onStop();
        FEY fey = (FEY) this.A09.get();
        if (fey.A00 == this.A0C) {
            fey.A00 = null;
        }
        FbFragmentActivity fbFragmentActivity = this.A00;
        if (fbFragmentActivity != null) {
            fbFragmentActivity.Cdt(this.A03);
        }
        0FI.A08(-295056430, A02);
    }
}
