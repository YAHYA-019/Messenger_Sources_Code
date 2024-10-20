package X;

import android.content.Intent;
import com.facebook.inject.FbInjector;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.41V, reason: invalid class name */
/* loaded from: 41V.class */
public final class C41V extends 41K {
    public 1BY A00;

    public void CbQ(HttpResponse httpResponse, HttpContext httpContext) {
        super.CbQ(httpResponse, httpContext);
        if (httpResponse == null || !httpResponse.containsHeader("X-FB-Trigger-Flow")) {
            return;
        }
        1BY r0 = this.A00;
        Esl esl = (Esl) 1Lo.A09(1Fw.A06(1Bn.A0G(r0, 16428)), r0, 99668);
        String value = httpResponse.getFirstHeader("X-FB-Trigger-Flow").getValue();
        String value2 = httpResponse.containsHeader("X-FB-Trigger-Flow-User") ? httpResponse.getFirstHeader("X-FB-Trigger-Flow-User").getValue() : null;
        if (!esl.A00) {
            C00i c00i = esl.A01;
            if (((1Ex) c00i.get()).BTw() && (value2 == null || (C3o5.A0I(c00i) != null && C3o5.A0I(c00i).A0i != null && C3o5.A0I(c00i).A0i.getId() != null && C3o5.A0I(c00i).A0i.getId().equalsIgnoreCase(value2)))) {
                1I7 r02 = (1I7) 1Hv.A02(FbInjector.A00(), 65728);
                esl.A00(true, 0S2.A00);
                r02.CkS(new Intent().setAction("com.facebook.businessintegrity.gdpr.triggers.USER_IN_CONSENTS_FLOW").putExtra("com.facebook.businessintegrity.gdpr.triggers.URL", value));
                return;
            }
        }
        if (esl.A00) {
            ((Er9) 1Bn.A0A(99967)).A00(value);
        }
    }
}
