package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.payments.checkout.configuration.model.PaymentParticipant;

/* loaded from: FlP.class */
public final class FlP implements GKs {
    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        String A0H = JSONUtil.A0H(r302.A0D("title"), null);
        A0H.getClass();
        return new PaymentParticipant(A0H, C3o5.A0P(r302, "subtitle", null), C3o5.A0P(r302, "image_url", null));
    }
}
