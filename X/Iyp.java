package X;

import java.util.Iterator;

/* loaded from: Iyp.class */
public final class Iyp implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$19";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6Ue A01;

    public Iyp(6Ue r302, long j) {
        this.A01 = r302;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A01);
        while (A1F.hasNext()) {
            GOn.A12(A1F).CJr(this.A00);
        }
    }
}
