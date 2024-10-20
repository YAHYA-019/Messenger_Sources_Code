package X;

import java.util.Queue;

/* loaded from: Fzs.class */
public final class Fzs implements Runnable {
    public static final String __redex_internal_original_name = "DataLoader$getEditorQueryFuture$1";
    public final /* synthetic */ Fcn A00;

    public Fzs(Fcn fcn) {
        this.A00 = fcn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fcn fcn = this.A00;
        fcn.A01 = true;
        Queue queue = fcn.A00;
        if (queue != null) {
            synchronized (queue) {
                for (Q5T q5t : fcn.A00) {
                    Object obj = ((0Mu) q5t).A00;
                    if (obj == Qno.A02) {
                        fcn.onSuccess(((0Mu) q5t).A01);
                    } else if (obj == Qno.A01) {
                        fcn.onFailure((Throwable) ((0Mu) q5t).A01);
                    }
                }
            }
        }
    }
}
