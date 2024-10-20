package X;

import android.view.View;
import com.facebook.messaging.aibot.nux.AiBotNuxFragment;

/* loaded from: ACo.class */
public final class ACo implements Runnable {
    public static final String __redex_internal_original_name = "AiBotNuxFragment$beforeOnResume$1";
    public final /* synthetic */ AiBotNuxFragment A00;

    public ACo(AiBotNuxFragment aiBotNuxFragment) {
        this.A00 = aiBotNuxFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00.mView;
        if (view != null) {
            7zT.A13(view.getContext(), view);
        }
    }
}
