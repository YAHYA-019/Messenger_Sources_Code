package X;

import com.facebook.auth.component.AccountSwitchingAuthenticationResult;
import com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity;

/* loaded from: Chd.class */
public final class Chd implements DGc {
    public final /* synthetic */ PageAccountSwitchActivity A00;

    public Chd(PageAccountSwitchActivity pageAccountSwitchActivity) {
        this.A00 = pageAccountSwitchActivity;
    }

    @Override // X.DGc
    public void onFailure(Throwable th) {
        PageAccountSwitchActivity.A1G(this.A00, th);
    }

    @Override // X.DGc
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AccountSwitchingAuthenticationResult accountSwitchingAuthenticationResult = (AccountSwitchingAuthenticationResult) obj;
        accountSwitchingAuthenticationResult.getClass();
        PageAccountSwitchActivity.A16(accountSwitchingAuthenticationResult, this.A00);
    }
}
