package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/* loaded from: LA2.class */
public final class LA2 {
    public final LA8 A00;
    public final MFJ A01;
    public final boolean A02;
    public final Paint A03;

    public LA2(LA8 la8, MFJ mfj, boolean z) {
        this.A00 = la8;
        this.A01 = mfj;
        this.A02 = z;
        Paint A09 = DKC.A09();
        this.A03 = A09;
        A09.setColor(0);
        DKC.A1M(A09);
        DKD.A19(A09, PorterDuff.Mode.SRC);
    }

    private void A00(Canvas canvas, KlU klU) {
        canvas.drawRect(klU.A02, klU.A03, r0 + klU.A01, r0 + klU.A00, this.A03);
    }

    private boolean A01(int i) {
        if (i != 0) {
            KlU[] klUArr = this.A00.A0B;
            KlU klU = klUArr[i];
            KlU klU2 = klUArr[i - 1];
            if (klU.A05 != 0S2.A01 || !A02(klU)) {
                return klU2.A04 == 3Dl.A02 && A02(klU2);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r302.A00 != r0.height()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02(X.KlU r302) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L43
            r0 = r302
            int r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L43
            r0 = r302
            int r0 = r0.A01
            r304 = r0
            r0 = r301
            X.LA8 r0 = r0.A00
            r305 = r0
            r0 = r305
            android.graphics.Rect r0 = r0.A05
            r306 = r0
            r0 = r306
            int r0 = r0.width()
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L43
            r0 = r302
            int r0 = r0.A00
            r304 = r0
            r0 = r306
            int r0 = r0.height()
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r307
            if (r0 == r1) goto L48
        L43:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L48:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LA2.A02(X.KlU):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x04fa -> B:172:0x0498). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(int r302, android.graphics.Bitmap r303) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LA2.A03(int, android.graphics.Bitmap):void");
    }
}
