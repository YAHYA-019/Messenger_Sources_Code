package X;

import com.facebook.api.negativefeedback.NegativeFeedbackActionMethod$Params;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgm.class */
public final class Fgm implements 1Ro {
    public static final String __redex_internal_original_name = "NegativeFeedbackActionMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        NegativeFeedbackActionMethod$Params negativeFeedbackActionMethod$Params = (NegativeFeedbackActionMethod$Params) obj;
        ArrayList A0z = 7zO.A0z(negativeFeedbackActionMethod$Params, 0);
        A0z.add(new BasicNameValuePair("action_node_token", negativeFeedbackActionMethod$Params.A00));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("format", "json"), A0z);
        AbF.A1Q(A0C, "negativeFeedbackActions");
        A0C.A0F = 1BJ.A00(50);
        A0C.A02();
        return DKE.A0W(A0C, A0z);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        11T.A0F(anonymousClass439, 1);
        anonymousClass439.A03();
        return null;
    }
}
