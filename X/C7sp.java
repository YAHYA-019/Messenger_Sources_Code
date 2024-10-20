package X;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: X.7sp, reason: invalid class name */
/* loaded from: 7sp.class */
public abstract class C7sp {
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0w6, java.lang.Object] */
    public static Uri A00(Uri uri, String str) {
        String queryParameter;
        boolean z = true;
        if (!C0Aj.A06(uri)) {
            try {
                z = !TextUtils.isEmpty(uri.getQueryParameter("u"));
            } catch (Exception unused) {
                z = false;
            }
        }
        if (z && (queryParameter = uri.getQueryParameter("u")) != null) {
            uri = C0A2.A01(new Object(), queryParameter);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused2) {
            }
            uri = uri.buildUpon().appendQueryParameter("r", str).build();
        }
        return uri;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r304.getQueryParameter("u"))) != false) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0w6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(java.lang.String r301, java.lang.String r302) {
        /*
            r0 = r302
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Lb1
            r0 = r301
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Lb1
            r0 = r302
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r304 = r0
            r0 = r304
            boolean r0 = X.C0Aj.A06(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L38
            java.lang.String r0 = "u"
            r305 = r0
            r0 = r304
            r1 = r305
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch: java.lang.Exception -> Lb3
            r305 = r0
            r0 = r305
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lb3
            r1 = 1
            r0 = r0 ^ r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L61
        L38:
            java.lang.String r0 = "u"
            r305 = r0
            r0 = r304
            r1 = r305
            java.lang.String r0 = r0.getQueryParameter(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5b
            X.1AJ r0 = new X.1AJ
            r305 = r0
            r0 = r305
            r0.<init>()
            r0 = r305
            r1 = r306
            android.net.Uri r0 = X.C0A2.A01(r0, r1)
            r304 = r0
        L5b:
            r0 = r304
            if (r0 != 0) goto L61
            r0 = 0
            return r0
        L61:
            r0 = r304
            java.lang.String r0 = r0.getHost()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb1
            java.lang.String r0 = "[,; ]+"
            r305 = r0
            r0 = r301
            r1 = r305
            java.lang.String[] r0 = r0.split(r1)
            r308 = r0
            r0 = r308
            int r0 = r0.length
            r309 = r0
            r0 = 0
            r310 = r0
            r0 = 0
            r304 = r0
        L82:
            r0 = r310
            r1 = r309
            if (r0 >= r1) goto Lb1
            r0 = r308
            r1 = r310
            r0 = r0[r1]
            r306 = r0
            r0 = r306
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto La8
            r0 = r307
            r1 = r306
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La8
            r0 = 1
            return r0
        La8:
            r0 = r310
            r1 = 1
            int r0 = r0 + r1
            r310 = r0
            goto L82
        Lb1:
            r0 = 0
            return r0
        Lb3:
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7sp.A01(java.lang.String, java.lang.String):boolean");
    }
}
