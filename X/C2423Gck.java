package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Gck, reason: case insensitive filesystem */
/* loaded from: Gck.class */
public final class C2423Gck extends Ic7 implements JPq {
    public int A00;
    public JQ2 A01;
    public JQ1 A02;
    public JQ3 A03;
    public final JQ9 A04;
    public final JG4 A05;
    public final JQ7 A06;
    public final Object A07;
    public volatile HZh A08;
    public volatile boolean A09;

    public C2423Gck(JOW jow) {
        super.A00 = jow;
        this.A09 = true;
        this.A07 = AnonymousClass001.A0R();
        this.A05 = new Id9(this, 0);
        this.A06 = (JQ7) Ic7.A08(this, JQ7.A00);
        this.A04 = JOW.A01(this, super.A00, JQ9.A00);
    }

    public static void A00(Bitmap bitmap, JHs jHs, HZe hZe, JHt jHt, C2423Gck c2423Gck, File file) {
        if (AnonymousClass001.A1W(Thread.currentThread(), DKD.A10())) {
            throw AnonymousClass001.A0T("Method handlePreviewPhotoTaken must be invoked on a background thread");
        }
        if (file == null || jHt == null) {
            A01(c2423Gck);
            IHZ.A01(bitmap, jHs, hZe, (HZg) null);
        } else {
            IOException A02 = I9m.A02(bitmap, file);
            A01(c2423Gck);
            IHZ.A01(bitmap, jHs, hZe, (HZg) null);
            IHZ.A03(jHt, file, A02);
        }
    }

    public static void A01(C2423Gck c2423Gck) {
        synchronized (c2423Gck.A07) {
            c2423Gck.A08 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r0.BNd() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026a, code lost:
    
        if (((X.AbstractC2421Gci) r301.A01).A00 != 1) goto L97;
     */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, X.HZh] */
    @Override // X.JPq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D41(X.Hh2 r302, X.JHs r303, X.JHt r304) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2423Gck.D41(X.Hh2, X.JHs, X.JHt):void");
    }
}
