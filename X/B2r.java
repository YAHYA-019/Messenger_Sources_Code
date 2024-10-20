package X;

import android.text.TextUtils;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecAccountSelection;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: B2r.class */
public final class B2r extends B2y {
    public static final String __redex_internal_original_name = "AccountLoginRecSelectAccountFragment";
    public AccountCandidateModel A00;
    public final REZ A04 = new REZ(this);
    public final C00i A03 = 1BV.A00(85256);
    public final C00i A02 = 1BV.A00(756);
    public final C00i A01 = AbI.A0N();
    public final C2kx A06 = new C2kx();
    public final DJV A05 = new ChO(this, 3);

    public 1iF A1R() {
        return AbK.A0F();
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        QBN qbn = new QBN(r303, new QKV());
        CHq A06 = AlJ.A06();
        1LI r0 = qbn.A01;
        ((QKV) r0).A02 = A06;
        BitSet bitSet = qbn.A02;
        bitSet.set(2);
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = ImmutableList.copyOf((Collection) ((AccountLoginSegueRecAccountSelection) ((AlJ) this).A01).A00).iterator();
        while (it.hasNext()) {
            AccountCandidateModel accountCandidateModel = (AccountCandidateModel) it.next();
            A0s2.add(accountCandidateModel.name);
            CvN cvN = new CvN(0, accountCandidateModel, A0s2, this);
            AnonymousClass557 A0p = 7zL.A0p();
            A0p.A05 = new C58t(new PicSquare(ImmutableList.of((Object) new PicSquareUrlWithSize(100, accountCandidateModel.profilePictureUri))));
            A0p.A08(accountCandidateModel.name);
            A0p.A07(accountCandidateModel.networkName);
            A0p.A01();
            A0p.A01 = cvN;
            A0s.add(A0p.A00());
        }
        int size = A0s2.size();
        HashMap A0u = AnonymousClass001.A0u();
        AbG.A1Y("num_accounts", A0u, size);
        A0u.put("user_id", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0s2));
        AbF.A0V(this.A01).A0O(BMG.A2K, A0u);
        ((QKV) r0).A03 = ImmutableList.copyOf((Collection) A0s);
        bitSet.set(1);
        ((QKV) r0).A00 = this.A06;
        bitSet.set(0);
        ((QKV) r0).A01 = this.A04;
        C1rs.A03(bitSet, qbn.A03);
        qbn.A0J();
        return r0;
    }
}
