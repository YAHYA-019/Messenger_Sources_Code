package X;

/* loaded from: Kth.class */
public final class Kth {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final MJQ A06;

    public Kth(MJQ mjq, float f, float f2, int i, int i2, int i3, int i4) {
        this.A06 = mjq;
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = f;
        this.A00 = f2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Kth)) {
                return false;
            }
            Kth kth = (Kth) obj;
            if (!11T.A0O(this.A06, kth.A06) || this.A05 != kth.A05 || this.A04 != kth.A04 || this.A03 != kth.A03 || this.A02 != kth.A02 || Float.compare(this.A01, kth.A01) != 0 || Float.compare(this.A00, kth.A00) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return JQz.A07(1BL.A00((((((((1BL.A03(this.A06) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31, this.A01), this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ParagraphInfo(paragraph=");
        A0k.append(this.A06);
        A0k.append(", startIndex=");
        A0k.append(this.A05);
        A0k.append(", endIndex=");
        A0k.append(this.A04);
        A0k.append(", startLineIndex=");
        A0k.append(this.A03);
        A0k.append(", endLineIndex=");
        A0k.append(this.A02);
        A0k.append(", top=");
        A0k.append(this.A01);
        A0k.append(", bottom=");
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }
}
