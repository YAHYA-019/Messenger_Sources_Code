package X;

/* loaded from: Kd9.class */
public abstract class Kd9 {
    public static final KBs A00;
    public static final KBt A01;
    public static final KBt A02;
    public static final KBt A03;
    public static final KBt A04;

    static {
        try {
            L1n l1n = L1n.A04;
            L1q l1q = L1q.A03;
            A01 = KYc.A00(l1q, l1n, 32, 16);
            try {
                A02 = KYc.A00(l1q, l1n, 32, 32);
                try {
                    L1q l1q2 = L1q.A05;
                    A03 = KYc.A00(l1q2, l1n, 64, 32);
                    try {
                        A04 = KYc.A00(l1q2, l1n, 64, 64);
                        try {
                            A00 = KYa.A00(L1m.A04, 32, 16);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
