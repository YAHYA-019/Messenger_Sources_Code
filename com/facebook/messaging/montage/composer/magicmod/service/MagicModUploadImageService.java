package com.facebook.messaging.montage.composer.magicmod.service;

import X.0DE;
import X.0DR;
import X.0KF;
import X.0gF;
import X.11T;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.1Lo;
import X.2aK;
import X.7zN;
import X.8Ls;
import X.8N9;
import X.8rP;
import X.9hL;
import X.AJj;
import X.C9h3;
import X.HnB;
import X.I3S;
import X.I7w;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.common.bitmaps.BitmapExtKt;

/* loaded from: MagicModUploadImageService.class */
public final class MagicModUploadImageService {
    public final C9h3 A03;
    public final 1Br A01 = 1Bq.A00(49373);
    public final 1Br A02 = 1Bq.A00(115938);
    public final 1Br A00 = 1Bu.A00(115986);

    public MagicModUploadImageService() {
        8rP r0 = 8rP.A00;
        11T.A0F(r0, 0);
        this.A03 = new C9h3(r0);
    }

    public static final Object A00(Bitmap bitmap, FbUserSession fbUserSession, MagicModUploadImageService magicModUploadImageService, String str, 0DR r305) {
        HnB hnB = (HnB) 1Lm.A06(fbUserSession, 99907);
        Long l = new Long(1Br.A07(((I3S) 1Br.A0B(magicModUploadImageService.A02)).A00).Auy(36606216717540740L));
        int i = BitmapExtKt.A00;
        11T.A0F(bitmap, 0);
        int width = bitmap.getWidth() * bitmap.getHeight();
        long j = width;
        long longValue = l.longValue();
        if (j >= longValue) {
            double sqrt = Math.sqrt(longValue / width);
            int A00 = 0KF.A00(bitmap.getWidth() * sqrt);
            int A002 = 0KF.A00(bitmap.getHeight() * sqrt);
            0gF.A00(bitmap);
            bitmap = Bitmap.createScaledBitmap(bitmap, A00, A002, true);
            11T.A0D(bitmap);
        }
        Uri A003 = I7w.A00(Bitmap.CompressFormat.JPEG, bitmap, hnB);
        return A003 == null ? new 8N9("failed_to_write_bitmap_to_temp_file") : A01(A003, fbUserSession, magicModUploadImageService, str, r305);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(2:9|(2:11|12)(2:36|37))(4:38|(1:40)(2:41|(1:87)(40:45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|(2:85|86)))|19|20)|13|14|15|(4:17|(1:22)|19|20)(6:23|(1:25)|26|(1:28)|29|(2:31|32)(2:33|34))))|90|6|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019f, code lost:
    
        r314 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a1, code lost:
    
        r311 = X.7zL.A17(r314);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, X.0CL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(android.net.Uri r301, com.facebook.auth.usersession.FbUserSession r302, com.facebook.messaging.montage.composer.magicmod.service.MagicModUploadImageService r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.magicmod.service.MagicModUploadImageService.A01(android.net.Uri, com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.montage.composer.magicmod.service.MagicModUploadImageService, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x015d, code lost:
    
        if (r313 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(com.facebook.auth.usersession.FbUserSession r302, X.2EU r303, X.8Ls r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.magicmod.service.MagicModUploadImageService.A02(com.facebook.auth.usersession.FbUserSession, X.2EU, X.8Ls, X.0DR):java.lang.Object");
    }

    public final void A03(FbUserSession fbUserSession, 8Ls r303) {
        11T.A0F(fbUserSession, 0);
        if (((9hL) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 68856)).A01.containsKey(r303.A01)) {
            return;
        }
        2aK.A03((Integer) null, (0DE) null, new AJj(fbUserSession, this, r303, (0DR) null, 48), 7zN.A0y(), 3);
    }
}
