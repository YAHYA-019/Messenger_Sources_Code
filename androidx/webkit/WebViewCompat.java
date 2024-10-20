package androidx.webkit;

import X.AnonymousClass001;
import X.Ka2;
import X.KrA;
import X.Kz5;
import X.MEd;
import X.MJS;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: WebViewCompat.class */
public final class WebViewCompat {
    public static final Uri A01 = Uri.parse("*");
    public static final Uri A00 = Uri.parse("");

    public static KrA A00(WebView webView) {
        return new KrA(A03(webView));
    }

    public static MJS A01() {
        return A02();
    }

    public static MJS A02() {
        return Ka2.A00;
    }

    public static WebViewProviderBoundaryInterface A03(WebView webView) {
        return A01().ALM(webView);
    }

    public static void A04(WebView webView) {
        if (!Kz5.A0a.A01()) {
            throw AnonymousClass001.A0q("This method is not supported by the current version of the framework and the current WebView APK");
        }
        A00(webView).A00();
    }

    public static void A05(WebView webView, MEd mEd, String str, Set set) {
        if (!Kz5.A0a.A01()) {
            throw AnonymousClass001.A0q("This method is not supported by the current version of the framework and the current WebView APK");
        }
        A00(webView).A01(mEd, str, (String[]) set.toArray(new String[0]));
    }

    public static PackageInfo getCurrentWebViewPackage(Context context) {
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            currentWebViewPackage = null;
            try {
                String str = (String) AnonymousClass001.A0S(null, Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]));
                if (str != null) {
                    currentWebViewPackage = context.getPackageManager().getPackageInfo(str, 0);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return currentWebViewPackage;
    }
}
