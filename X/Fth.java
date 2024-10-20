package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fth.class */
public final class Fth implements GGj {
    public final F5E A00;

    public Fth(F5E f5e) {
        this.A00 = f5e;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EEW eew = (AbstractC10314t5) obj;
        if (eew instanceof EEW) {
            EEW eew2 = eew;
            String A0z = 0Pz.A0z(eew2.A01.A02, "&ping_id=", eew2.A03, "&ping_group_id=", eew2.A02);
            F5E f5e = this.A00;
            EmT emT = new EmT(r302, eew2, this);
            2C4 r0 = (2C4) f5e.A01.get();
            ListenableFuture D3C = AbF.A13(r0.A01).D3C(new G6j(r0, A0z));
            1Kd.A0D(f5e.A00, new S5Y(emT, f5e), D3C);
        }
    }
}
