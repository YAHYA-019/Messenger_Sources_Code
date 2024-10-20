package X;

import com.facebook.presence.DefaultPresenceManager;

/* loaded from: Gv4.class */
public final class Gv4 extends 2TO {
    public final int A00;
    public final Object A01;

    public Gv4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A02() {
        if (this.A00 == 0) {
            4YU.A0G(((C2397Gbz) this.A01).A1N).post(new Runnable() { // from class: X.Ir3
                public static final String __redex_internal_original_name = "MontageViewerPageFragment$6$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C2397Gbz.A0g((C2397Gbz) Gv4.this.A01);
                }
            });
            return;
        }
        Grd grd = (Grd) this.A01;
        grd.A02 = 0QD.A0V(DefaultPresenceManager.A05((DefaultPresenceManager) ((1XZ) 1Br.A0B(grd.A0C)), -1, true));
        ((2UV) 1Br.A0B(grd.A08)).D1t(1BK.A0d());
        grd.A1c();
    }
}
