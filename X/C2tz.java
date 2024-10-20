package X;

import org.apache.http.Header;
import org.apache.http.HttpResponse;

/* renamed from: X.2tz, reason: invalid class name */
/* loaded from: 2tz.class */
public final class C2tz {
    public static long A00(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Content-Length");
        if (firstHeader != null) {
            try {
                return Long.parseLong(firstHeader.getValue());
            } catch (NumberFormatException e) {
                0fH.A0H(C2tz.class, "Failure parsing Content-Length header", e);
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r302 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A01(org.apache.http.HttpResponse r301) {
        /*
            r0 = r301
            org.apache.http.HttpEntity r0 = r0.getEntity()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3e
            r0 = r302
            org.apache.http.Header r0 = r0.getContentType()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3e
            r0 = r302
            org.apache.http.Header r0 = r0.getContentType()
            r303 = r0
            r0 = r303
            java.lang.String r0 = r0.getValue()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L3c
        L28:
            r0 = r301
            java.lang.String r1 = "Content-Type"
            org.apache.http.Header r0 = r0.getFirstHeader(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3c
            r0 = r303
            java.lang.String r0 = r0.getValue()
            r302 = r0
        L3c:
            r0 = r302
            return r0
        L3e:
            r0 = 0
            r302 = r0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2tz.A01(org.apache.http.HttpResponse):java.lang.String");
    }
}
