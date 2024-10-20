package X;

/* loaded from: KR0.class */
public final class KR0 extends IllegalStateException {
    public final int currentCapacity;
    public final int requiredCapacity;

    public KR0(int i, int i2) {
        super(0Pz.A0o("Buffer too small (", " < ", ")", i, i2));
        this.currentCapacity = i;
        this.requiredCapacity = i2;
    }
}
