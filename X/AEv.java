package X;

import com.facebook.messaging.threadview.params.ThreadViewParams;

/* loaded from: AEv.class */
public final class AEv implements Runnable {
    public static final String __redex_internal_original_name = "InboxMontageViewFragmentListener$requestShowThreadWithUser$1$2";
    public final /* synthetic */ 8uJ A00;
    public final /* synthetic */ ThreadViewParams A01;

    public AEv(8uJ r302, ThreadViewParams threadViewParams) {
        this.A00 = r302;
        this.A01 = threadViewParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A08.CH3(this.A01);
    }
}
