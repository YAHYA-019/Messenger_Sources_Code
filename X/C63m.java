package X;

import android.net.Uri;
import com.facebook.common.util.JSONUtil;
import com.facebook.http.interfaces.RequestPriority;
import java.util.ArrayList;

/* renamed from: X.63m, reason: invalid class name */
/* loaded from: 63m.class */
public final class C63m implements 1Ro {
    public static final String __redex_internal_original_name = "FetchPlatformAppLogoUrlMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        RequestPriority requestPriority = RequestPriority.INTERACTIVE;
        ArrayList A0s = AnonymousClass001.A0s();
        return new C04103zy(requestPriority, 0S2.A01, "platform app", "GET", (String) obj, A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        Uri uri = null;
        String A0H = JSONUtil.A0H(anonymousClass439.A01().A0D("logo_url"), null);
        if (A0H != null) {
            try {
                uri = C0A2.A03(A0H);
            } catch (SecurityException unused) {
            }
        }
        return uri;
    }
}
