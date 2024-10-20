package X;

import com.facebook.litho.ComponentTree;

/* loaded from: Ivz.class */
public final class Ivz implements Runnable {
    public static final String __redex_internal_original_name = "SectionsHelper$2";
    public final /* synthetic */ C6tg A00;
    public final /* synthetic */ Integer A01;

    public Ivz(C6tg c6tg, Integer num) {
        this.A00 = c6tg;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        ComponentTree componentTree = this.A00.A0B.A01;
        (componentTree == null ? null : componentTree.A09).Bef(this.A01);
    }
}
