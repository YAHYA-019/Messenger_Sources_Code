package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.google.common.base.Platform;

/* loaded from: Ci3.class */
public final class Ci3 implements MIS {
    public Context A00;
    public 1BY A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;

    public Ci3(1BO r302) {
        Context A04 = AbF.A04((1BY) null);
        this.A00 = A04;
        this.A04 = AbF.A0Q(A04, 67720);
        this.A03 = AbH.A0b();
        this.A02 = 1BV.A01((1BY) null, 83719);
        this.A01 = 7zL.A0Q(r302);
    }

    public String Awg() {
        return "ACTION_MESSENGER_OPEN_THREAD";
    }

    public void BMD(Context context, Bundle bundle, java.util.Map map) {
        if (bundle == null || Platform.stringIsNullOrEmpty(bundle.getString("BrowserLiteIntent.MessengerExtras.EXTRA_PAGE_ID"))) {
            return;
        }
        Intent A04 = ((4iH) this.A03.get()).A04(AbL.A0F(this.A04, bundle.getString("BrowserLiteIntent.MessengerExtras.EXTRA_PAGE_ID")), 5SW.A0F);
        A04.putExtra("modify_backstack_override", false);
        A04.addFlags(268435456);
        A04.putExtra("trigger", "messenger_browser_profile_icon");
        A04.putExtra("entrypoint", NavigationTrigger.A01(null, "messenger_browser_profile_icon", "browser_profile_icon"));
        0LS.A0A(1BK.A04(this.A02), A04);
    }
}
