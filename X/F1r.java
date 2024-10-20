package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: F1r.class */
public final class F1r {
    public static boolean A00(Uri uri, FbUserSession fbUserSession) {
        boolean z = false;
        if (uri != null && uri.getPath() != null && (LDu.A04(uri) || (uri.getHost() != null && uri.getHost().equals("business.facebook.com")))) {
            String str = ((1G1) fbUserSession).A02;
            if ((uri.getPath() != null && uri.getPath().equals(0Pz.A0j("/", str, "/settings/message_settings/frequently_asked_questions/"))) || ((uri.getPath() != null && uri.getPath().equals("/page/set/send_message_cta/") && uri.getQueryParameter("page_id") != null && uri.getQueryParameter("page_id").equals(str)) || ((uri.getPath() != null && uri.getPath().equals("/page_promotions/create/") && uri.getQueryParameter("objective") != null && uri.getQueryParameter("objective").equals("boosted_post")) || ((uri.getPath() != null && uri.getPath().equals("/pages/boosted_component_v2/view/") && uri.getQueryParameter("entry_point") != null && uri.getQueryParameter("entry_point").equals("promote_action_button") && uri.getQueryParameter("page_id") != null && uri.getQueryParameter("page_id").equals(str) && uri.getQueryParameter("product") != null && uri.getQueryParameter("product").equals("boosted_cta")) || ((uri.getPath() != null && uri.getPath().equals(0Pz.A0j("/pages/", str, "/manage_promotions/")) && uri.getQueryParameter("ref") != null && uri.getQueryParameter("ref").equals("business_inbox_in_messenger_setting")) || ((uri.getPath() != null && uri.getPath().equals("/business_payments/wizard/")) || ((uri.getPath() != null && uri.getPath().matches("/business\\/help\\/[0-9]*")) || uri.getPath().equals("/legal/product_catalog_terms/") || uri.getPath().equals("/legal/commerce_product_merchant_agreement") || uri.getPath().equals("/mcom_uot/")))))))) {
                z = true;
            }
        }
        return z;
    }
}
