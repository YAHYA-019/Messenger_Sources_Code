package X;

import com.facebook.messaging.accountswitch.pagereply.PageAccountSwitchActivity;
import com.facebook.messaging.nativepagereply.accountswitch.model.MessengerAccountSwitchUiInfo;

/* loaded from: Cha.class */
public final class Cha implements C7y6 {
    public final /* synthetic */ PageAccountSwitchActivity A00;
    public final /* synthetic */ MessengerAccountSwitchUiInfo A01;
    public final /* synthetic */ Runnable A02;

    public Cha(PageAccountSwitchActivity pageAccountSwitchActivity, MessengerAccountSwitchUiInfo messengerAccountSwitchUiInfo, Runnable runnable) {
        this.A00 = pageAccountSwitchActivity;
        this.A01 = messengerAccountSwitchUiInfo;
        this.A02 = runnable;
    }

    @Override // X.C7y6
    public void BhO() {
        MessengerAccountSwitchUiInfo messengerAccountSwitchUiInfo = this.A01;
        if (messengerAccountSwitchUiInfo.A00() == BLO.A04 && PageAccountSwitchActivity.A15(this.A00, messengerAccountSwitchUiInfo.A03) == null) {
            return;
        }
        this.A02.run();
    }
}
