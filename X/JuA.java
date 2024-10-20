package X;

import com.google.common.base.Objects;

/* loaded from: JuA.class */
public final class JuA extends JTd {
    public final int A00;

    public JuA(JTd jTd, int i) {
        super(jTd.A00);
        this.A00 = i;
    }

    public InterfaceC04494b5 A00() {
        return new 4bD(0Pz.A0T(super.A00().BIN(), this.A00));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            JuA juA = (JuA) obj;
            if (this.A00 != juA.A00 || !Objects.equal(((JTd) this).A00, ((JTd) juA).A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((super.hashCode() + 31) * 31) + this.A00;
    }
}
