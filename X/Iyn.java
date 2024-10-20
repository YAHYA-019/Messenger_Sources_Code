package X;

import java.util.Iterator;

/* loaded from: Iyn.class */
public final /* synthetic */ class Iyn implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$$ExternalSyntheticLambda2";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ 6Uz A01;

    public /* synthetic */ Iyn(6Ue r302, 6Uz r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Ue r0 = this.A00;
        6Uz r02 = this.A01;
        Iterator A1F = GOn.A1F(r0);
        while (A1F.hasNext()) {
            GOn.A12(A1F).Bk5(r02);
        }
    }
}
