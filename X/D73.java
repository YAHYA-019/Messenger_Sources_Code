package X;

import com.facebook.messaging.accountlogin.AccountLoginActivity;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueBase;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecPin;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRecSmartAuthPin;

/* loaded from: D73.class */
public final class D73 implements Runnable {
    public static final String __redex_internal_original_name = "AccountLoginActivity$4";
    public final /* synthetic */ AccountLoginActivity A00;
    public final /* synthetic */ BLp A01;

    public D73(AccountLoginActivity accountLoginActivity, BLp bLp) {
        this.A00 = accountLoginActivity;
        this.A01 = bLp;
    }

    @Override // java.lang.Runnable
    public void run() {
        AccountLoginActivity accountLoginActivity = this.A00;
        AccountLoginSegueBase accountLoginSegueBase = accountLoginActivity.A05;
        if (accountLoginSegueBase != null) {
            if (!accountLoginActivity.A0D) {
                accountLoginActivity.A0E = true;
                accountLoginActivity.A0A = this.A01;
                return;
            }
            BLp bLp = this.A01;
            AccountLoginSegueBase A03 = accountLoginSegueBase.A03(bLp);
            BLp bLp2 = accountLoginActivity.A05.A01;
            if (A03 == null) {
                0fH.A14("AccountLoginActivity", "onTransitionToNewState: invalid transition, %s -> %s", new Object[]{bLp2, bLp});
                return;
            }
            CDo cDo = accountLoginActivity.A03;
            cDo.getClass();
            if (1BK.A1T(1Br.A09(cDo.A01), 2W0.A0J)) {
                AccountLoginActivity.A1D(accountLoginActivity);
            }
            0fH.A0d(bLp2, bLp, "AccountLoginActivity", "onTransitionToNewState: state transition, %s -> %s");
            AccountLoginSegueBase accountLoginSegueBase2 = accountLoginActivity.A05;
            if ((accountLoginSegueBase2 instanceof AccountLoginSegueRecSmartAuthPin) || (accountLoginSegueBase2 instanceof AccountLoginSegueRecPin)) {
                06Z BDe = accountLoginActivity.BDe();
                if (BDe.A0U() > 0) {
                    BDe.A0w();
                }
            }
            if (!A03.A05(accountLoginActivity)) {
                accountLoginActivity.A06 = accountLoginActivity.A05;
            }
            int A02 = A03.A02();
            if (A02 == 1) {
                CIw cIw = accountLoginActivity.A04;
                cIw.getClass();
                cIw.A02(A03);
                CIw cIw2 = accountLoginActivity.A04;
                cIw2.getClass();
                cIw2.A00();
                accountLoginActivity.finish();
                return;
            }
            if (A02 != 2) {
                accountLoginActivity.A09 = A03.A01;
                return;
            }
            CIw cIw3 = accountLoginActivity.A04;
            cIw3.getClass();
            cIw3.A02(A03);
            accountLoginActivity.A06 = A03;
        }
    }
}
