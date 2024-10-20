package X;

/* renamed from: X.2ab, reason: invalid class name */
/* loaded from: 2ab.class */
public final class C2ab extends 2Zs {
    public static final C2ab A00 = new 2Zs();

    public void dispatch(0DE r302, Runnable runnable) {
        2aO r0 = 2aO.A01;
        r0.A00.A05(runnable, 2aP.A06, false);
    }

    public void dispatchYield(0DE r302, Runnable runnable) {
        2aO r0 = 2aO.A01;
        r0.A00.A05(runnable, 2aP.A06, true);
    }

    public 2Zs limitedParallelism(int i) {
        C2ac.A00(i);
        if (i >= 2aP.A02) {
            return this;
        }
        C2ac.A00(i);
        return new C2ad(this, i);
    }
}
