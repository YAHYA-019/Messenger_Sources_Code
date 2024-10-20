package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.mapbox.mapboxsdk.BuildConfig;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.1aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1aj.class */
public final class C00251aj {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final Set A05;

    public C00251aj(1BO r302) {
        1BV r0 = new 1BV((1BY) null, 83719);
        this.A01 = r0;
        this.A03 = new 1BQ(66191);
        this.A04 = new 1HH((Context) r0.get(), 100178);
        this.A02 = new 1BQ(99933);
        this.A05 = (Set) 1Bn.A0E((Context) null, (1BY) null, 273);
        this.A00 = new 1BY(r302);
    }

    public static String A00(String str) {
        return 1JF.A0B(str) ? "null" : 1JF.A06(str).replace("/", "-").replace(";", "-");
    }

    public String A01() {
        String property = System.getProperty("http.agent");
        Object obj = this.A02.get();
        C00i c00i = this.A03;
        c00i.get();
        String A00 = A00(BuildConfig.VERSION_NAME);
        C00i c00i2 = this.A01;
        String packageName = ((Context) c00i2.get()).getPackageName();
        String A002 = A00(Locale.getDefault().toString());
        c00i.get();
        Integer valueOf = Integer.valueOf(BuildConstants.A01());
        String A003 = A00(((TelephonyManager) this.A04.get()).getNetworkOperatorName());
        String A004 = A00(Build.MANUFACTURER);
        String A005 = A00(Build.BRAND);
        String A006 = A00(Build.MODEL);
        String A007 = A00(Build.VERSION.RELEASE);
        String A008 = A00(Build.CPU_ABI);
        String A009 = A00(Build.CPU_ABI2);
        DisplayMetrics displayMetrics = ((Context) c00i2.get()).getResources().getDisplayMetrics();
        Point point = new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        WindowManager windowManager = (WindowManager) ((Context) c00i2.get()).getSystemService("window");
        if (windowManager != null && windowManager.getDefaultDisplay() != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{density=");
        sb.append(displayMetrics.density);
        sb.append(",width=");
        sb.append(point.x);
        sb.append(",height=");
        sb.append(point.y);
        sb.append("}");
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s:%s;%s/%s;FB_FW/1;", "FBAN", obj, "FBAV", A00, "FBPN", packageName, "FBLC", A002, "FBBV", valueOf, "FBCR", A003, "FBMF", A004, "FBBD", A005, "FBDV", A006, "FBSV", A007, "FBCA", A008, A009, "FBDM", A00(sb.toString()));
        Iterator it = this.A05.iterator();
        if (!it.hasNext()) {
            return 0Pz.A0v(property, " [", formatStrLocaleSafe, "]");
        }
        it.next();
        throw AnonymousClass001.A0Q("getName");
    }
}
