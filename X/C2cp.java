package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.BitSet;

/* renamed from: X.2cp, reason: invalid class name */
/* loaded from: 2cp.class */
public final class C2cp extends C1rj {
    public Drawable A00;
    public ImageView.ScaleType A01;
    public boolean A02;

    public C2cp() {
        super("Image");
        this.A02 = true;
    }

    public static C2cq A00(1Iw r301, int i) {
        return new C2cq(r301, new C2cp(), i);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Drawable drawable = this.A00;
        ImageView.ScaleType scaleType = this.A01;
        boolean z = this.A02;
        11T.A0F(r302, 0);
        if (C02A.usePrimitiveImage && C02A.enablePrimitiveMeasurementFix) {
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            return new DwM(drawable, scaleType, z);
        }
        C2yr c2yr = new C2yr(r302, new 2Kh());
        2Kh r0 = c2yr.A01;
        r0.A00 = drawable;
        BitSet bitSet = c2yr.A02;
        bitSet.set(0);
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        r0.A01 = scaleType;
        r0.A02 = z;
        C1rs.A05(bitSet, c2yr.A03, 1);
        c2yr.A0J();
        return r0;
    }
}
