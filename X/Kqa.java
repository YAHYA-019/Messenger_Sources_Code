package X;

/* loaded from: Kqa.class */
public final class Kqa {
    public int A00;
    public int A05;
    public int A03 = 0;
    public int A04 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A07 = false;
    public boolean A06 = false;

    public Kqa() {
        int i = (-1) << (-1);
        this.A05 = i;
        this.A00 = i;
    }

    public void A00(int i, int i2) {
        this.A05 = i;
        this.A00 = i2;
        this.A06 = true;
        int i3 = (-1) << (-1);
        if (this.A07) {
            if (i2 != i3) {
                this.A03 = i2;
            }
            if (i != i3) {
                this.A04 = i;
                return;
            }
            return;
        }
        if (i != i3) {
            this.A03 = i;
        }
        if (i2 != i3) {
            this.A04 = i2;
        }
    }
}
