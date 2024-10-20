package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethodParams;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecBaseData;
import com.facebook.messaging.phoneconfirmation.protocol.RecoveredAccount;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: B2x.class */
public final class B2x extends B2y {
    public static final String __redex_internal_original_name = "AccountLoginRecSearchAccountFragment";
    public AccountCandidateModel A00;
    public CfG A01;
    public COx A02;
    public boolean A04;
    public FbUserSession A05;
    public COx A06;
    public final C00i A09 = AbH.A0N();
    public final C00i A08 = 1BQ.A02(85272);
    public final C00i A0A = 1BV.A00(756);
    public final C00i A0D = AbH.A0M();
    public final C00i A07 = AbI.A0N();
    public final C00i A0C = AlJ.A03(this);
    public final Bbg A0E = new Bbg(this);
    public final DJV A0B = new ChO(this, 2);
    public final BPY A0F = new B37(this, 7);
    public final REf A0G = new REf();
    public String A03 = "";

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(B2x b2x) {
        C00i c00i = b2x.A0D;
        AbN.A17(c00i, 1BK.A0U(c00i), 725096220);
        b2x.A1a();
        CfG cfG = b2x.A01;
        if (cfG == null) {
            cfG = new CfG(b2x.getContext(), 2131957326);
            b2x.A01 = cfG;
        }
        cfG.ABm();
        1Kd.A0E(D4q.A00(b2x, 1), ((Kqg) 7zO.A0l(b2x, 131243)).A00("account_recovery"));
    }

    public static void A09(B2x b2x, BMG bmg) {
        Object obj;
        String str;
        HashMap A0u = AnonymousClass001.A0u();
        String str2 = ((AccountLoginSegueRecBaseData) ((AlJ) b2x).A01).A06;
        if (TextUtils.isEmpty(str2)) {
            A0u.put("contact_point", "");
        } else {
            A0u.put("contact_point", str2);
            if (Patterns.EMAIL_ADDRESS.matcher(str2).matches()) {
                obj = "query_type";
                str = "email";
            } else {
                obj = "query_type";
                str = Patterns.PHONE.matcher(str2).matches() ? "phone" : "not_email_or_phone";
            }
            A0u.put(obj, str);
            A0u.put("contact_point", str2);
        }
        AbF.A0V(b2x.A07).A0O(bmg, A0u);
    }

    public static void A0A(B2x b2x, String str) {
        AccountRecoverySearchAccountMethodParams accountRecoverySearchAccountMethodParams;
        String str2;
        AccountLoginSegueRecBaseData accountLoginSegueRecBaseData = (AccountLoginSegueRecBaseData) ((AlJ) b2x).A01;
        RecoveredAccount recoveredAccount = accountLoginSegueRecBaseData.A04;
        String str3 = recoveredAccount != null ? recoveredAccount.A01 : "";
        String str4 = accountLoginSegueRecBaseData.A06;
        if (TextUtils.isEmpty(str3)) {
            String A04 = ((B2y) b2x).A03.A04(C1fe.A2M);
            if (A04 == null) {
                A04 = "";
            }
            accountRecoverySearchAccountMethodParams = new AccountRecoverySearchAccountMethodParams(str4, null, str, A04);
        } else {
            String A042 = ((B2y) b2x).A03.A04(C1fe.A2M);
            if (A042 == null) {
                A042 = "";
            }
            ImmutableList of = ImmutableList.of((Object) str3);
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("mcuid", of);
            try {
                str2 = AnonymousClass243.A00().A0W(A0u);
            } catch (2LD e) {
                0fH.A0H(AccountRecoverySearchAccountMethodParams.class, "jsonEncode search assisted data failed", e);
                str2 = null;
            }
            accountRecoverySearchAccountMethodParams = new AccountRecoverySearchAccountMethodParams("", "", str2, str, A042, "messenger_cuid", "", null, false);
        }
        b2x.A06.A04(accountRecoverySearchAccountMethodParams, "action_recovery_search_account", 2131957326);
    }

    public void A1K() {
        super/*X.1pK*/.A1K();
        1BK.A0U(this.A0D).markerEnd(725105460, (short) 2);
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.B2y
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A05 = AbL.A09(this);
        1UG.A07(1BK.A07(this.A09), 1BJ.A00(2016));
        String A00 = 1BJ.A00(41);
        COx cOx = new COx(this, ((AlJ) this).A00, new C00(getContext()), this.A0F, A00, "search_account", "accountRecoverySearchAccountParamsKey", false);
        COx.A02(cOx);
        this.A06 = cOx;
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        REf rEf = this.A0G;
        AccountLoginSegueRecBaseData accountLoginSegueRecBaseData = (AccountLoginSegueRecBaseData) ((AlJ) this).A01;
        RecoveredAccount recoveredAccount = accountLoginSegueRecBaseData.A04;
        String str = recoveredAccount != null ? recoveredAccount.A03 : accountLoginSegueRecBaseData.A06;
        Bbm bbm = rEf.A00;
        if (str != null) {
            bbm.A00 = str;
        }
        QBM qbm = new QBM(r303, new QL4());
        MigColorScheme A0p = AbF.A0p(this.A0C);
        1LI r0 = qbm.A01;
        ((QL4) r0).A04 = A0p;
        BitSet bitSet = qbm.A02;
        bitSet.set(0);
        ((QL4) r0).A02 = rEf;
        bitSet.set(6);
        ((QL4) r0).A03 = AlJ.A06();
        bitSet.set(4);
        ((QL4) r0).A00 = c7xz;
        ((QL4) r0).A07 = this.A04;
        bitSet.set(1);
        ((QL4) r0).A06 = this.A03;
        bitSet.set(3);
        ((QL4) r0).A08 = AnonymousClass001.A1U(((AccountLoginSegueRecBaseData) ((AlJ) this).A01).A04);
        bitSet.set(5);
        this.A08.get();
        ((QL4) r0).A05 = "";
        bitSet.set(2);
        ((QL4) r0).A01 = this.A0E;
        7zP.A16(qbm, bitSet, qbm.A03);
        return r0;
    }
}
