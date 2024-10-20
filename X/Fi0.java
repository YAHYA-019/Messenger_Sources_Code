package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.auth.pin.params.CreateFingerprintNonceParams;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fi0.class */
public final class Fi0 implements 1Ro {
    public static final String __redex_internal_original_name = "CreateFingerprintNonceMethod";
    public 1BY A00;
    public F80 A01;
    public final Context A02;
    public final 1H2 A03;
    public final FI2 A04;

    public Fi0(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        1H2 A0R = DKE.A0R();
        F80 f80 = (F80) 1Bn.A0B(99396);
        FI2 fi2 = (FI2) 1Bn.A0B(99119);
        Context A0J = 7zP.A0J();
        this.A03 = A0R;
        this.A01 = f80;
        this.A04 = fi2;
        this.A02 = A0J;
    }

    public static final Fi0 A00(1BO r301) {
        return new Fi0(r301);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("pin", ((CreateFingerprintNonceParams) obj).A00));
        A0s.add(new BasicNameValuePair("device_id", this.A03.A02()));
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s/%s", 1Fw.A05(this.A00).A02, "p2p_gen_touch_id_nonces");
        C04083zw A0T = DKC.A0T();
        A0T.A0F = formatStrLocaleSafe;
        AbF.A1Q(A0T, "create_fingerprint_nonce_method");
        return DKE.A0W(A0T, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0D = AbH.A0w(anonymousClass439).A0D("nonce");
        Preconditions.checkNotNull(A0D, "Expected response in the form of {\"nonce\": \"token\"} but was %s", anonymousClass439.A01());
        return A0D.A0H();
    }
}
