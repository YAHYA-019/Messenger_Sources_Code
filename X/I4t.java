package X;

/* loaded from: I4t.class */
public final class I4t {
    public static final Integer A0A = 2;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public I4t(Hk4 hk4) {
        int min;
        this.A05 = hk4.A04;
        this.A04 = hk4.A03;
        int i = hk4.A02;
        this.A03 = i;
        this.A06 = hk4.A07;
        Integer num = hk4.A05;
        if (num != null) {
            min = num.intValue();
        } else {
            min = Math.min((int) (r0 * r0 * 0.07d * i * (hk4.A06 == null ? A0A : r309).intValue()), 10000000);
        }
        this.A00 = min;
        this.A07 = hk4.A08;
        this.A08 = hk4.A09;
        this.A09 = hk4.A0A;
        this.A01 = hk4.A00;
        this.A02 = hk4.A01;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof I4t)) {
                return false;
            }
            I4t i4t = (I4t) obj;
            if (this.A05 == i4t.A05 && this.A04 == i4t.A04 && this.A00 == i4t.A00 && this.A03 == i4t.A03 && this.A06.equals(i4t.A06) && this.A01 == i4t.A01 && this.A02 == i4t.A02) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A07(this.A06, ((((((((this.A05 * 31) + this.A04) * 31) + this.A00) * 31) + this.A03) * 31) + 5) * 31) + 2) * 31) + this.A01) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoEncoderConfig{width=");
        A0k.append(this.A05);
        A0k.append(", height=");
        A0k.append(this.A04);
        A0k.append(", bitRate=");
        A0k.append(this.A00);
        A0k.append(", frameRate=");
        A0k.append(this.A03);
        A0k.append(", iFrameIntervalS=");
        A0k.append(5);
        A0k.append(", colorRange=");
        A0k.append(2);
        A0k.append(", colorStandard=");
        A0k.append(this.A01);
        A0k.append(", colorTransfer=");
        A0k.append(this.A02);
        A0k.append(", profile='");
        A0k.append(this.A06);
        A0k.append('\'');
        A0k.append(", configureBFrames=");
        A0k.append(this.A07);
        A0k.append(", explicitlySetBaseline=");
        A0k.append(this.A08);
        A0k.append(", explicitlySetColorEncoding=");
        A0k.append(this.A09);
        return AnonymousClass001.A0f(A0k);
    }
}
