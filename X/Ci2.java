package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.business.share.model.MessengerPlatformExtensibleShareContentFields;
import com.google.common.base.Platform;

/* loaded from: Ci2.class */
public final class Ci2 implements MIS {
    public 1BY A00;
    public final Context A01 = 7zP.A0J();
    public final C07 A02 = (C07) 1Bn.A0B(84036);

    public Ci2(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public String Awg() {
        return JQw.A00(60);
    }

    public void BMD(Context context, Bundle bundle, java.util.Map map) {
        Object obj = map.get("url");
        obj.getClass();
        String str = (String) obj;
        String string = bundle != null ? bundle.getString("BrowserLiteIntent.MessengerExtras.EXTRA_PAGE_ID") : null;
        Intent A0A = 4YU.A0A("com.facebook.orca.notify.SECURE_VIEW");
        AbH.A1H(A0A, "fb-messenger-sametask://share");
        if (Platform.stringIsNullOrEmpty(string)) {
            A0A.putExtra("share_link_url", str);
        } else {
            CFn cFn = new CFn();
            cFn.A09 = str;
            cFn.A0E = string;
            cFn.A01 = 0S2.A0C;
            MessengerPlatformExtensibleShareContentFields messengerPlatformExtensibleShareContentFields = new MessengerPlatformExtensibleShareContentFields(cFn);
            A0A.putExtra("ShareType", "ShareType.platformLinkShare");
            A0A.putExtra("share_platform_extensible", messengerPlatformExtensibleShareContentFields);
            this.A02.A00(messengerPlatformExtensibleShareContentFields);
        }
        A0A.putExtra(AbstractC00603o4.A00(20), "browser_share_menu");
        A0A.addFlags(268435456);
        0LS.A0A(this.A01, A0A);
    }
}
