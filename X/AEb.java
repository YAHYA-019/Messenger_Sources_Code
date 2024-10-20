package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AEb.class */
public final class AEb implements Runnable {
    public static final String __redex_internal_original_name = "ComposerPlatformQuickReply$onQuickReplyReceivedCriticalPathAware$showQuickReplyRunnable$1";
    public final /* synthetic */ 6Ru A00;
    public final /* synthetic */ boolean A01;

    public AEb(6Ru r302, boolean z) {
        this.A00 = r302;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Ru r0 = this.A00;
        boolean z = this.A01;
        6Ru.A01(r0, (ThreadSummary) null, false);
        6Rv r02 = r0.A00;
        if (r02 != null) {
            if (z) {
                r02.A00.A1d();
            }
            6PX.A02(r02.A00.A0K, 0S2.A00);
        }
    }
}
