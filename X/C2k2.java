package X;

import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;

/* renamed from: X.2k2, reason: invalid class name */
/* loaded from: 2k2.class */
public final class C2k2 extends C1rj {
    public float A00;
    public int A01;

    public C2k2() {
        super("SolidColor");
        this.A00 = -1.0f;
    }

    public static C2k3 A00(1Iw r301) {
        return new C2k3(r301, new C2k2());
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A01;
        float f = this.A00;
        if (f >= 0.0f) {
            i = 1tG.A05(i, (int) (Math.min(1.0f, f) * 255.0f));
        }
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A2b(ImageView.ScaleType.FIT_XY);
        A00.A2a(new ColorDrawable(i));
        return A00.A2W();
    }
}
