package X;

import java.util.Iterator;

/* loaded from: Iyu.class */
public final class Iyu implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$31";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ boolean A01;

    public Iyu(6Ue r302, boolean z) {
        this.A00 = r302;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A00);
        while (A1F.hasNext()) {
            GOn.A12(A1F).C3a(this.A01);
        }
    }
}
