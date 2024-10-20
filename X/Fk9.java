package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.browser.model.MessengerInAppBrowserLaunchParam;
import java.util.HashSet;

/* loaded from: Fk9.class */
public final /* synthetic */ class Fk9 implements GFB {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ FIu A04;
    public final /* synthetic */ MessengerInAppBrowserLaunchParam A05;

    public /* synthetic */ Fk9(Context context, Intent intent, Uri uri, FbUserSession fbUserSession, FIu fIu, MessengerInAppBrowserLaunchParam messengerInAppBrowserLaunchParam) {
        this.A04 = fIu;
        this.A01 = intent;
        this.A03 = fbUserSession;
        this.A05 = messengerInAppBrowserLaunchParam;
        this.A02 = uri;
        this.A00 = context;
    }

    public final void CHf(HashSet hashSet) {
        FIu fIu = this.A04;
        Intent intent = this.A01;
        FbUserSession fbUserSession = this.A03;
        MessengerInAppBrowserLaunchParam messengerInAppBrowserLaunchParam = this.A05;
        Uri uri = this.A02;
        Context context = this.A00;
        intent.putExtra("BrowserLiteIntent.EXTRA_BLACK_HOLE_LIST", hashSet);
        FIu.A04(fbUserSession, fIu, messengerInAppBrowserLaunchParam, uri.toString());
        FIu.A02((Activity) null, context, intent, (Fragment) null, fIu, messengerInAppBrowserLaunchParam, (Integer) null);
    }
}
