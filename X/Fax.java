package X;

import android.os.Bundle;
import com.facebook.messaging.browser.MessengerBrowserLiteCallbackService;

/* loaded from: Fax.class */
public final class Fax implements GE8 {
    public final /* synthetic */ MessengerBrowserLiteCallbackService.P2MTransparentActivity A00;

    public Fax(MessengerBrowserLiteCallbackService.P2MTransparentActivity p2MTransparentActivity) {
        this.A00 = p2MTransparentActivity;
    }

    @Override // X.GE8
    public final void C8S(String str, Bundle bundle) {
        Object obj;
        int hashCode = str.hashCode();
        if (hashCode == -397236045) {
            obj = "OnDismissDialog";
        } else if (hashCode == 361006941) {
            if (!str.equals("bk.action.navigation.CloseScreen")) {
                return;
            }
            this.A00.finish();
        } else if (hashCode != 1246727742) {
            return;
        } else {
            obj = "bk.action.bloks.DismissBottomSheet";
        }
        if (!str.equals(obj)) {
            return;
        }
        this.A00.finish();
    }
}
