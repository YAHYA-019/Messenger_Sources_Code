package X;

import java.util.Iterator;

/* loaded from: Iyv.class */
public final class Iyv implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$34";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ Object A01;

    public Iyv(6Ue r302, Object obj) {
        this.A00 = r302;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A00);
        while (A1F.hasNext()) {
            GOn.A12(A1F).C7D(this.A01);
        }
    }
}
