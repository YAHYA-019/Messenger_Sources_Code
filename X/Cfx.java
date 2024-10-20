package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.browsertonativesso.BrowserToNativeSSOTokens;

/* loaded from: Cfx.class */
public final class Cfx implements 1Ro {
    public static final String __redex_internal_original_name = "BrowserToNativeSSOTokenFetchMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C04083zw c04083zw = new C04083zw();
        c04083zw.A0D = 1BJ.A00(ActionId.NOTIFY_SUBSCRIBERS);
        c04083zw.A0J = AnonymousClass001.A0s();
        c04083zw.A0E = "GET";
        c04083zw.A0F = "browser_to_native_sso_token_fetch?fields=t1,t2";
        c04083zw.A06 = 0S2.A0C;
        c04083zw.A02();
        return c04083zw.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return anonymousClass439.A00().A1W(BrowserToNativeSSOTokens.class);
    }
}
