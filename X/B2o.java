package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRegSoftMatchLogin;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: B2o.class */
public final class B2o extends B2z implements CallerContextable {
    public static final String __redex_internal_original_name = "AccountLoginRegSoftmatchLoginFragment";
    public Bjv A00;
    public C4T A01;
    public boolean A03;
    public COx A04;
    public COx A05;
    public DEf A06;
    public final C00i A07 = AlJ.A03(this);
    public final REd A08 = new REd(this);
    public final BPY A0A = new B37(this, 9);
    public final DIO A09 = new ChP(this, 3);
    public final BoQ A0B = new BoQ();
    public String A02 = "";

    public static void A08(B2o b2o, String str, String str2) {
        if (b2o.A05 != null) {
            b2o.A1a();
            AccountLoginSegueRegSoftMatchLogin accountLoginSegueRegSoftMatchLogin = (AccountLoginSegueRegSoftMatchLogin) ((AlJ) b2o).A01;
            int i = accountLoginSegueRegSoftMatchLogin.A02.A00;
            b2o.A05.A04(new PasswordCredentials(accountLoginSegueRegSoftMatchLogin.A00, str, str2), i == 0 ? "action_auth_with_recovered_fb_account" : i == 1 ? "action_auth_with_recovered_mo_account" : "action_auth_with_recovered_account", 2131952189);
        }
    }

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = (Bjv) 1Bn.A0A(85270);
        this.A01 = (C4T) 1Bn.A0A(83996);
        Context context = getContext();
        if (context != null) {
            String A00 = 1BJ.A00(554);
            DIO dio = this.A09;
            B36 b36 = new B36(context, dio);
            BPY bpy = this.A0A;
            COx cOx = new COx(this, ((AlJ) this).A00, b36, bpy, A00, "softmatch_auth_operation", "passwordCredentials", false);
            COx.A02(cOx);
            this.A05 = cOx;
            COx cOx2 = new COx(this, ((AlJ) this).A00, new B36(context, dio), bpy, "auth_switch_accounts", "account_switch_operation", "passwordCredentials", true);
            COx.A02(cOx2);
            this.A04 = cOx2;
        }
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        BoQ boQ = this.A0B;
        AccountLoginSegueRegSoftMatchLogin accountLoginSegueRegSoftMatchLogin = (AccountLoginSegueRegSoftMatchLogin) ((AlJ) this).A01;
        boQ.A02.A00 = accountLoginSegueRegSoftMatchLogin.A08;
        boQ.A00 = accountLoginSegueRegSoftMatchLogin.A0B;
        QBT qbt = new QBT(r303, new QL3());
        MigColorScheme A0p = AbF.A0p(this.A07);
        1LI r0 = qbt.A01;
        ((QL3) r0).A05 = A0p;
        BitSet bitSet = qbt.A02;
        bitSet.set(0);
        ((QL3) r0).A03 = AlJ.A06();
        bitSet.set(3);
        ((QL3) r0).A00 = c7xz;
        bitSet.set(5);
        ((QL3) r0).A04 = ((AccountLoginSegueRegSoftMatchLogin) ((AlJ) this).A01).A02;
        bitSet.set(4);
        ((QL3) r0).A01 = this.A08;
        ((QL3) r0).A02 = boQ;
        bitSet.set(6);
        ((QL3) r0).A06 = this.A02;
        bitSet.set(2);
        ((QL3) r0).A07 = this.A03;
        bitSet.set(1);
        7zP.A16(qbt, bitSet, qbt.A03);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof DEf) {
            this.A06 = (DEf) context;
        }
    }
}
