package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: K6l.class */
public final class K6l extends K6n {
    public static final byte[] A02 = "\n".getBytes();
    public final L22 A00;
    public final String A01;

    public K6l(L9t l9t) {
        super(l9t);
        this.A01 = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", Kc9.A00, Build.VERSION.RELEASE, L6G.A01(Locale.getDefault()), Build.MODEL, Build.ID);
        this.A00 = new L22(l9t.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.net.HttpURLConnection, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A00(X.K6l r301, java.net.URL r302, byte[] r303) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6l.A00(X.K6l, java.net.URL, byte[]):int");
    }

    public static final String A01(L2Y l2y, K6l k6l, boolean z) {
        AbstractC00481b7.A02(l2y);
        StringBuilder A0k = AnonymousClass001.A0k();
        try {
            java.util.Map map = l2y.A04;
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                String A0j = AnonymousClass001.A0j(A0z);
                if (!"ht".equals(A0j) && !"qt".equals(A0j) && !"AppUID".equals(A0j) && !"z".equals(A0j) && !"_gmsv".equals(A0j)) {
                    A04(A0j, 1BK.A16(A0z), A0k);
                }
            }
            long j = l2y.A02;
            A04("ht", String.valueOf(j), A0k);
            A04("qt", String.valueOf(System.currentTimeMillis() - j), A0k);
            if (z) {
                String str = ConstantsKt.CAMERA_ID_FRONT;
                AbstractC00481b7.A04("_s");
                AbstractC00481b7.A08(!"_s".startsWith("&"), "Short param name required");
                String A0b = AnonymousClass001.A0b("_s", map);
                if (A0b != null) {
                    str = A0b;
                }
                long j2 = 0;
                try {
                    j2 = Long.parseLong(str);
                } catch (NumberFormatException unused) {
                }
                A04("z", j2 != 0 ? String.valueOf(j2) : String.valueOf(l2y.A01), A0k);
            }
            return A0k.toString();
        } catch (UnsupportedEncodingException e) {
            k6l.A0G("Failed to encode name or value", e);
            return null;
        }
    }

    public static final HttpURLConnection A02(K6l k6l, URL url) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw AnonymousClass001.A0G("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(AnonymousClass001.A03(Kz3.A02.A00));
        httpURLConnection.setReadTimeout(AnonymousClass001.A03(Kz3.A03.A00));
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty(HttpRequestMultipart.USER_AGENT, k6l.A01);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r307 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r301.A0G("Error closing http connection input stream", r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(X.K6l r301, java.net.HttpURLConnection r302) {
        /*
            java.lang.String r0 = "Error closing http connection input stream"
            r303 = r0
            r0 = -1939423162(0xffffffff8c66c046, float:-1.7776416E-31)
            r304 = r0
            r0 = r302
            r1 = r304
            X.0Rh r0 = X.0J3.A00(r0, r1)     // Catch: java.lang.Throwable -> L4d
            r305 = r0
            r0 = 1024(0x400, float:1.435E-42)
            r304 = r0
            r0 = r304
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L37
            r306 = r0
        L18:
            r0 = r305
            r1 = r306
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L37
            r304 = r0
            r0 = r304
            if (r0 > 0) goto L18
            r0 = r305
            r0.close()     // Catch: java.io.IOException -> L2c
            goto L36
        L2c:
            r307 = move-exception
            r0 = r301
            r1 = r303
            r2 = r307
            r0.A0G(r1, r2)
            return
        L36:
            return
        L37:
            r306 = move-exception
            r0 = r305
            r0.close()     // Catch: java.io.IOException -> L41
            r0 = r306
            throw r0
        L41:
            r307 = move-exception
            r0 = r301
            r1 = r303
            r2 = r307
            r0.A0G(r1, r2)
            r0 = r306
            throw r0
        L4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6l.A03(X.K6l, java.net.HttpURLConnection):void");
    }

    public static void A04(String str, String str2, StringBuilder sb) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    public final boolean A0J() {
        L0g.A00();
        A0I();
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((LCw) this).A00.A00.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        } catch (SecurityException unused) {
        }
        LCw.A0A(this, "No network connectivity", 2);
        return false;
    }
}
