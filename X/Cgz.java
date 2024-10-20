package X;

import android.content.Context;

/* loaded from: Cgz.class */
public final class Cgz implements C00i, C15h {
    public final int A00;
    public final Object A01;

    public Cgz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C00i, X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        1BY r303;
        switch (this.A00) {
            case 0:
                r303 = ((BxC) this.A01).A00;
                break;
            case 1:
                r303 = ((B45) this.A01).A00;
                break;
            default:
                AeV aeV = (AeV) this.A01;
                Context context = aeV.A03;
                return ((AbR) 1Bu.A06(context, 457)).A0o(context, aeV.A04);
        }
        return 1Fw.A05(r303).A02;
    }
}
