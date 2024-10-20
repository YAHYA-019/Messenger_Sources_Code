package X;

/* renamed from: X.4k1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4k1.class */
public abstract class AbstractC07494k1 extends AbstractC07504k2 implements InterfaceC07534k5 {
    @Override // X.InterfaceC07534k5
    public boolean APT() {
        C07484k0 c07484k0;
        if (this instanceof C07484k0) {
            return !1Ux.A00((1Ux) ((C07484k0) this).A07.A00.get()).AZk(2342167802493947961L);
        }
        if (this instanceof 4kU) {
            InterfaceC07514k3 interfaceC07514k3 = ((4kU) this).A05;
            if (interfaceC07514k3 instanceof InterfaceC07534k5) {
                return ((InterfaceC07534k5) interfaceC07514k3).APT();
            }
            return true;
        }
        if (this instanceof 5SE) {
            c07484k0 = ((5SE) this).A02;
        } else {
            if (!(this instanceof C07714kh)) {
                return true;
            }
            c07484k0 = ((C07714kh) this).A02;
        }
        return c07484k0.APT();
    }
}
