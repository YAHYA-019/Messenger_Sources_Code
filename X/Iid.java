package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Iid.class */
public final class Iid implements JMr {
    public int A00;
    public int A01;
    public Hue A02;

    @Override // X.JMr
    public H9n AnB() {
        return H9n.LUM;
    }

    @Override // X.JMr
    public boolean BNR() {
        Hue hue = this.A02;
        H9n h9n = H9n.LUM;
        ArrayList arrayList = hue.A06.A00;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            if (((JLy) arrayList.get(i2)).BSP(h9n)) {
                z = true;
                break;
            }
            i = i2 + 1;
        }
        return z;
    }

    @Override // X.JMr
    public void BOu(IFI ifi, JL0 jl0) {
        release();
        Cuf(this.A01, this.A00);
        Hue hue = this.A02;
        Hjk hjk = new Hjk(jl0, 2131886150, 2131886149, true);
        if (hue.A0B != null) {
            Hjk hjk2 = hue.A0B;
            HsS hsS = hjk2.A02;
            if (hsS != null) {
                hsS.A01();
                hjk2.A02 = null;
            }
            hjk2.A03.A01();
        }
        hue.A0B = hjk;
    }

    @Override // X.JMr
    public boolean CZG(I5I i5i, boolean z) {
        Hue hue = this.A02;
        if (hue.A04(i5i, z)) {
            return true;
        }
        Iterator it = hue.A06.A00.iterator();
        while (it.hasNext()) {
            if (((JLy) it.next()).ATf()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.JMr
    public void Ckc() {
        this.A02.A01();
    }

    @Override // X.JMr
    public void Cpc(boolean z) {
        this.A02.A04 = z;
    }

    @Override // X.JMr
    public void Ctg(List list) {
        this.A02.A03(this, list);
    }

    @Override // X.JMr
    public void Cuf(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02.A02(i, i2);
    }

    @Override // X.JMr
    public void release() {
        this.A02.A00();
    }
}
