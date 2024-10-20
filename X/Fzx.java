package X;

import android.os.Handler;
import android.view.View;

/* loaded from: Fzx.class */
public final class Fzx implements Runnable {
    public static final String __redex_internal_original_name = "Tooltip$hideRunnable$2$1";
    public final /* synthetic */ C2137Deq A00;

    public Fzx(C2137Deq c2137Deq) {
        this.A00 = c2137Deq;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2137Deq c2137Deq = this.A00;
        View A00 = C2cd.A00(((FIU) c2137Deq).A0J);
        if (!C2cd.A08(((FIU) c2137Deq).A0J) && A00 == null) {
            ((FIU) c2137Deq).A0Q = false;
            c2137Deq.A06();
            return;
        }
        Handler handler = c2137Deq.A04;
        if (handler == null) {
            11T.A0L("handler");
            throw 0Q8.createAndThrow();
        }
        handler.postDelayed(this, c2137Deq.A03);
    }
}
