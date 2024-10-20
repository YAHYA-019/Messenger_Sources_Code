package X;

import com.facebook.auth.component.AccountSwitchingAuthenticationResult;
import com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity;

/* loaded from: Chc.class */
public final class Chc implements DGc {
    public final /* synthetic */ PageAccountSwitchActivity A00;

    public Chc(PageAccountSwitchActivity pageAccountSwitchActivity) {
        this.A00 = pageAccountSwitchActivity;
    }

    @Override // X.DGc
    public void onFailure(Throwable th) {
        PageAccountSwitchActivity pageAccountSwitchActivity = this.A00;
        PageAccountSwitchActivity.A1F(pageAccountSwitchActivity, 0Pz.A1B("Logout failed. ", th));
        PageAccountSwitchActivity.A1G(pageAccountSwitchActivity, th);
    }

    @Override // X.DGc
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AccountSwitchingAuthenticationResult accountSwitchingAuthenticationResult = (AccountSwitchingAuthenticationResult) obj;
        accountSwitchingAuthenticationResult.getClass();
        PageAccountSwitchActivity pageAccountSwitchActivity = this.A00;
        1PE.A00((1PE) pageAccountSwitchActivity.A0M.get(), 1BJ.A00(195));
        PageAccountSwitchActivity.A16(accountSwitchingAuthenticationResult, pageAccountSwitchActivity);
    }
}
