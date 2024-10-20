package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: Iyr.class */
public final class Iyr implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$25";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ List A01;

    public Iyr(6Ue r302, List list) {
        this.A00 = r302;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A00);
        while (A1F.hasNext()) {
            GOn.A12(A1F).CQh(this.A01);
        }
    }
}
