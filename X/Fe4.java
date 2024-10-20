package X;

/* loaded from: Fe4.class */
public final class Fe4 implements GEe {
    @Override // X.GEe
    public boolean A8s(int i, int i2, int i3, int i4) {
        if (1tJ.A0A()) {
            return true;
        }
        synchronized (Integer.valueOf(1tJ.A00)) {
            1tJ.A00 = i2;
        }
        return true;
    }
}
