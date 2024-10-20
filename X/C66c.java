package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.66c, reason: invalid class name */
/* loaded from: 66c.class */
public final class C66c {
    /* JADX WARN: Type inference failed for: r0v13, types: [X.66d] */
    public C66d A00(final ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(65590);
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            ?? r0 = new C66e(threadKey) { // from class: X.66d
                public final 1Br A00 = 1Bq.A00(16385);
                public final 1Br A01 = 1Bq.A00(67389);
                public final 1Br A02 = 1Bq.A00(67183);
                public final ThreadKey A03;

                {
                    this.A03 = threadKey;
                }

                public static final String A00(Context context, Uri uri) {
                    String scheme = uri.getScheme();
                    if (scheme != null && scheme.equals("content")) {
                        return context.getContentResolver().getType(uri);
                    }
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    11T.A0D(fileExtensionFromUrl);
                    Locale locale = Locale.US;
                    11T.A0B(locale);
                    String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
                    11T.A0A(lowerCase);
                    return singleton.getMimeTypeFromExtension(lowerCase);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static final java.util.LinkedHashMap A01(android.net.Uri r301, X.C66d r302, java.lang.Long r303, java.lang.String r304, boolean r305) {
                    /*
                        Method dump skipped, instructions count: 323
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C66d.A01(android.net.Uri, X.66d, java.lang.Long, java.lang.String, boolean):java.util.LinkedHashMap");
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0168  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0199  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0243  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static final java.util.LinkedHashMap A02(X.C5fv r301, X.C66d r302, java.util.Map r303) {
                    /*
                        Method dump skipped, instructions count: 1064
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C66d.A02(X.5fv, X.66d, java.util.Map):java.util.LinkedHashMap");
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
                @Override // X.C66e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.util.Map Apc(android.content.Context r302, X.C5fv r303) {
                    /*
                        r301 = this;
                        r0 = 1
                        r304 = r0
                        r0 = r303
                        r1 = r304
                        X.11T.A0F(r0, r1)
                        r0 = r303
                        boolean r0 = r0 instanceof X.C5n8
                        r305 = r0
                        r0 = r305
                        if (r0 == 0) goto Lab
                        r0 = r303
                        r306 = r0
                        r0 = r303
                        X.5n8 r0 = (X.C5n8) r0
                        r306 = r0
                        r0 = r306
                        if (r0 == 0) goto Lab
                        r0 = r306
                        android.net.Uri r0 = r0.A01
                        r307 = r0
                        r0 = r307
                        if (r0 == 0) goto Lab
                        r0 = r301
                        X.1Br r0 = r0.A01
                        X.00i r0 = r0.A00
                        r306 = r0
                        r0 = r306
                        java.lang.Object r0 = r0.get()
                        r0 = r307
                        java.lang.String r0 = r0.getHost()
                        r308 = r0
                        r0 = r308
                        if (r0 == 0) goto La2
                        java.lang.String r0 = "tam-attachment"
                        r306 = r0
                        r0 = r306
                        r1 = r304
                        X.11T.A0F(r0, r1)
                        r0 = r308
                        r1 = r306
                        boolean r0 = r0.endsWith(r1)
                        r305 = r0
                        r0 = r305
                        if (r0 == 0) goto La2
                        r0 = 0
                        r304 = r0
                        r0 = 0
                        r309 = r0
                    L66:
                        r0 = r302
                        r1 = r307
                        java.lang.String r0 = A00(r0, r1)
                        r306 = r0
                        r0 = r306
                        if (r0 != 0) goto L78
                        java.lang.String r0 = ""
                        r306 = r0
                    L78:
                        r0 = r307
                        r1 = r301
                        r2 = 0
                        r3 = r306
                        r4 = 0
                        java.util.LinkedHashMap r0 = A01(r0, r1, r2, r3, r4)
                        r308 = r0
                        java.lang.String r0 = "resolution_code"
                        r306 = r0
                        r0 = r309
                        if (r0 == 0) goto L9a
                        r0 = r308
                        r1 = r306
                        r2 = r309
                        java.lang.Object r0 = r0.put(r1, r2)
                    L9a:
                        r0 = r303
                        r1 = r301
                        r2 = r308
                        java.util.LinkedHashMap r0 = A02(r0, r1, r2)
                        return r0
                    La2:
                        r0 = 0
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r309 = r0
                        goto L66
                    Lab:
                        r0 = 0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C66d.Apc(android.content.Context, X.5fv):java.util.Map");
                }

                @Override // X.C66e
                public java.util.Map AwE(Context context, Uri uri, C5fv c5fv, Long l) {
                    String A00 = A00(context, uri);
                    if (A00 == null) {
                        A00 = "";
                    }
                    return A02(c5fv, this, A01(uri, this, l, A00, false));
                }

                @Override // X.C66e
                public java.util.Map AwF(Context context, Uri uri, String str, long j) {
                    long j2 = -1;
                    String A00 = A00(context, uri);
                    if (A00 == null) {
                        A00 = "";
                    }
                    LinkedHashMap A012 = A01(uri, this, Long.valueOf(j2), A00, false);
                    A012.put("media_load_source", str);
                    return A02(null, this, A012);
                }

                @Override // X.C66e
                public java.util.Map AwG(C5fv c5fv, Photo photo) {
                    11T.A0F(photo, 0);
                    Uri uri = null;
                    try {
                        uri = C0A2.A03(photo.A0E);
                    } catch (SecurityException unused) {
                    }
                    String str = photo.A0D;
                    11T.A0A(str);
                    return A02(c5fv, this, A01(uri, this, null, str, photo.A0I));
                }
            };
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
