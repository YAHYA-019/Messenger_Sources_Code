package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: Fzw.class */
public final class Fzw implements Runnable {
    public static final String __redex_internal_original_name = "PopoverWindow$1";
    public final /* synthetic */ FIU A00;

    public Fzw(FIU fiu) {
        this.A00 = fiu;
    }

    @Override // java.lang.Runnable
    public void run() {
        View A0G;
        FIU fiu = this.A00;
        WeakReference weakReference = fiu.A0P;
        if (weakReference == null || (A0G = DKC.A0G(weakReference)) == null) {
            return;
        }
        FIU.A01(A0G, fiu, fiu.A0S);
    }
}
