package X;

import java.util.List;

/* loaded from: Isc.class */
public final class Isc implements Runnable {
    public static final String __redex_internal_original_name = "RendererSurfacePipeComponent$1";
    public final /* synthetic */ Gts A00;

    public Isc(Gts gts) {
        this.A00 = gts;
    }

    @Override // java.lang.Runnable
    public void run() {
        Gts gts = this.A00;
        IGl iGl = gts.A0K;
        Gts.A02(iGl, gts.A0M);
        List list = gts.A0E.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            Gts.A02(iGl, (I5d) list.get(i2));
            i = i2 + 1;
        }
        IGl iGl2 = gts.A0K;
        if (iGl2 != null) {
            if (gts.A0G) {
                gts.A0K = null;
                iGl2.A01();
            } else {
                iGl2.A00();
            }
        }
        I5d i5d = gts.A0L;
        gts.A0L = null;
        if (i5d != null) {
            i5d.A01();
        }
        I5d i5d2 = gts.A0M;
        gts.A0M = null;
        if (i5d2 != null) {
            i5d2.A01();
        }
    }
}
