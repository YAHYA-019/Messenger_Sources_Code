package X;

import com.facebook.conditionalworker.ConditionalWorkerManager;

/* loaded from: Fzk.class */
public final class Fzk implements Runnable {
    public static final String __redex_internal_original_name = "ConditionalWorkerManager$1";
    public final /* synthetic */ ConditionalWorkerManager A00;

    public Fzk(ConditionalWorkerManager conditionalWorkerManager) {
        this.A00 = conditionalWorkerManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A01("auth_complete");
    }
}
