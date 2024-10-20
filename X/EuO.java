package X;

import android.accounts.Account;
import android.accounts.AccountManager;

/* loaded from: EuO.class */
public final class EuO {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ AccountManager A01;
    public final /* synthetic */ FHh A02;
    public final /* synthetic */ GJj A03;

    public EuO(Account account, AccountManager accountManager, FHh fHh, GJj gJj) {
        this.A01 = accountManager;
        this.A00 = account;
        this.A02 = fHh;
        this.A03 = gJj;
    }

    public void A00() {
        String userData = this.A01.getUserData(this.A00, "sso_settings_v2");
        if (userData != null) {
            2JB.A01(new G3a(this.A02, this.A03, userData));
        }
    }
}
