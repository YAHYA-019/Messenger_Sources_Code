package X;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.3i4, reason: invalid class name */
/* loaded from: 3i4.class */
public final class C3i4 implements Runnable {
    public static final String __redex_internal_original_name = "CombinedQueue$1";
    public final /* synthetic */ 1DA A00;
    public final /* synthetic */ 1ET A01;
    public final /* synthetic */ 1DN A02;
    public final /* synthetic */ RejectedExecutionException A03;

    public C3i4(1DA r302, 1ET r303, 1DN r304, RejectedExecutionException rejectedExecutionException) {
        this.A00 = r302;
        this.A01 = r303;
        this.A02 = r304;
        this.A03 = rejectedExecutionException;
    }

    @Override // java.lang.Runnable
    public void run() {
        1ET r0 = this.A01;
        r0.contextCleanup();
        1DN r02 = this.A02;
        if (r02.A02 != null) {
            1DN.A00(r0, r02, (Boolean) null, 0S2.A0C, 0L, 0L, 0L);
        }
        3uD.A00("Combined Async RejectedExecutionException", (String) null, this.A03);
    }
}
