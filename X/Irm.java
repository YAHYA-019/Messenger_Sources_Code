package X;

import java.util.Iterator;

/* loaded from: Irm.class */
public final class Irm implements Runnable {
    public static final String __redex_internal_original_name = "ScreenshareFloorControlStateImpl$notifyStateChangeEvent$1";
    public final /* synthetic */ Hu8 A00;

    public Irm(Hu8 hu8) {
        this.A00 = hu8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A0F.iterator();
        while (it.hasNext()) {
            ((JFh) it.next()).Bz6();
        }
    }
}
