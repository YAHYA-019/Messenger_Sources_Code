package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhy.class */
public final class Fhy implements 1Ro {
    public static final String __redex_internal_original_name = "DisableFingerprintNonceMethod";
    public 1BY A00;
    public final 1H2 A01 = DKE.A0R();

    public Fhy(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static final Fhy A00(1BO r301) {
        return new Fhy(r301);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        List singletonList = Collections.singletonList(new BasicNameValuePair("device_id", this.A01.A02()));
        String str = 1Fw.A05(this.A00).A02;
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "disable_fingerprint_nonce_method");
        return AbK.A0M(A0T, StringFormatUtil.formatStrLocaleSafe("%s/%s", str, "p2p_disable_touch_id_nonces"), singletonList);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0w = AbH.A0w(anonymousClass439);
        24X A0D = A0w.A0D(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
        Preconditions.checkNotNull(A0D, "Expected response in the form of {\"success\": true} but was %s", A0w);
        return Boolean.valueOf(A0D.A0O());
    }
}
