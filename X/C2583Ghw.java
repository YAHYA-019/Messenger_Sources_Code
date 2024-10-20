package X;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.io.Closeables;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.Ghw, reason: case insensitive filesystem */
/* loaded from: Ghw.class */
public final class C2583Ghw extends C4C3 {
    public final ContentResolver A00;
    public final MediaResource A01;
    public final String A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2583Ghw(android.content.ContentResolver r302, X.C0dp r303, com.facebook.ui.media.attachments.model.MediaResource r304) {
        /*
            r301 = this;
            r0 = r304
            java.lang.String r0 = r0.A0s
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L90
            r0 = r304
            android.net.Uri r0 = r0.A0E
            r305 = r0
            r0 = r302
            r1 = r305
            java.lang.String r0 = r0.getType(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L90
            X.R3Z r0 = X.R3Z.$redex_init_class
            r305 = r0
            r0 = r304
            X.5HP r0 = r0.A0Q
            r305 = r0
            r0 = r305
            int r0 = r0.ordinal()
            r306 = r0
            r0 = r306
            switch(r0) {
                case 0: goto L8c;
                case 1: goto L85;
                case 2: goto L7e;
                case 3: goto L78;
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L78;
                case 8: goto L8c;
                case 9: goto L85;
                case 10: goto L85;
                case 11: goto L8c;
                case 12: goto L85;
                case 13: goto L85;
                default: goto L78;
            }
        L78:
            java.lang.String r0 = "Unexpected attachment type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        L7e:
            java.lang.String r0 = "audio/MPEG"
            r305 = r0
            goto L90
        L85:
            java.lang.String r0 = "video/mp4"
            r305 = r0
            goto L90
        L8c:
            java.lang.String r0 = "image/jpeg"
            r305 = r0
        L90:
            r0 = r301
            r1 = r305
            r0.<init>(r1)
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A01 = r1
            X.R3Z r0 = X.R3Z.$redex_init_class
            r305 = r0
            r0 = r304
            X.5HP r0 = r0.A0Q
            r305 = r0
            r0 = r305
            int r0 = r0.ordinal()
            r306 = r0
            r0 = r306
            switch(r0) {
                case 0: goto L102;
                case 1: goto L102;
                case 2: goto L10e;
                case 3: goto Lfc;
                case 4: goto L102;
                case 5: goto L102;
                case 6: goto L102;
                case 7: goto L102;
                case 8: goto L102;
                case 9: goto L102;
                case 10: goto L102;
                case 11: goto L102;
                case 12: goto L102;
                case 13: goto L102;
                default: goto Lfc;
            }
        Lfc:
            java.lang.String r0 = "Unexpected attachment type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        L102:
            r0 = r304
            android.net.Uri r0 = r0.A0E
            java.lang.String r0 = r0.getLastPathSegment()
            r305 = r0
            goto L158
        L10e:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r307 = r0
            r0 = r303
            long r0 = r0.now()
            r308 = r0
            r0 = r307
            r1 = r308
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r307
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r304
            long r0 = r0.A08
            r308 = r0
            r0 = r307
            r1 = r308
            java.lang.String r0 = X.AnonymousClass001.A0h(r0, r1)
            r307 = r0
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r310 = r0
            r0 = r310
            java.lang.String r1 = "audioclip-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r310
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = ".mp4"
            r1 = r310
            java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
            r305 = r0
        L158:
            r0 = r301
            r1 = r305
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2583Ghw.<init>(android.content.ContentResolver, X.0dp, com.facebook.ui.media.attachments.model.MediaResource):void");
    }

    @Override // X.C4C3
    public long A00() {
        Uri uri = this.A01.A0E;
        Integer A00 = Hvw.A00(uri);
        R3Z r3z = R3Z.$redex_init_class;
        return A00.intValue() != 1 ? -1 : GOp.A11(uri).length();
    }

    @Override // X.C4C3
    public String A01() {
        return null;
    }

    @Override // X.C4C3
    public String A02() {
        return this.A02;
    }

    @Override // X.C4C3
    public String A03() {
        return HttpRequestMultipart.CONTENT_TRANSFER_ENCODING_BINARY;
    }

    @Override // X.C4C3
    public void A04(OutputStream outputStream) {
        Uri uri = this.A01.A0E;
        Integer A00 = Hvw.A00(uri);
        R3Z r3z = R3Z.$redex_init_class;
        int intValue = A00.intValue();
        if (intValue == 1) {
            new C05344dj(GOp.A11(uri)).A02(outputStream);
        } else {
            if (intValue != 0) {
                throw AnonymousClass001.A0L("Unsupported scheme");
            }
            InputStream openInputStream = this.A00.openInputStream(uri);
            try {
                1SB.A00(openInputStream, outputStream);
            } finally {
                Closeables.A01(openInputStream);
            }
        }
    }
}
