package X;

/* loaded from: Eyv.class */
public final class Eyv {
    public final int A00;
    public final int A01;
    public final 25P A02;
    public final DLQ A03;

    public Eyv(25P r302, DLQ dlq, int i, int i2) {
        11T.A0F(r302, 2);
        this.A03 = dlq;
        this.A02 = r302;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyv)) {
                return false;
            }
            Eyv eyv = (Eyv) obj;
            if (!11T.A0O(this.A03, eyv.A03) || !11T.A0O(this.A02, eyv.A02) || this.A01 != eyv.A01 || this.A00 != eyv.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A02, 1BL.A03(this.A03)) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SignalLayoutResult(model=");
        A0k.append(this.A03);
        A0k.append(1BJ.A00(607));
        A0k.append(this.A02);
        A0k.append(1BJ.A00(616));
        A0k.append(this.A01);
        A0k.append(", heightSpec=");
        return DKH.A0p(A0k, this.A00);
    }
}
