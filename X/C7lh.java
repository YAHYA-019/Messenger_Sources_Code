package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.model.messages.Message;

/* renamed from: X.7lh, reason: invalid class name */
/* loaded from: 7lh.class */
public abstract class C7lh {
    public static final void A00(Context context, Message message, String str, String str2) {
        Uri.Builder buildUpon = C0A2.A03("fb-messenger://payments/checkout/").buildUpon();
        buildUpon.appendQueryParameter("product_type", "pages_commerce");
        buildUpon.appendQueryParameter("product_id", str);
        buildUpon.appendQueryParameter("seller_id", str2);
        ((C68t) 1Bi.A03(49965)).A0F(context, buildUpon.build(), message, C5id.A10);
    }
}
