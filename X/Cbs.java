package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Cbs.class */
public final class Cbs implements 2TV {
    public final int A00;
    public final Object A01;

    public Cbs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        int i = this.A00;
        Object obj3 = this.A01;
        if (i != 0) {
            ((1FX) obj3).set(C0ty.A00);
            return;
        }
        6Jk r0 = (6Jk) obj3;
        r0.A0J = false;
        6Jk.A08(r0, true);
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        if (this.A00 != 0) {
            HcJ hcJ = (HcJ) obj2;
            11T.A0F(hcJ, 1);
            ((1FX) this.A01).set(hcJ.A01);
        }
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
        if (this.A00 == 0) {
            RMw rMw = (RMw) obj2;
            6Jk r0 = (6Jk) this.A01;
            r0.A0E = rMw.A02;
            r0.A0G.addAll(rMw.A01);
            r0.A01 = rMw.A00;
            r0.A0J = rMw.A03;
            if (((Bux) obj).A04) {
                r0.A00 = 0;
                6Jk.A07(r0, (String) null);
            }
            6Jk.A09(r0, false);
            6Jk.A08(r0, true);
        }
    }
}
