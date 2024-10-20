package X;

import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.message.BasicHttpResponse;

/* renamed from: X.42N, reason: invalid class name */
/* loaded from: 42N.class */
public abstract class C42N {
    /* JADX WARN: Removed duplicated region for block: B:6:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.http.HttpEntity A00(X.C42M r301, java.io.InputStream r302) {
        /*
            r0 = r301
            java.util.Map r0 = r0.A01
            r301 = r0
            r0 = r301
            java.lang.String r1 = "Content-Length"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1e
            r0 = r303
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L1d
            r304 = r0
            goto L21
        L1d:
        L1e:
            r0 = -1
            long r0 = (long) r0
            r304 = r0
        L21:
            org.apache.http.entity.InputStreamEntity r0 = new org.apache.http.entity.InputStreamEntity
            r306 = r0
            r0 = r306
            r1 = r302
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r301
            java.lang.String r1 = "Content-Encoding"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L43
            r0 = r306
            r1 = r303
            r0.setContentEncoding(r1)
        L43:
            r0 = r301
            java.lang.String r1 = "Content-Type"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L59
            r0 = r306
            r1 = r303
            r0.setContentType(r1)
        L59:
            r0 = r306
            org.apache.http.HttpEntity r0 = (org.apache.http.HttpEntity) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42N.A00(X.42M, java.io.InputStream):org.apache.http.HttpEntity");
    }

    public static HttpResponse A01(C42M c42m) {
        int i = c42m.A00;
        String str = (String) 42O.A00.get(i);
        if (str == null) {
            str = Integer.toString(i);
        }
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, i, str);
        for (Map.Entry entry : c42m.A01.entrySet()) {
            basicHttpResponse.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        return basicHttpResponse;
    }
}
