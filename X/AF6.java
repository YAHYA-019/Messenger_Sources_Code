package X;

import com.facebook.messaging.service.model.MarkThreadsParams;

/* loaded from: AF6.class */
public final class AF6 implements Runnable {
    public static final String __redex_internal_original_name = "ReadThreadManager$3";
    public final /* synthetic */ 5I5 A00;
    public final /* synthetic */ MarkThreadsParams A01;

    public AF6(5I5 r302, MarkThreadsParams markThreadsParams) {
        this.A00 = r302;
        this.A01 = markThreadsParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        5I5.A04(this.A00, this.A01, true);
    }
}
