package X;

/* loaded from: Ju0.class */
public class Ju0 extends KSW {
    public int A00 = -1;
    public int A01 = 0;

    public void A00(int i, int i2) {
        if (this instanceof Jty) {
            return;
        }
        if (i < 0 || i >= ((KSW) this).A00.A03()) {
            throw AnonymousClass001.A0N(0Pz.A0D(i, " is not a valid value for the first visible item position."));
        }
        if (i2 < 0 || i2 > ((KSW) this).A00.A03()) {
            throw AnonymousClass001.A0N(0Pz.A0D(i2, " is not a valid value for the item count."));
        }
        if (this.A00 == i && this.A01 == i2) {
            return;
        }
        this.A00 = i;
        this.A01 = i2;
        int i3 = i2 * 2;
        int i4 = i3 / 2;
        int i5 = i3 - i4;
        int A0C = JQx.A0C(i, i4, 0);
        ((KSW) this).A00.A06(A0C, (Math.min((i + (i2 - 1)) + i5, ((KSW) this).A00.A03() - 1) - A0C) + 1, 2);
    }
}
