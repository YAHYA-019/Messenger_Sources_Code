package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.io.Closeables;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.6kg, reason: invalid class name */
/* loaded from: 6kg.class */
public final class C6kg {
    public Context A00;
    public final ContentResolver A01;

    public C6kg() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A00 = context;
        this.A01 = (ContentResolver) 1Hv.A02(context, 100181);
    }

    public static boolean A00(MediaResource mediaResource) {
        Uri uri;
        if (mediaResource == null || (uri = mediaResource.A0E) == null) {
            return false;
        }
        try {
            Hvw.A00(uri);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r0 == X.5HP.A04) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(com.facebook.ui.media.attachments.model.MediaResource r301) {
        /*
            r0 = r301
            X.5HP r0 = r0.A0Q
            r301 = r0
            X.5HP r0 = X.5HP.A05
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L24
            X.5HP r0 = X.5HP.A06
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L24
            X.5HP r0 = X.5HP.A04
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L26
        L24:
            r0 = 1
            r304 = r0
        L26:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6kg.A01(com.facebook.ui.media.attachments.model.MediaResource):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r0 == X.5HP.A0G) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(com.facebook.ui.media.attachments.model.MediaResource r301) {
        /*
            r0 = r301
            X.5HP r0 = r0.A0Q
            r301 = r0
            X.5HP r0 = X.5HP.A0F
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.5HP r0 = X.5HP.A05
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.5HP r0 = X.5HP.A07
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.5HP r0 = X.5HP.A02
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.5HP r0 = X.5HP.A0A
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.5HP r0 = X.5HP.A0G
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L41
        L3f:
            r0 = 1
            r304 = r0
        L41:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6kg.A02(com.facebook.ui.media.attachments.model.MediaResource):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r0 == X.5HP.A0B) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(com.facebook.ui.media.attachments.model.MediaResource r301) {
        /*
            r0 = r301
            X.5HP r0 = r0.A0Q
            r301 = r0
            X.5HP r0 = X.5HP.A0H
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L2d
            X.5HP r0 = X.5HP.A08
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L2d
            X.5HP r0 = X.5HP.A06
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L2d
            X.5HP r0 = X.5HP.A0B
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L2f
        L2d:
            r0 = 1
            r304 = r0
        L2f:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6kg.A03(com.facebook.ui.media.attachments.model.MediaResource):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.io.InputStream] */
    public byte[] A04(Uri uri) {
        FileInputStream fileInputStream;
        if (Hvw.A00(uri).intValue() == 1) {
            File A0E = AnonymousClass001.A0E(uri.getPath());
            A0E.getClass();
            return C05344dj.A00(A0E);
        }
        int intValue = Hvw.A00(uri).intValue();
        if (intValue == 1) {
            fileInputStream = new FileInputStream(uri.getPath());
        } else {
            if (intValue != 0) {
                throw AnonymousClass002.A0C(uri, "Unsupported scheme, uri: ", AnonymousClass001.A0k());
            }
            fileInputStream = this.A01.openInputStream(uri);
        }
        try {
            return 0eJ.A00(fileInputStream, fileInputStream.available());
        } finally {
            Closeables.A01(fileInputStream);
        }
    }
}
