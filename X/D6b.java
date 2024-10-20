package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: D6b.class */
public final class D6b implements Runnable {
    public static final String __redex_internal_original_name = "SendMessageToPendingThreadManager$6";
    public final /* synthetic */ CaP A00;

    public D6b(CaP caP) {
        this.A00 = caP;
    }

    @Override // java.lang.Runnable
    public void run() {
        CaP caP = this.A00;
        caP.A0I.clear();
        caP.A00.AAs();
        List list = caP.A0F;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        list.clear();
    }
}
