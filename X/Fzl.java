package X;

import com.facebook.conditionalworker.ConditionalWorkerManager;

/* loaded from: Fzl.class */
public final class Fzl implements Runnable {
    public static final String __redex_internal_original_name = "ConditionalWorkerManager$2";
    public final /* synthetic */ ConditionalWorkerManager A00;

    public Fzl(ConditionalWorkerManager conditionalWorkerManager) {
        this.A00 = conditionalWorkerManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.A01("after_logout");
    }
}
