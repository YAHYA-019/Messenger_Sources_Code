package X;

/* loaded from: Ev5.class */
public final class Ev5 {
    public final FH6 A00 = (FH6) 1Bn.A0A(100320);
    public final FFl A05 = (FFl) 1Bi.A03(100306);
    public final C00i A01 = AbH.A0a();
    public final C00i A02 = AbH.A0E();
    public final C00i A04 = AbH.A0F();
    public final C00i A03 = 1BQ.A00();

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r304.equals("video/mp4") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00(android.content.Context r302, android.net.Uri r303) {
        /*
            r301 = this;
            r0 = r303
            java.lang.String r0 = r0.getScheme()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L48
            java.lang.String r0 = "content"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L48
            r0 = r302
            android.content.ContentResolver r0 = r0.getContentResolver()
            r305 = r0
            r0 = r305
            r1 = r303
            java.lang.String r0 = r0.getType(r1)
            r304 = r0
        L27:
            r0 = r304
            if (r0 == 0) goto L3f
            java.lang.String r0 = "video/mp4"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L45
        L3f:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
        L45:
            r0 = r306
            return r0
        L48:
            r0 = r303
            java.lang.String r0 = r0.toString()
            r305 = r0
            r0 = r305
            java.lang.String r0 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3f
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            r305 = r0
            r0 = r305
            r1 = r304
            java.lang.String r0 = r0.getMimeTypeFromExtension(r1)
            r304 = r0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ev5.A00(android.content.Context, android.net.Uri):boolean");
    }
}
