package X;

import com.facebook.messaging.business.inboxads.common.InboxAdsMediaInfo;
import com.facebook.messaging.business.montageads.models.SingleMontageAd;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: F6z.class */
public final class F6z {
    public static C03353xs A00(String str) {
        String str2;
        try {
            JSONObject A12 = AnonymousClass001.A12();
            A12.put("ei", str);
            str2 = A12.toString();
        } catch (JSONException unused) {
            str2 = null;
        }
        C03353xs A0k = DKC.A0k(C26T.A00);
        A0k.A0e(str2);
        return A0k;
    }

    public C03353xs A01(Object obj) {
        String str;
        if (obj instanceof SingleMontageAd) {
            str = ((SingleMontageAd) obj).A08;
        } else {
            if (!(obj instanceof InboxAdsMediaInfo)) {
                return null;
            }
            str = ((InboxAdsMediaInfo) obj).A0C;
        }
        return A00(str);
    }
}
