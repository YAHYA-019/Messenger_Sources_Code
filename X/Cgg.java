package X;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgg.class */
public final class Cgg implements 1Ro {
    public static final String __redex_internal_original_name = "GetDblNonceMethod";
    public final C0es A00;
    public final C15h A01;

    public Cgg() {
        C0es c0es = (C0es) 1Bn.A0B(83607);
        DBe A00 = DBe.A00(this, 6);
        this.A00 = c0es;
        this.A01 = A00;
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("new_app_id", this.A00.AXB()));
        A0s.add(new BasicNameValuePair("machine_id", ((BbY) obj).A00));
        A0s.add(new BasicNameValuePair("pin", ""));
        A0s.add(new BasicNameValuePair("nonce_to_keep", ""));
        return new C04103zy(0S2.A01, "new_dbl_set_nonce", "POST", StringFormatUtil.formatStrLocaleSafe("/%s/dblsetnonce", ((ViewerContext) this.A01.get()).mUserId), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return AbK.A18(AbH.A0w(anonymousClass439), "nonce");
    }
}
