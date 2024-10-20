package X;

import android.content.Context;

/* loaded from: Fs5.class */
public final class Fs5 implements 5To {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Fs5(Context context, 5Tn r303, GJ1 gj1, int i) {
        this.A00 = i;
        this.A03 = r303;
        this.A02 = context;
        this.A01 = gj1;
    }

    private void A00(Egi egi) {
        11T.A0F(egi, 0);
        if (egi instanceof EIS) {
            Runnable sCt = new SCt((Context) this.A02, ((EIS) egi).A00, (GJ1) this.A01);
            if (DKE.A1V()) {
                sCt.run();
            } else {
                EZa.A00.post(sCt);
            }
            5Tn r0 = (5Tn) this.A03;
            r0.Ceh(this);
            r0.destroy();
        }
    }

    private void A01(Egi egi) {
        11T.A0F(egi, 0);
        if (egi instanceof EIS) {
            Runnable sCu = new SCu((Context) this.A02, ((EIS) egi).A00, (GJ1) this.A01);
            if (DKE.A1V()) {
                sCu.run();
            } else {
                EZa.A00.post(sCu);
            }
            5Tn r0 = (5Tn) this.A03;
            r0.Ceh(this);
            r0.destroy();
        }
    }

    public /* bridge */ /* synthetic */ void CbI(Object obj) {
        Egi egi = (Egi) obj;
        if (this.A00 != 0) {
            A01(egi);
        } else {
            A00(egi);
        }
    }

    public /* bridge */ /* synthetic */ void CbM(Object obj) {
        Egi egi = (Egi) obj;
        if (this.A00 != 0) {
            if (egi != null) {
                A01(egi);
            }
        } else if (egi != null) {
            A00(egi);
        }
    }
}
