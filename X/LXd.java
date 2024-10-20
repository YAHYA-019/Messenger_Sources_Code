package X;

import java.util.Random;

/* loaded from: LXd.class */
public final class LXd implements MFZ {
    public final float A00;
    public final float A01;
    public final Random A02 = new Random();

    public LXd(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    public static void A00(LXb lXb, float f, float f2) {
        lXb.A00 = new LXe(f, f2);
        lXb.A04 = new LXd(-15.0f, 15.0f);
    }

    public float AUB() {
        float nextGaussian = (float) this.A02.nextGaussian();
        float f = this.A01;
        float f2 = this.A00;
        return C0ed.A00((((nextGaussian - (-2.33f)) / (2.33f - (-2.33f))) * (f2 - f)) + f, Math.min(f, f2), Math.max(f, f2));
    }
}
