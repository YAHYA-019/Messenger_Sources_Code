package X;

import android.animation.ValueAnimator;

/* loaded from: L89.class */
public final class L89 {
    public LD7 A01;
    public final int[] A07;
    public final float[] A05 = new float[2];
    public final float[] A06 = new float[2];
    public final float[] A03 = new float[2];
    public final float[] A04 = new float[2];
    public boolean A02 = false;
    public int A00 = 0;

    public L89() {
        int[] iArr = new int[2];
        this.A07 = iArr;
        int i = 0;
        do {
            iArr[i] = -1;
            i++;
        } while (i < 2);
    }

    public static final float A00(float[] fArr, int i) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        return i > 0 ? f / i : 0.0f;
    }

    public static final void A01(L89 l89) {
        if (l89.A02) {
            return;
        }
        LD7 ld7 = l89.A01;
        if (ld7 != null) {
            if (ld7.A05) {
                ValueAnimator valueAnimator = ld7.A07;
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
            }
            ld7.A0A.set(ld7.A08);
        }
        l89.A02 = true;
    }

    public final void A02() {
        if (this.A02) {
            this.A02 = false;
            int i = 0;
            do {
                this.A05[i] = this.A03[i];
                this.A06[i] = this.A04[i];
                i++;
            } while (i < 2);
            A01(this);
        }
    }
}
