package X;

import java.util.Iterator;

/* loaded from: Iyl.class */
public final /* synthetic */ class Iyl implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$$ExternalSyntheticLambda0";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ 5NV A01;

    public /* synthetic */ Iyl(6Ue r302, 5NV r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Ue r0 = this.A00;
        5NV r02 = this.A01;
        Iterator A1F = GOn.A1F(r0);
        while (A1F.hasNext()) {
            GOn.A12(A1F).CCF(r02);
        }
    }
}
