package X;

/* loaded from: K0S.class */
public abstract class K0S extends 6WE {
    public long A00;

    public void A01() {
        if (this instanceof K1S) {
            K1S k1s = (K1S) this;
            LbW lbW = k1s.A00.A00;
            k1s.A00();
            lbW.A04.add(k1s);
            return;
        }
        K0S k0s = (K1T) this;
        K0W k0w = ((K1T) k0s).A00;
        Object obj = ((LaL) k0w).A07;
        synchronized (obj) {
            k0s.A00();
            K0S[] k0sArr = ((LaL) k0w).A0B;
            int i = ((LaL) k0w).A01;
            ((LaL) k0w).A01 = i + 1;
            k0sArr[i] = k0s;
            if (!((LaL) k0w).A08.isEmpty() && ((LaL) k0w).A01 > 0) {
                obj.notify();
            }
        }
    }
}
