package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABReportStartEvent;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.Jmq, reason: case insensitive filesystem */
/* loaded from: Jmq.class */
public final class C3213Jmq extends L3E {
    public C3213Jmq() {
        super("ACTION_REPORT");
    }

    @Override // X.L3E
    public void A01(Context context, Bundle bundle, JgX jgX, JgX jgX2) {
        IABEvent iABReportStartEvent;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("action", "ACTION_REPORT");
        A0u.put("current_url", jgX.A0j);
        Uri uri = jgX.A08;
        if (uri != null) {
            A0u.put("url", uri.toString());
        }
        L11 l11 = jgX2.A0c;
        if (jgX.A0j != null && l11 != null) {
            LDF A00 = LDF.A00();
            String str = jgX.A0j;
            if (l11.A0g) {
                long A002 = L11.A00(l11);
                iABReportStartEvent = new IABReportStartEvent(l11.A0P, l11.A0U, l11.A0S, str, A002, A002);
            } else {
                iABReportStartEvent = IABEvent.A04;
            }
            A00.A08(bundle, iABReportStartEvent, jgX2.A0d);
        }
        Intent A0T = jgX2.A0T();
        boolean z = false;
        if (A0T != null && A0T.getBooleanExtra("BrowserLiteIntent.EXTRA_REPORT_SHOULD_INCLUDE_CLOAKING_DATA", false)) {
            z = true;
        }
        AbstractC3252Jnp A0U = jgX.A0U();
        if (!z || A0U == null) {
            LDF.A00().A0B(bundle, A0u);
            return;
        }
        File A07 = A0U.A07(SystemWebView.A00(A0U).getFilesDir(), "iab_screenshot.jpg", 1.0f);
        if (A07 != null) {
            A0u.put("screenshot_uri", A07.getAbsolutePath());
        }
        A0U.A0H(new Rld(bundle, this, A0u));
    }
}
