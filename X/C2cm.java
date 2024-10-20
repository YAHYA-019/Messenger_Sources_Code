package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.2cm, reason: invalid class name */
/* loaded from: 2cm.class */
public final class C2cm extends C1rs {
    public C2cl A00;
    public 1Iw A01;

    public final void A2W() {
        A2c(ImageView.ScaleType.CENTER);
    }

    public void A2X(int i) {
        this.A00.A00 = i;
    }

    public void A2Y(int i) {
        this.A00.A00 = this.A02.A09(i, 0);
    }

    public void A2Z(int i) {
        this.A00.A00 = this.A02.A04(i);
    }

    public void A2a(int i) {
        this.A00.A01 = this.A02.A0B(i);
    }

    public void A2b(Drawable drawable) {
        this.A00.A01 = drawable;
    }

    public void A2c(ImageView.ScaleType scaleType) {
        this.A00.A02 = scaleType;
    }
}
