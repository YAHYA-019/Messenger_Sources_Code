package X;

import com.facebook.api.reportableentity.NegativeFeedbackActionOnReportableEntityMethod$Params;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgn.class */
public final class Fgn implements 1Ro {
    public static final String __redex_internal_original_name = "NegativeFeedbackActionOnReportableEntityMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        NegativeFeedbackActionOnReportableEntityMethod$Params negativeFeedbackActionOnReportableEntityMethod$Params = (NegativeFeedbackActionOnReportableEntityMethod$Params) obj;
        if (negativeFeedbackActionOnReportableEntityMethod$Params == null) {
            throw AnonymousClass001.A0N("params should not be null");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("reportable_ent_token", negativeFeedbackActionOnReportableEntityMethod$Params.A02));
        A0s.add(new BasicNameValuePair("story_location", negativeFeedbackActionOnReportableEntityMethod$Params.A01));
        A0s.add(new BasicNameValuePair("action", negativeFeedbackActionOnReportableEntityMethod$Params.A00.name()));
        A0s.add(new BasicNameValuePair("undo", String.valueOf(negativeFeedbackActionOnReportableEntityMethod$Params.A03)));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("format", "json"), A0s);
        AbF.A1Q(A0C, "negativeFeedbackActionOnReportableEntity");
        return AbK.A0M(A0C, "reportable_ent_nfx_actions", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        11T.A0F(anonymousClass439, 1);
        anonymousClass439.A03();
        return null;
    }
}
