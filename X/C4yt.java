package X;

import android.net.Uri;
import com.facebook.auth.viewercontext.ViewerContext;

/* renamed from: X.4yt, reason: invalid class name */
/* loaded from: 4yt.class */
public final class C4yt {
    public static final Uri A01 = C0A2.A03("https://web.facebook.com");
    public final C00i A00 = new 1BQ(33032);

    public static void A00(Uri.Builder builder, String str) {
        if (1JF.A0B(str)) {
            ViewerContext viewerContext = (ViewerContext) 1Bn.A0A(83431);
            if (viewerContext == null) {
                return;
            } else {
                str = viewerContext.mAuthToken;
            }
        }
        builder.appendQueryParameter("access_token", str);
    }

    public Uri.Builder A01(String str) {
        Uri.Builder AoA = ((InterfaceC00281am) 1Bn.A0A(83594)).AoA();
        AoA.appendEncodedPath("messaging_get_attachment");
        AoA.appendQueryParameter("method", "POST");
        AoA.appendQueryParameter("redirect", "true");
        A00(AoA, str);
        return AoA;
    }
}
