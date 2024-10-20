package X;

import java.util.Iterator;

/* loaded from: Iyx.class */
public final class Iyx implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$41";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ Ep2 A01;

    public Iyx(6Ue r302, Ep2 ep2) {
        this.A00 = r302;
        this.A01 = ep2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A00);
        while (A1F.hasNext()) {
            GOn.A12(A1F).C3f(this.A01);
        }
    }
}
