package X;

import android.accounts.Account;
import android.accounts.AccountManager;

/* renamed from: X.3i6, reason: invalid class name */
/* loaded from: 3i6.class */
public final class C3i6 implements Runnable {
    public static final String __redex_internal_original_name = "SsoToAccountManagerWriter$1";
    public final /* synthetic */ Account A00;
    public final /* synthetic */ AccountManager A01;
    public final /* synthetic */ 1GR A02;
    public final /* synthetic */ String A03;

    public C3i6(Account account, AccountManager accountManager, 1GR r304, String str) {
        this.A02 = r304;
        this.A01 = accountManager;
        this.A00 = account;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        1GR.A00(this.A00, this.A01, this.A03);
    }
}
