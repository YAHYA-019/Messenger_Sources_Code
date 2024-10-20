package X;

/* renamed from: X.3aI, reason: invalid class name */
/* loaded from: 3aI.class */
public final class C3aI implements 5P0 {
    public final int A00;
    public final C2fd A01;
    public final Integer A02;

    public C3aI(C2fd c2fd, Integer num, int i) {
        11T.A0F(c2fd, 1);
        this.A01 = c2fd;
        this.A00 = i;
        this.A02 = num;
    }

    public void D8E(C2qh c2qh) {
        c2qh.A00(this.A01, this.A00);
        Integer num = this.A02;
        if (num != null) {
            c2qh.A05 = num.intValue();
        }
    }
}
