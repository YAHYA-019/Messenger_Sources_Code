package X;

/* renamed from: X.9kq, reason: invalid class name */
/* loaded from: 9kq.class */
public final class C9kq {
    public static final C9kq A00 = new Object();

    public static final String A00(String str) {
        Object obj;
        switch (str.hashCode()) {
            case -1487394660:
                obj = "image/jpeg";
                break;
            case -1487018032:
                return str.equals("image/webp") ? ".webp" : ".png";
            case -879264467:
                obj = "image/jpg";
                break;
            default:
                return ".png";
        }
        return str.equals(obj) ? ".jpeg" : ".png";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:11:0x0043, B:14:0x006c, B:16:0x007a, B:22:0x008f, B:25:0x009b, B:28:0x00a8, B:31:0x00b4), top: B:10:0x0043, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File A01(android.graphics.Bitmap r302, java.lang.String r303, java.lang.String r304, java.lang.String r305) {
        /*
            r301 = this;
            r0 = r302
            r1 = r303
            r2 = r304
            X.7zT.A1S(r0, r1, r2)
            r0 = 49473(0xc141, float:6.9326E-41)
            r306 = r0
            r0 = r306
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.536 r0 = (X.AnonymousClass536) r0
            r307 = r0
            r0 = r305
            java.lang.String r1 = "_"
            r2 = r303
            java.lang.String r0 = X.0Pz.A0j(r0, r1, r2)
            r308 = r0
            r0 = r304
            java.lang.String r0 = A00(r0)
            r309 = r0
            r0 = r307
            r1 = r308
            r2 = r309
            java.io.File r0 = r0.A0C(r1, r2)
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L36
            r0 = 0
            return r0
        L36:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Ld5
            r307 = r0
            r0 = r307
            r1 = r310
            r0.<init>(r1)     // Catch: java.io.IOException -> Ld5
            r0 = r304
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> Lc4
            r306 = r0
            r0 = r306
            switch(r0) {
                case -1487394660: goto L8a;
                case -1487018032: goto La3;
                case -879264467: goto L83;
                default: goto L6c;
            }
        L6c:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> Lc4
            r308 = r0
        L71:
            r0 = 100
            r306 = r0
            r0 = r302
            r1 = r308
            r2 = r306
            r3 = r307
            boolean r0 = r0.compress(r1, r2, r3)     // Catch: java.lang.Throwable -> Lc4
            goto Lbc
        L83:
            java.lang.String r0 = "image/jpg"
            r309 = r0
            goto L8e
        L8a:
            java.lang.String r0 = "image/jpeg"
            r309 = r0
        L8e:
            r0 = r304
            r1 = r309
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lc4
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L6c
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> Lc4
            r308 = r0
            goto L71
        La3:
            java.lang.String r0 = "image/webp"
            r309 = r0
            r0 = r304
            r1 = r309
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lc4
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L6c
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch: java.lang.Throwable -> Lc4
            r308 = r0
            goto L71
        Lbc:
            r0 = r307
            r0.close()     // Catch: java.io.IOException -> Ld5
            r0 = r310
            return r0
        Lc4:
            r308 = move-exception
            r0 = r308
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r309 = move-exception
            r0 = r307
            r1 = r308
            X.AnonymousClass127.A00(r0, r1)     // Catch: java.io.IOException -> Ld5
            r0 = r309
            throw r0     // Catch: java.io.IOException -> Ld5
        Ld5:
            r307 = move-exception
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = X.4YT.A00(r0)
            r309 = r0
            java.lang.String r0 = "MediaFileUtils"
            r1 = r309
            r2 = r307
            X.0fH.A0p(r0, r1, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9kq.A01(android.graphics.Bitmap, java.lang.String, java.lang.String, java.lang.String):java.io.File");
    }
}
