package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;

/* loaded from: Fru.class */
public final class Fru implements 16Y {
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ DPK A01;

    public Fru(WebView webView, DPK dpk) {
        this.A01 = dpk;
        this.A00 = webView;
    }

    public boolean BXk(Context context, Uri uri) {
        RGz rGz = this.A01.A02.A02;
        if (rGz == null) {
            return false;
        }
        String obj = uri.toString();
        Q4j q4j = rGz.A00;
        if (Q4j.A06(q4j, q4j.A06.A05, obj)) {
            q4j.A0B.A09(q4j.A03, obj, "redirect_url");
            Q4j.A03(q4j, "payflows_success");
            GJc gJc = q4j.A04;
            if (gJc == null) {
                return true;
            }
            gJc.onSuccess(obj);
            return true;
        }
        if (!Q4j.A06(q4j, q4j.A06.A01, obj)) {
            return false;
        }
        q4j.A0B.A09(q4j.A03, obj, "redirect_url");
        Q4j.A03(q4j, "payflows_fail");
        GJc gJc2 = q4j.A04;
        if (gJc2 == null) {
            return true;
        }
        gJc2.BxV();
        return true;
    }
}
