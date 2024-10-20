package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Ft0.class */
public final class Ft0 implements 3oI, GJg {
    public 3oH A00;
    public int A01;
    public final InterfaceC01863t5 A02;
    public final 1Pr A03;
    public final AtomicReference A05 = new AtomicReference();
    public final Ejy A04 = new Object();

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Ejy, java.lang.Object] */
    public Ft0(InterfaceC01863t5 interfaceC01863t5, 1Pr r303) {
        this.A03 = new 1Pr(r303);
        this.A02 = interfaceC01863t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.Fsz, java.lang.Object, X.3oI] */
    @Override // X.GJg
    public void A3k(GIo gIo, 3oH r303, Object obj) {
        int i;
        int i2;
        if (this.A00 == null) {
            throw AnonymousClass001.A0T("setOuterStore must be called before the first dispatch");
        }
        if (this.A01 == 0) {
            this.A05.set(Thread.currentThread());
        }
        this.A01++;
        try {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                GGj gGj = (GGj) it.next();
                InterfaceC01863t5 interfaceC01863t5 = this.A02;
                if (interfaceC01863t5 != null) {
                    interfaceC01863t5.Cis(this.A00, new G4a(gGj, this, obj));
                } else {
                    ?? obj2 = new Object();
                    obj2.A00 = this;
                    gGj.BhS(obj2, obj);
                }
            }
            gIo.accept(obj);
            while (true) {
                if (i + i2 != 0) {
                    return;
                }
                Ejy ejy = this.A04;
                Eme eme = ejy.A00;
                if (eme == null) {
                    this.A05.set(null);
                    return;
                }
                this.A01 = 1;
                3oH r0 = this.A00;
                Eme eme2 = eme.A00;
                ejy.A00 = eme2;
                if (eme2 == null) {
                    ejy.A01 = null;
                }
                r0.ANn(eme.A01);
            }
        } finally {
            this.A01--;
        }
    }

    public void ANn(Object obj) {
        if (this.A05.get() != Thread.currentThread()) {
            this.A00.ANn(obj);
            return;
        }
        Ejy ejy = this.A04;
        Eme eme = new Eme(ejy, obj);
        Eme eme2 = ejy.A01;
        if (eme2 == null) {
            ejy.A01 = eme;
            ejy.A00 = eme;
        } else {
            eme2.A00 = eme;
            ejy.A01 = eme;
        }
    }

    @Override // X.GJg
    public void Bqk(3oH r302) {
    }

    @Override // X.GJg
    public void CNs() {
        this.A03.A00.clear();
    }
}
