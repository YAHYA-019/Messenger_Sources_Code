package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6j7, reason: invalid class name */
/* loaded from: 6j7.class */
public final class C6j7 implements Runnable {
    public static final String __redex_internal_original_name = "MsysThreadViewQuerySubscriber$callbackWithNewResult$notifyNewResult$1";
    public final /* synthetic */ 5VT A00;
    public final /* synthetic */ 5Sc A01;

    public C6j7(5VT r302, 5Sc r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C00j.A05("MsysThreadViewQuerySubscriber.onNewResult", 2135817717);
        List list = this.A00.A0T;
        5Sc r0 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((6iS) ((82Z) it.next()).A01).A01(r0);
        }
        C00j.A01(-1118932414);
    }
}
