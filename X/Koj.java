package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.messaging.browser.MessengerBrowserLiteCallbackService;

/* loaded from: Koj.class */
public final class Koj {
    public final /* synthetic */ MessengerBrowserLiteCallbackService A00;

    public Koj(MessengerBrowserLiteCallbackService messengerBrowserLiteCallbackService) {
        this.A00 = messengerBrowserLiteCallbackService;
    }

    public final String A00(String str) {
        String A00;
        if (str == null || str.length() == 0) {
            return null;
        }
        Uri A002 = C0A2.A00(this.A00.A0K, str);
        if (A002 == null) {
            A00 = "failed-to-parse";
        } else {
            0JI r0 = LDu.A00;
            if (TextUtils.isEmpty(A002.getHost())) {
                return A002.toString();
            }
            A00 = C07o.A00(0Jj.A00(A002, LDu.A00));
            if (A00 == null) {
                return "failed-to-sanitize";
            }
        }
        return A00;
    }
}
