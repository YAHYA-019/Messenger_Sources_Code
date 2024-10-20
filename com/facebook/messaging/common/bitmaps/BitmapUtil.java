package com.facebook.messaging.common.bitmaps;

import X.0gF;
import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1OW;
import X.2DX;
import X.2Dp;
import X.2EU;
import X.2Ff;
import X.2IA;
import X.4YU;
import X.4YV;
import X.7zM;
import X.7zR;
import X.AbG;
import X.AbstractC2498Gfe;
import X.C00i;
import X.C2506Gfm;
import X.C4s1;
import X.DKC;
import X.DKD;
import X.GOn;
import X.I7w;
import X.JIJ;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutorService;

/* loaded from: BitmapUtil.class */
public final class BitmapUtil {
    public static final I7w A05 = new Object();
    public static final CallerContext A06 = CallerContext.A0B("BitmapUtil");
    public final 1Br A03 = 7zM.A0P();
    public final 1Br A00 = AbG.A0J();
    public final 1Br A01 = 1Bq.A00(65609);
    public final 1Br A04 = 1Bq.A00(65630);
    public final 1Br A02 = 1Bq.A00(49322);

    public static final 2EU A00(Bitmap bitmap, BitmapUtil bitmapUtil) {
        C00i c00i = bitmapUtil.A02.A00;
        int A08 = ((C4s1) c00i.get()).A08();
        int A062 = ((C4s1) c00i.get()).A06();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > A08) {
            A062 = (int) (height * (A08 / width));
        } else {
            A08 = (int) (width * (A062 / height));
        }
        return A01(bitmapUtil).A07(bitmap, A08, A062, true);
    }

    public static final 2DX A01(BitmapUtil bitmapUtil) {
        return (2DX) 1Br.A0B(bitmapUtil.A04);
    }

    public final 2EU A02(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        C00i c00i = this.A02.A00;
        return (bitmap.getWidth() > ((C4s1) c00i.get()).A08() || bitmap.getHeight() > ((C4s1) c00i.get()).A06()) ? A00(bitmap, this) : 2DX.A01(bitmap, A01(this));
    }

    public final 2EU A03(Bitmap bitmap, Bitmap bitmap2, PorterDuff.Mode mode) {
        boolean A1W = 1BL.A1W(bitmap, bitmap2);
        2DX A01 = A01(this);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        bitmap.getConfig();
        2EU A04 = A01.A04(width, height);
        Canvas A0B = 7zR.A0B(A04);
        A0B.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint A09 = DKC.A09();
        DKD.A19(A09, mode);
        if (bitmap2.getWidth() != bitmap.getWidth() || bitmap2.getHeight() != bitmap.getHeight()) {
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            0gF.A00(bitmap2);
            bitmap2 = Bitmap.createScaledBitmap(bitmap2, width2, height2, A1W);
            11T.A0A(bitmap2);
        }
        A0B.drawBitmap(bitmap2, 0.0f, 0.0f, A09);
        return A04;
    }

    public final 2EU A04(2EU r302, int i) {
        if (i % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH != 0) {
            Matrix A0F = GOn.A0F();
            A0F.postRotate(i);
            Bitmap bitmap = (Bitmap) r302.A09();
            r302 = 2DX.A00(bitmap, A0F, A01(this), 0, 0, bitmap.getWidth(), bitmap.getHeight(), true);
        }
        return r302;
    }

    public final 1OW A05(CallerContext callerContext, AbstractC2498Gfe abstractC2498Gfe, 2Dp r304) {
        1OW A0A = ((2Ff) 1Br.A0B(this.A01)).A0A(r304, callerContext);
        A0A.D3K(abstractC2498Gfe, 4YV.A11(this.A03));
        return A0A;
    }

    public final SettableFuture A06(Uri uri, CallerContext callerContext, ExecutorService executorService) {
        4YV.A1N(uri, executorService);
        SettableFuture A0j = 4YU.A0j();
        ((2Ff) 1Br.A0B(this.A01)).A0A(2IA.A01(uri).A04(), callerContext).D3K(new C2506Gfm(A0j, 4), executorService);
        return A0j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(2:9|(2:11|12)(2:25|26))(2:27|(13:29|30|31|32|33|34|35|36|37|38|39|40|(2:42|43))(1:44))|13|14|15|(1:17)|18|(2:20|21)(1:23)))|47|6|7|(0)(0)|13|14|15|(0)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r312 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
    
        r309 = new X.0DV(r312);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A07(android.net.Uri r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.common.bitmaps.BitmapUtil.A07(android.net.Uri, X.0DR):java.lang.Object");
    }

    public final void A08(CallerContext callerContext, 2Dp r303, JIJ jij) {
        ((2Ff) 1Br.A0B(this.A01)).A0A(r303, callerContext).D3K(new C2506Gfm(jij, 5), 4YV.A11(this.A03));
    }
}
