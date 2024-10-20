package X;

import com.facebook.http.interfaces.RequestPriority;
import com.facebook.structuredsurvey.api.PostSurveyAnswersParams;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fh8.class */
public final class Fh8 implements 1Ro {
    public static final String __redex_internal_original_name = "PostSurveyAnswersMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        PostSurveyAnswersParams postSurveyAnswersParams = (PostSurveyAnswersParams) obj;
        ImmutableMap immutableMap = postSurveyAnswersParams.A02;
        C26T c26t = C26T.A00;
        2DM A0g = 4YU.A0g(c26t);
        Iterator A14 = AbM.A14(immutableMap);
        while (A14.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A14);
            String A0j = AnonymousClass001.A0j(A0z);
            AbstractCollection abstractCollection = (AbstractCollection) A0z.getValue();
            C03353xs A0k = DKC.A0k(c26t);
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                A0k.A0e(AnonymousClass001.A0i(it));
            }
            A0g.A0e(A0k, A0j);
        }
        String obj2 = A0g.toString();
        ImmutableList immutableList = postSurveyAnswersParams.A01;
        C03353xs A0k2 = DKC.A0k(c26t);
        Iterator it2 = immutableList.iterator();
        while (it2.hasNext()) {
            AbstractCollection abstractCollection2 = (AbstractCollection) it2.next();
            C03353xs A0k3 = DKC.A0k(c26t);
            Iterator it3 = abstractCollection2.iterator();
            while (it3.hasNext()) {
                A0k3.A0e(AnonymousClass001.A0i(it3));
            }
            A0k2.A0d(A0k3);
        }
        String obj3 = A0k2.toString();
        ImmutableList immutableList2 = postSurveyAnswersParams.A00;
        C03353xs A0k4 = DKC.A0k(c26t);
        Iterator it4 = immutableList2.iterator();
        while (it4.hasNext()) {
            A0k4.A0e(it4.next().toString());
        }
        String obj4 = A0k4.toString();
        ImmutableMap immutableMap2 = postSurveyAnswersParams.A03;
        2DM A0g2 = 4YU.A0g(c26t);
        Iterator A142 = AbM.A14(immutableMap2);
        while (A142.hasNext()) {
            AbL.A16(A0g2, A142);
        }
        String obj5 = A0g2.toString();
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("answers", obj2));
        A0s.add(new BasicNameValuePair("pages", obj3));
        A0s.add(new BasicNameValuePair("session_blob", postSurveyAnswersParams.A04));
        A0s.add(new BasicNameValuePair("page_numbers", obj4));
        A0s.add(new BasicNameValuePair("context", obj5));
        A0s.add(new BasicNameValuePair("disable_event_logging", Boolean.toString(postSurveyAnswersParams.A06)));
        return new C04103zy(RequestPriority.CAN_WAIT, 0S2.A01, "postResponse", "POST", 0Pz.A0W(postSurveyAnswersParams.A05, "/responses"), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
