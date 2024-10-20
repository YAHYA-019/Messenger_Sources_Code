package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.user.model.UserKey;

/* loaded from: I2k.class */
public final class I2k {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public UserKey A05;
    public final int A06;
    public final C66i A07;
    public final C66i A08;
    public final 2qN A09;
    public final float A0A;

    public I2k(C62j c62j) {
        Context A0J = 7zP.A0J();
        2qN r0 = (2qN) 1Bn.A0B(17095);
        this.A09 = r0;
        Resources resources = A0J.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2132279314);
        this.A0A = resources.getDimension(2132279626);
        this.A06 = GOo.A00(resources);
        H0C h0c = new H0C(this, 10);
        C66i c66i = new C66i(c62j);
        c66i.A09(C66h.A03(80.0d, 7.0d));
        c66i.A00 = 0.5d;
        c66i.A02 = 0.5d;
        c66i.A0A(h0c);
        this.A07 = c66i;
        C66i c66i2 = new C66i(c62j);
        c66i2.A09(C66h.A01());
        c66i2.A00 = 0.5d;
        c66i2.A02 = 0.5d;
        c66i2.A0A(h0c);
        this.A08 = c66i2;
        r0.A0A(A0J);
        r0.A09(dimensionPixelSize);
        r0.A0E(true);
        r0.A04.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
    }

    public static void A00(I2k i2k) {
        Drawable drawable = i2k.A09.A04;
        Rect bounds = drawable.getBounds();
        int i = (int) (i2k.A02 + i2k.A07.A09.A00);
        int i2 = (int) (i2k.A03 + i2k.A08.A09.A00);
        int width = bounds.width() + i;
        int height = bounds.height() + i2;
        if (bounds.left == i && bounds.top == i2 && bounds.right == width && bounds.bottom == height) {
            return;
        }
        drawable.setBounds(i, i2, width, height);
    }

    public boolean A01() {
        C66i c66i = this.A07;
        double abs = Math.abs(c66i.A01 - c66i.A09.A00);
        C66i c66i2 = this.A08;
        return 1BL.A1S((Math.max(abs, Math.abs(c66i2.A01 - c66i2.A09.A00)) > this.A0A ? 1 : (Math.max(abs, Math.abs(c66i2.A01 - c66i2.A09.A00)) == this.A0A ? 0 : -1)));
    }
}
