package X;

import java.util.Iterator;

/* loaded from: Iys.class */
public final class Iys implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$28";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 6Ue A01;

    public Iys(6Ue r302, int i) {
        this.A01 = r302;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A01);
        while (A1F.hasNext()) {
            GOn.A12(A1F).Bjy(this.A00);
        }
    }
}
