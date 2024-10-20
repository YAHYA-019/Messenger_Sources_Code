package X;

/* loaded from: E0i.class */
public final class E0i extends 2Yf {
    public Elf A00;

    public E0i() {
        super("WrapperSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        Elf elf = this.A00;
        2Yr r0 = new 2Yr();
        DPC dpc = elf.A01;
        QOe qOe = new QOe();
        qOe.A02 = elf.A02;
        F6U f6u = elf.A00;
        qOe.A01 = f6u;
        qOe.A00 = dpc.A07;
        ((2Yf) qOe).A07 = 4YU.A15(f6u);
        r0.A01(qOe);
        return r0.A00;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Elf elf = this.A00;
            Elf elf2 = ((E0i) r302).A00;
            if (elf != null) {
                if (!elf.equals(elf2)) {
                    return false;
                }
            } else if (elf2 != null) {
                return false;
            }
        }
        return true;
    }
}
