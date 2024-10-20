package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.util.Arrays;

/* renamed from: X.7RX, reason: invalid class name */
/* loaded from: 7RX.class */
public final class C7RX extends C1rj {
    public float A00;
    public int A01;
    public float[] A02;

    public C7RX() {
        super("CornersOutlineComponent");
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        return new DLS();
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DLS dls = (DLS) obj;
        float[] fArr = this.A02;
        float f = this.A00;
        int i = this.A01;
        11T.A0F(dls, 1);
        11T.A0F(fArr, 2);
        if (fArr.length != 8) {
            throw 1BK.A0g();
        }
        dls.A02 = fArr[0];
        dls.A03 = fArr[2];
        dls.A01 = fArr[4];
        dls.A00 = fArr[6];
        DLS.A00(dls);
        dls.invalidateSelf();
        dls.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        Paint paint = dls.A04;
        if (f != paint.getStrokeWidth()) {
            paint.setStrokeWidth(f);
            DLS.A00(dls);
            dls.invalidateSelf();
        }
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C7RX c7rx = (C7RX) r302;
            if (this.A01 != c7rx.A01 || Float.compare(this.A00, c7rx.A00) != 0 || !Arrays.equals(this.A02, c7rx.A02)) {
                return false;
            }
        }
        return true;
    }
}
