package X;

import java.util.Iterator;

/* loaded from: Iyt.class */
public final class Iyt implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$30";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ boolean A01;

    public Iyt(6Ue r302, boolean z) {
        this.A00 = r302;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A00);
        while (A1F.hasNext()) {
            GOn.A12(A1F).CO4(this.A01);
        }
    }
}
