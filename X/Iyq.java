package X;

import java.util.Iterator;

/* loaded from: Iyq.class */
public final class Iyq implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$20";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ 7uY A01;

    public Iyq(6Ue r302, 7uY r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A00);
        while (A1F.hasNext()) {
            GOn.A12(A1F).CV4(this.A01);
        }
    }
}
