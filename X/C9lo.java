package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Set;

/* renamed from: X.9lo, reason: invalid class name */
/* loaded from: 9lo.class */
public final class C9lo {
    public final 1Br A00 = 1BK.A0D();
    public final Set A03 = 7zL.A15();
    public final 1Br A01 = 1Bu.A00(68026);
    public final String A02 = 7zR.A0s();

    public static final long A00(ThreadKey threadKey, C9lo c9lo) {
        if (!7Qc.A00((7Qc) 1Br.A0B(c9lo.A01)).AZk(36310808868488391L) || threadKey == null || threadKey.A0z()) {
            return 0L;
        }
        return threadKey.A0r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ea, code lost:
    
        if (r311 != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.1UG r301, com.facebook.messaging.model.threadkey.ThreadKey r302, com.facebook.stickers.model.Sticker r303, java.lang.String r304, java.lang.String r305) {
        /*
            r0 = r301
            java.lang.String r1 = "item_id"
            r2 = r304
            r0.A7R(r1, r2)
            r0 = r303
            java.lang.String r0 = r0.A0H
            r306 = r0
            java.lang.String r0 = "item_collection_id"
            r307 = r0
            r0 = r301
            r1 = r307
            r2 = r306
            r0.A7R(r1, r2)
            java.lang.String r0 = "webp"
            r308 = r0
            java.lang.String r0 = "png"
            r309 = r0
            java.lang.String r0 = "lottie"
            r310 = r0
            java.lang.String r0 = "keyframes"
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L60
            r0 = r305
            int r0 = r0.hashCode()
            r311 = r0
            r0 = r311
            switch(r0) {
                case -1446666299: goto Ldb;
                case -1096937569: goto Lcb;
                case 111145: goto Lbb;
                case 3645340: goto Laf;
                default: goto L60;
            }
        L60:
            r0 = 0
            r308 = r0
        L63:
            java.lang.String r0 = "format"
            r307 = r0
            r0 = r301
            r1 = r307
            r2 = r308
            r0.A7R(r1, r2)
            r0 = 0
            r306 = r0
            r0 = r302
            if (r0 == 0) goto L86
            r0 = r302
            boolean r0 = r0.A0x()
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L9c
            X.3yg r0 = X.EnumC03583yg.A03
            r306 = r0
        L86:
            r0 = r301
            r1 = r306
            java.lang.String r2 = "thread_type"
            r0.A5c(r1, r2)
            X.HCd r0 = X.HCd.A05
            r306 = r0
            r0 = r301
            r1 = r306
            java.lang.String r2 = "sticker_type"
            r0.A5c(r1, r2)
            return
        L9c:
            r0 = r302
            boolean r0 = r0.A0w()
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L86
            X.3yg r0 = X.EnumC03583yg.A02
            r306 = r0
            goto L86
        Laf:
            r0 = r305
            r1 = r308
            boolean r0 = r0.equals(r1)
            r311 = r0
            goto Le8
        Lbb:
            r0 = r305
            r1 = r309
            boolean r0 = r0.equals(r1)
            r311 = r0
            r0 = r309
            r308 = r0
            goto Le8
        Lcb:
            r0 = r305
            r1 = r310
            boolean r0 = r0.equals(r1)
            r311 = r0
            r0 = r310
            r308 = r0
            goto Le8
        Ldb:
            r0 = r305
            r1 = r306
            boolean r0 = r0.equals(r1)
            r311 = r0
            r0 = r306
            r308 = r0
        Le8:
            r0 = r311
            if (r0 != 0) goto L63
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9lo.A01(X.1UG, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.stickers.model.Sticker, java.lang.String, java.lang.String):void");
    }

    public static void A02(1UG r301, ThreadKey threadKey, C9lo c9lo, long j) {
        r301.A7R("creation_session_id", c9lo.A02);
        r301.A5c(C98O.A01, "send_source");
        r301.A6H("absolute_position", Long.valueOf(j));
        r301.A09("is_download");
        r301.A6H("thread_id", Long.valueOf(A00(threadKey, c9lo)));
    }
}
