package X;

import android.content.Context;
import android.widget.BaseAdapter;
import com.facebook.inject.FbInjector;

/* loaded from: C7p.class */
public final class C7p {
    public final C04r A00;
    public final 1Br A01;
    public final 1Br A02;
    public final CF9 A03;

    public C7p() {
        1Br A00 = 1Bu.A00(406);
        this.A02 = A00;
        this.A00 = AbH.A06();
        C1F6 c1f6 = (C1F6) 1Br.A0B(A00);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            CF9 cf9 = new CF9();
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = cf9;
            this.A01 = 7zM.A0Q();
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public final void A00(BaseAdapter baseAdapter) {
        11T.A0F(baseAdapter, 0);
        BnG bnG = new BnG(baseAdapter, this);
        this.A00.put(baseAdapter, bnG);
        CF9 cf9 = this.A03;
        synchronized (cf9) {
            0WH r0 = cf9.A02;
            if (r0.isEmpty()) {
                1XZ r02 = cf9.A06;
                r02.A77(cf9.A05);
                r02.A5m(cf9);
            }
            r0.add(bnG);
        }
    }

    public final void A01(BaseAdapter baseAdapter) {
        11T.A0F(baseAdapter, 0);
        Object remove = this.A00.remove(baseAdapter);
        CF9 cf9 = this.A03;
        synchronized (cf9) {
            0WH r0 = cf9.A02;
            r0.remove(remove);
            if (r0.isEmpty()) {
                1XZ r02 = cf9.A06;
                r02.Cez(cf9.A05);
                r02.CeM(cf9);
            }
        }
    }
}
