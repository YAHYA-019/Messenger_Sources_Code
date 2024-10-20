package X;

/* loaded from: Jx4.class */
public final class Jx4 extends KpV {
    @Override // X.KpV
    public Qq8 A00() {
        Kld kld;
        if (!this.A01 && (kld = this.A00) != null) {
            Integer num = kld.A03;
            int i = kld.A00;
            int i2 = kld.A01;
            if (num != null) {
                int intValue = num.intValue();
                if (i != intValue) {
                    int i3 = intValue;
                    if (07C.A07(0, i).A01(intValue)) {
                        i3 = i2 - intValue;
                    }
                    i2 = i3 - 1;
                    if (07C.A07(0, i).A01(intValue)) {
                        i = (i - intValue) - 1;
                    }
                }
            }
            if (i2 != 0) {
                return i == 0 ? Qq8.A03 : i == i2 ? Qq8.A04 : Qq8.A05;
            }
        }
        return Qq8.A02;
    }
}
