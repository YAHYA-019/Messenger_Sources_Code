package X;

import com.facebook.messaging.service.model.MarkThreadsParams;

/* renamed from: X.7zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zc.class */
public final class RunnableC12127zc implements Runnable {
    public static final String __redex_internal_original_name = "ReadThreadManager$1";
    public final /* synthetic */ 5I5 A00;
    public final /* synthetic */ MarkThreadsParams A01;

    public RunnableC12127zc(5I5 r302, MarkThreadsParams markThreadsParams) {
        this.A00 = r302;
        this.A01 = markThreadsParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        5I5 r0 = this.A00;
        ((2Iq) r0.A01.get()).A01("android_messaging_mark_read_start");
        5I5.A04(r0, this.A01, false);
    }
}
