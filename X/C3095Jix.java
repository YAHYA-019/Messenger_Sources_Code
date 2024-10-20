package X;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Jix, reason: case insensitive filesystem */
/* loaded from: Jix.class */
public final class C3095Jix extends LRg {
    public final Pattern A00;

    public C3095Jix() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.A00 = Pattern.compile("\\A\\d+");
    }

    public final boolean A00() {
        return AbJ.A1U(Build.VERSION.SDK_INT, 33);
    }

    public boolean A01() {
        boolean A01 = super.A01();
        if (A01 && Build.VERSION.SDK_INT < 29) {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            A01 = false;
            if (currentWebViewPackage != null) {
                Matcher matcher = this.A00.matcher(currentWebViewPackage.versionName);
                if (matcher.find() && JR0.A0P(currentWebViewPackage.versionName, matcher.start(), matcher.end()) >= 105) {
                    A01 = true;
                }
            }
        }
        return A01;
    }
}
