package X;

import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.ImageData;

/* renamed from: X.3oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3oa.class */
public final class C00673oa {
    public static boolean A00(Attachment attachment) {
        ImageData imageData = attachment.A07;
        boolean z = false;
        if (imageData != null && imageData.A02 != null) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(com.facebook.messaging.model.attachment.Attachment r301) {
        /*
            r0 = r301
            java.lang.String r0 = r0.A0G
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.A0L
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L24
            java.lang.String r0 = "audio/"
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L24
            r0 = 1
            r305 = r0
            r0 = r302
            if (r0 != 0) goto L29
        L24:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L29:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00673oa.A01(com.facebook.messaging.model.attachment.Attachment):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.startsWith("image/") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(com.facebook.messaging.model.attachment.Attachment r301) {
        /*
            r0 = r301
            java.lang.String r0 = r0.A0L
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L18
            java.lang.String r0 = "image/"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.startsWith(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L1c
        L18:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L1c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00673oa.A02(com.facebook.messaging.model.attachment.Attachment):boolean");
    }
}
