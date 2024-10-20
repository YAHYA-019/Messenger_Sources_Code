package X;

import android.os.Bundle;

/* loaded from: B2a.class */
public final class B2a extends B2f {
    public static final String __redex_internal_original_name = "AccountLoginFbAccessTokenFromPluginFragment";
    public final DJy A00 = new ChQ(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        Bjf bjf = ((BaM) C1Y6.A00(requireContext(), 1BJ.A00(44), "All", AnonymousClass001.A1Z())).A00;
        int A00 = 1BK.A00();
        1YC r0 = bjf.A00;
        r0.A08("com.facebook.messaging.accountlogin.plugins.interfaces.accesstoken.AccessTokenRetrieverSpec", "messaging.accountlogin.accesstoken.AccessTokenRetrieverSpec", "getFacebookSsoAccessToken", A00);
        r0.A06("messaging.accountlogin.accesstoken.AccessTokenRetrieverSpec", "getFacebookSsoAccessToken", A00);
        0fH.A0j(__redex_internal_original_name, "Access token future is null, retrieval is not supported");
        A1b(BLp.A07);
    }
}
