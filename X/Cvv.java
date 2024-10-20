package X;

/* loaded from: Cvv.class */
public final class Cvv implements 55F {
    public final int A00;
    public final Object A01;

    public Cvv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C2K() {
    }

    public void CUo() {
        switch (this.A00) {
            case 0:
                C00m c00m = (C00m) this.A01;
                if (c00m != null) {
                    c00m.invoke();
                    return;
                }
                return;
            case 1:
            case 2:
                3QF.A00((3QF) this.A01, (short) 2);
                return;
            default:
                return;
        }
    }
}
