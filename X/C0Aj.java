package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.0Aj, reason: invalid class name */
/* loaded from: 0Aj.class */
public abstract class C0Aj {
    public static final 1Xo A00;
    public static final ThreadLocal A01;
    public static final Set A02;
    public static final Pattern A03 = Pattern.compile("^(z-.*)?(origincache.*|cdn).fbsbx.com$");

    static {
        HashSet hashSet = new HashSet(6);
        Collections.addAll(hashSet, "__gda__", "oh", "oe", "hdnea", "logcdn", "efg");
        A02 = Collections.unmodifiableSet(hashSet);
        A00 = new 1Xo(100);
        A01 = new ThreadLocal();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri A00(android.net.Uri r301) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Aj.A00(android.net.Uri):android.net.Uri");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0w6, java.lang.Object] */
    public static Uri A01(Uri uri) {
        while (A06(uri)) {
            String queryParameter = uri.getQueryParameter("u");
            if (TextUtils.isEmpty(queryParameter)) {
                break;
            }
            uri = C0A2.A02(new Object(), queryParameter, true);
        }
        return uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r305 >= r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(android.net.Uri r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L7a
            r0 = r301
            boolean r0 = A04(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L30
            r0 = r301
            boolean r0 = A05(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L7a
            r0 = r301
            java.lang.String r0 = r0.getHost()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7a
            java.util.regex.Pattern r0 = X.C0Aj.A03
            r1 = r303
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r304 = r0
            r0 = r304
            boolean r0 = r0.matches()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L7a
        L30:
            java.lang.String r0 = "oe"
            r304 = r0
            r0 = r301
            r1 = r304
            java.lang.String r0 = r0.getQueryParameter(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7a
            r0 = 16
            r302 = r0
            r0 = r303
            r1 = r302
            long r0 = java.lang.Long.parseLong(r0, r1)
            r305 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r307 = r0
            r0 = r305
            r1 = r307
            long r0 = r0 * r1
            r305 = r0
        L53:
            long r0 = java.lang.System.currentTimeMillis()
            r309 = r0
            r0 = -1
            long r0 = (long) r0
            r311 = r0
            r0 = r305
            r1 = r311
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L74
            r0 = r305
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r313 = r0
            r0 = 1
            r302 = r0
            r0 = r313
            if (r0 < 0) goto L78
        L74:
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
        L78:
            r0 = r302
            return r0
        L7a:
            r0 = -1
            long r0 = (long) r0
            r305 = r0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Aj.A02(android.net.Uri):boolean");
    }

    public static boolean A03(Uri uri) {
        String host;
        boolean z = false;
        if (uri != null && (host = uri.getHost()) != null && A05(uri) && ((host.endsWith(".facebook.com") || host.equals("facebook.com") || host.equals("fb.me")) && !host.startsWith("our.intern."))) {
            z = true;
        }
        return z;
    }

    public static boolean A04(Uri uri) {
        String host;
        if (!A05(uri) || (host = uri.getHost()) == null) {
            return false;
        }
        if (!host.endsWith(".fbcdn.net") && !host.endsWith(".cdninstagram.com")) {
            if (!host.endsWith(".akamaihd.net")) {
                return false;
            }
            if (!host.startsWith("fbcdn-") && !host.startsWith("fbstatic-") && !host.startsWith("fbexternal-") && !host.startsWith("fb-")) {
                return false;
            }
        }
        return true;
    }

    public static boolean A05(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r301.getPath().equals("/l.php") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(android.net.Uri r301) {
        /*
            r0 = r301
            boolean r0 = A03(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r301
            java.lang.String r0 = r0.getPath()
            r301 = r0
            java.lang.String r0 = "/l.php"
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L22:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Aj.A06(android.net.Uri):boolean");
    }

    public static boolean A07(Uri uri) {
        boolean z = false;
        if (A05(uri)) {
            String host = uri.getHost();
            if ((host.endsWith(".net") && (!host.contains(".fbcdn.") ? !(!host.endsWith(".akamaihd.net") || (!host.startsWith("fbcdn-") && !host.startsWith("fb-"))) : (!host.contains("sonar.")))) || host.endsWith(".cdninstagram.com")) {
                z = true;
            }
        }
        return z;
    }
}
