package X;

import com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethodParams;

/* loaded from: D74.class */
public final class D74 implements Runnable {
    public static final String __redex_internal_original_name = "AccountLoginCredentialsFragment$8";
    public final /* synthetic */ AccountRecoverySearchAccountMethodParams A00;
    public final /* synthetic */ B2q A01;

    public D74(AccountRecoverySearchAccountMethodParams accountRecoverySearchAccountMethodParams, B2q b2q) {
        this.A01 = b2q;
        this.A00 = accountRecoverySearchAccountMethodParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        B2q b2q = this.A01;
        1G2 r0 = B2q.A0x;
        COx cOx = b2q.A05;
        if (cOx != null) {
            cOx.A04(this.A00, "auto_identification_device_email_search_account", 2131952998);
        }
    }
}
