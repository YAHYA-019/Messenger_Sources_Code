package X;

/* loaded from: I90.class */
public final class I90 {
    public static final I90 A02 = new I90();
    public final int A00;
    public final int A01;

    static {
        new I90(0, 0);
    }

    public I90() {
        this.A01 = -1;
        this.A00 = -1;
    }

    public I90(int i, int i2) {
        if (i < 0 && i != -1) {
            throw AnonymousClass001.A0L(AnonymousClass000.A00(13));
        }
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof I90) {
            I90 i90 = (I90) obj;
            if (i90.A01 == this.A01 && i90.A00 == this.A00) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return this.A01 ^ this.A00;
    }

    public String toString() {
        return 0Pz.A0b("PlayPosition{startFromPosition=", ", lastStartPosition=", '}', this.A01, this.A00);
    }
}
