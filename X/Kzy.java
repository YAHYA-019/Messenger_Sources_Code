package X;

/* loaded from: Kzy.class */
public final class Kzy {
    public final float A00;
    public final float A01;
    public final MNh A02;

    public Kzy(MNh mNh, float f) {
        this.A00 = f;
        this.A02 = mNh;
        float AhL = mNh.AhL();
        float f2 = KZJ.A00;
        this.A01 = AhL * 386.0878f * 160.0f * 0.84f;
    }

    public static final double A00(Kzy kzy, float f) {
        return Math.log((Math.abs(f) * 0.35f) / (kzy.A00 * kzy.A01));
    }
}
