package X;

import java.util.List;

/* loaded from: Iei.class */
public final class Iei implements JLu {
    public final int A00;
    public final Object A01;

    public Iei(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JLu
    public /* synthetic */ void BqV(HzC hzC, ICm iCm) {
        if (this.A00 != 0) {
            GuH guH = (GuH) this.A01;
            if (guH.A04.get()) {
                List list = guH.A02.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((JLG) list.get(i)).BqU(hzC);
                }
            }
        }
    }

    @Override // X.JLu
    public void Bqi(HzC hzC, ICm iCm) {
        int i = this.A00;
        Object obj = this.A01;
        if (i == 0) {
            ((Gtl) obj).A00 = true;
            return;
        }
        GuH guH = (GuH) obj;
        if (GOp.A1a(guH.A04)) {
            List list = guH.A02.A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((JLG) list.get(i2)).Bqh(hzC);
            }
        }
    }

    @Override // X.JLu
    public /* synthetic */ void Bqr(ICm iCm, Exception exc) {
        if (this.A00 == 0) {
            return;
        }
        List list = ((GuH) this.A01).A02.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((JLG) list.get(i2)).Bqq(exc);
            i = i2 + 1;
        }
    }

    @Override // X.JLu
    public void Btv(ICm iCm) {
        if (this.A00 == 0) {
            Gtl gtl = (Gtl) this.A01;
            gtl.A00 = false;
            gtl.A02.A0B(this);
            return;
        }
        GuH guH = (GuH) this.A01;
        if (guH.A04.compareAndSet(true, false)) {
            List list = guH.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((JLG) list.get(i)).Btu();
            }
        }
    }

    @Override // X.JLu
    public void Btx(ICm iCm, Exception exc) {
        if (this.A00 == 0) {
            Gtl gtl = (Gtl) this.A01;
            gtl.A00 = false;
            gtl.A02.A0B(this);
            return;
        }
        GuH guH = (GuH) this.A01;
        if (guH.A04.compareAndSet(true, false)) {
            List list = guH.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
        }
    }
}
