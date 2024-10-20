package X;

import com.facebook.http.interfaces.RequestPriority;
import com.facebook.structuredsurvey.api.PostSurveyImpressionsParams;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fh9.class */
public final class Fh9 implements 1Ro {
    public static final String __redex_internal_original_name = "PostSurveyImpressionsMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        PostSurveyImpressionsParams postSurveyImpressionsParams = (PostSurveyImpressionsParams) obj;
        ImmutableMap immutableMap = postSurveyImpressionsParams.A00;
        2DM A0f = 4YU.A0f();
        Iterator A14 = AbM.A14(immutableMap);
        while (A14.hasNext()) {
            AbL.A16(A0f, A14);
        }
        String obj2 = A0f.toString();
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("session_blob", postSurveyImpressionsParams.A04));
        A0s.add(new BasicNameValuePair("impression_event", postSurveyImpressionsParams.A01));
        A0s.add(new BasicNameValuePair("survey_rendering_engine", postSurveyImpressionsParams.A03));
        A0s.add(new BasicNameValuePair("ux_phase", postSurveyImpressionsParams.A02));
        A0s.add(new BasicNameValuePair("ux_mode", postSurveyImpressionsParams.A06));
        A0s.add(new BasicNameValuePair("device_time", String.valueOf(System.currentTimeMillis())));
        A0s.add(new BasicNameValuePair("context", obj2));
        return new C04103zy(RequestPriority.CAN_WAIT, 0S2.A01, "postResponse", "POST", 0Pz.A0W(postSurveyImpressionsParams.A05, "/impressions"), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
