package X;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: I1u.class */
public final class I1u {
    public static final IAN A02 = new Object();
    public final String A00;
    public final BlockingDeque A01 = new LinkedBlockingDeque();

    public I1u(String str) {
        this.A00 = str;
    }

    public final void A00(Hht hht) {
        BlockingDeque blockingDeque = this.A01;
        Hht hht2 = (Hht) blockingDeque.peekLast();
        if (hht2 != null && hht2.A03 == hht.A03 && hht2.A01 == hht.A01) {
            return;
        }
        blockingDeque.add(hht);
    }
}
