package X;

/* renamed from: X.7si, reason: invalid class name */
/* loaded from: 7si.class */
public final class C7si {
    public int A00;
    public 7IJ A01 = null;
    public final int A02;

    public C7si(int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
    }

    public final void A00(int i) {
        7IJ r0;
        7IJ r02;
        if (i >= this.A02) {
            int i2 = this.A00;
            if (i >= i2) {
                return;
            }
            while (i < i2 && (r0 = this.A01) != null && (r02 = r0.A00) != null) {
                this.A01 = r02;
                i2--;
                this.A00 = i2;
            }
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('[');
        A0k.append(this.A02);
        A0k.append("...");
        A0k.append(this.A00);
        A0k.append(' ');
        7IJ r0 = this.A01;
        A0k.append(r0 != null ? r0.A01 : null);
        return AnonymousClass001.A0d("] ", A0k);
    }
}
