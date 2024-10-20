package X;

import androidx.webkit.WebViewCompat;

/* renamed from: X.Jip, reason: case insensitive filesystem */
/* loaded from: Jip.class */
public final class C3087Jip extends C3090Jis {
    public C3087Jip() {
        super("MULTI_PROFILE", "MULTI_PROFILE");
    }

    public boolean A01() {
        boolean z = false;
        if (super.A01() && Kz5.A00("MULTI_PROCESS")) {
            if (!Kz5.A0R.A01()) {
                throw AnonymousClass001.A0q("This method is not supported by the current version of the framework and the current WebView APK");
            }
            z = WebViewCompat.A01().BCG().isMultiProcessEnabled();
        }
        return z;
    }
}
