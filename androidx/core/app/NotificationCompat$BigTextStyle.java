package androidx.core.app;

import X.4YT;
import X.4vF;
import X.4vG;
import X.4vI;
import X.C10924uz;
import android.app.Notification;
import android.os.Bundle;

/* loaded from: NotificationCompat$BigTextStyle.class */
public final class NotificationCompat$BigTextStyle extends 4vI {
    public CharSequence A00;

    public String A02() {
        return 4YT.A00(861);
    }

    public void A04(Bundle bundle) {
        super.A04(bundle);
        bundle.remove("android.bigText");
    }

    public void A05(Bundle bundle) {
        super.A05(bundle);
        this.A00 = bundle.getCharSequence("android.bigText");
    }

    public void A06(4vG r302) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((4vF) r302).A04).setBigContentTitle(((4vI) this).A01).bigText(this.A00);
        if (((4vI) this).A03) {
            bigText.setSummaryText(((4vI) this).A02);
        }
    }

    public void A08(CharSequence charSequence) {
        this.A00 = C10924uz.A02(charSequence);
    }
}
