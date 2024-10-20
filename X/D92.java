package X;

import java.util.Iterator;

/* loaded from: D92.class */
public final class D92 implements Runnable {
    public static final String __redex_internal_original_name = "MediaOperationManager$1";
    public final /* synthetic */ 1IC A00;
    public final /* synthetic */ 5Ho A01;
    public final /* synthetic */ 81I A02;

    public D92(1IC r302, 5Ho r303, 81I r304) {
        this.A01 = r303;
        this.A02 = r304;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        5Ho r0 = this.A01;
        81I r02 = this.A02;
        1IC r03 = this.A00;
        synchronized (r0) {
            r0.A02.remove(r02, r03);
            if (5Ho.A00(r0, r02).isEmpty()) {
                Iterator it = r0.A01.Cdy(r02).iterator();
                while (it.hasNext()) {
                    r0.A00.remove(AnonymousClass001.A0i(it), r02);
                }
            }
        }
    }
}
