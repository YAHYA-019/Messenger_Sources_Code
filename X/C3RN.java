package X;

/* renamed from: X.3RN, reason: invalid class name */
/* loaded from: 3RN.class */
public abstract class C3RN {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r0.getStatusCode() >= 500) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(java.lang.Throwable r301) {
        /*
        L0:
            r0 = r301
            if (r0 == 0) goto L34
            r0 = r301
            boolean r0 = r0 instanceof org.apache.http.client.HttpResponseException
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r301
            org.apache.http.client.HttpResponseException r0 = (org.apache.http.client.HttpResponseException) r0
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L34
            r0 = r301
            int r0 = r0.getStatusCode()
            r303 = r0
            r0 = 400(0x190, float:5.6E-43)
            r302 = r0
            r0 = r303
            r1 = r302
            if (r0 < r1) goto L34
            r0 = r301
            int r0 = r0.getStatusCode()
            r304 = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            r1 = r303
            if (r0 < r1) goto L36
        L34:
            r0 = 0
            r302 = r0
        L36:
            r0 = r302
            return r0
        L38:
            r0 = r301
            java.lang.Throwable r0 = r0.getCause()
            r301 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RN.A00(java.lang.Throwable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r0.getStatusCode() >= 600) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(java.lang.Throwable r301) {
        /*
        L0:
            r0 = r301
            if (r0 == 0) goto L34
            r0 = r301
            boolean r0 = r0 instanceof org.apache.http.client.HttpResponseException
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r301
            org.apache.http.client.HttpResponseException r0 = (org.apache.http.client.HttpResponseException) r0
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L34
            r0 = r301
            int r0 = r0.getStatusCode()
            r303 = r0
            r0 = 500(0x1f4, float:7.0E-43)
            r302 = r0
            r0 = r303
            r1 = r302
            if (r0 < r1) goto L34
            r0 = r301
            int r0 = r0.getStatusCode()
            r304 = r0
            r0 = 600(0x258, float:8.41E-43)
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            r1 = r303
            if (r0 < r1) goto L36
        L34:
            r0 = 0
            r302 = r0
        L36:
            r0 = r302
            return r0
        L38:
            r0 = r301
            java.lang.Throwable r0 = r0.getCause()
            r301 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RN.A01(java.lang.Throwable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r0.getStatusCode() != 401) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(java.lang.Throwable r301) {
        /*
        L0:
            r0 = r301
            if (r0 == 0) goto L26
            r0 = r301
            boolean r0 = r0 instanceof org.apache.http.client.HttpResponseException
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2a
            r0 = r301
            org.apache.http.client.HttpResponseException r0 = (org.apache.http.client.HttpResponseException) r0
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L26
            r0 = r301
            int r0 = r0.getStatusCode()
            r303 = r0
            r0 = 401(0x191, float:5.62E-43)
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L28
        L26:
            r0 = 0
            r302 = r0
        L28:
            r0 = r302
            return r0
        L2a:
            r0 = r301
            java.lang.Throwable r0 = r0.getCause()
            r301 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RN.A02(java.lang.Throwable):boolean");
    }
}
