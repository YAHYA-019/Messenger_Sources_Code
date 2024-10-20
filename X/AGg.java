package X;

import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AGg.class */
public final class AGg implements Runnable {
    public static final String __redex_internal_original_name = "ComposerPlatformQuickReply$onKeyboardClosed$1";
    public final /* synthetic */ 6Ru A00;
    public final /* synthetic */ 5zD A01;
    public final /* synthetic */ ThreadSummary A02;
    public final /* synthetic */ boolean A03;

    public AGg(6Ru r302, 5zD r303, ThreadSummary threadSummary, boolean z) {
        this.A00 = r302;
        this.A01 = r303;
        this.A03 = z;
        this.A02 = threadSummary;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A04(this.A01, this.A02, this.A03);
    }
}
