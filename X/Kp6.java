package X;

import java.util.List;

/* loaded from: Kp6.class */
public final class Kp6 {
    public final C00p A00;
    public final KgO A01;

    public Kp6(C00p c00p, KgO kgO) {
        this.A00 = c00p;
        this.A01 = kgO;
    }

    public final boolean A00(long j) {
        Object obj;
        List list = this.A01.A01;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((Ktp) obj).A02 == j) {
                break;
            }
            i = i2 + 1;
        }
        Ktp ktp = (Ktp) obj;
        if (ktp != null) {
            z = ktp.A09;
        }
        return z;
    }
}
