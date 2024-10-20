package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.3z9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3z9.class */
public final class C03853z9 {
    public final 1Br A00 = 1Bq.A00(16385);

    public static final long A00(Uri uri) {
        11T.A0F(uri, 0);
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            pathSegments = null;
        }
        long j = -1;
        if (pathSegments == null) {
            return j;
        }
        try {
            Object A0D = 0QD.A0D(pathSegments);
            11T.A0A(A0D);
            j = Long.parseLong((String) A0D);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    public final Uri A01(String str, long j) {
        11T.A0F(str, 1);
        return A02(str, null, j);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public final android.net.Uri A02(java.lang.String r302, java.lang.String r303, long r304) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            android.content.Context r0 = com.facebook.inject.FbInjector.A03
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = r306
            java.lang.String r0 = r0.getPackageName()
            r307 = r0
            r0 = r307
            X.11T.A0A(r0)
            r0 = r307
            java.lang.String r1 = ".tam-attachment"
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r308 = r0
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            r306 = r0
            r0 = r306
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r309 = r0
            r0 = 36324569942019825(0x810d0100034ef1, double:3.035142526411708E-306)
            r310 = r0
            r0 = r309
            r1 = r310
            boolean r0 = r0.AZk(r1)
            r312 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r307 = r0
            r0 = r312
            if (r0 == 0) goto Laf
            r0 = r307
            r0.<init>()
            java.lang.String r0 = "msys://"
            r306 = r0
        L5c:
            r0 = r307
            r1 = r306
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r307
            r1 = r308
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r307
            java.lang.String r0 = r0.toString()
            r307 = r0
            android.util.LruCache r0 = X.C0A2.A00
            r306 = r0
            r0 = r307
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            r307 = r0
            r0 = r304
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r306 = r0
            r0 = r307
            r1 = r306
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            r1 = r302
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            r306 = r0
            r0 = r303
            if (r0 == 0) goto La0
            r0 = r306
            r1 = r303
            android.net.Uri$Builder r0 = r0.appendPath(r1)
        La0:
            r0 = r306
            android.net.Uri r0 = r0.build()
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = r306
            return r0
        Laf:
            r0 = r307
            r0.<init>()
            java.lang.String r0 = "content://"
            r306 = r0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03853z9.A02(java.lang.String, java.lang.String, long):android.net.Uri");
    }
}
