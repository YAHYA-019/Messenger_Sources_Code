package X;

import java.util.Iterator;

/* loaded from: Iym.class */
public final /* synthetic */ class Iym implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$$ExternalSyntheticLambda1";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ Hzz A01;

    public /* synthetic */ Iym(6Ue r302, Hzz hzz) {
        this.A00 = r302;
        this.A01 = hzz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Ue r0 = this.A00;
        Hzz hzz = this.A01;
        Iterator A1F = GOn.A1F(r0);
        while (A1F.hasNext()) {
            GOn.A12(A1F).CNq(hzz);
        }
    }
}
