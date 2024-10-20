package X;

import com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethodParams;

/* loaded from: D75.class */
public final class D75 implements Runnable {
    public static final String __redex_internal_original_name = "AccountLoginSplashFragment$13";
    public final /* synthetic */ AccountRecoverySearchAccountMethodParams A00;
    public final /* synthetic */ B2c A01;

    public D75(AccountRecoverySearchAccountMethodParams accountRecoverySearchAccountMethodParams, B2c b2c) {
        this.A01 = b2c;
        this.A00 = accountRecoverySearchAccountMethodParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        B2c b2c = this.A01;
        1G2 r0 = B2c.A0X;
        COx cOx = b2c.A01;
        if (cOx != null) {
            cOx.A04(this.A00, "sso_like_oauth_search", 0);
            AbF.A0V(b2c.A07).A0F(BMG.A2u, (String) null);
        }
    }
}
