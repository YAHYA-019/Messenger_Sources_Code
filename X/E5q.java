package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.xapp.messaging.browser.model.MessengerInAppBrowserLaunchParam;
import com.facebook.xapp.messaging.browser.model.MessengerWebViewParams;

/* loaded from: E5q.class */
public final class E5q extends DOC {
    public final 1Br A00;
    public final Context A01;
    public final Uri A02;
    public final 1De A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E5q(Context context, Uri uri, 1De r304, GFa gFa, int i) {
        super(gFa, i, false);
        7zR.A1O(context, uri);
        this.A03 = r304;
        this.A01 = context;
        this.A00 = 1Bu.A01(context, 100011);
        this.A02 = uri;
    }

    public void onClick(View view) {
        11T.A0F(view, 0);
        super.onClick(view);
        ((FIu) 1Br.A0B(this.A00)).A0A(view.getContext(), this.A02, new MessengerInAppBrowserLaunchParam(null, null, C5id.A10, new MessengerWebViewParams(null, null, 1.0d, false, false, false, true, false, false, true), null, null, null, null, null, null, null, false, false, false));
    }
}
