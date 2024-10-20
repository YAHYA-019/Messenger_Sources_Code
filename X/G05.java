package X;

import android.app.Activity;
import android.content.Context;

/* loaded from: G05.class */
public final class G05 implements Runnable {
    public static final String __redex_internal_original_name = "FallbackManager$showFallbackScreen$1";
    public final /* synthetic */ EpY A00;

    public G05(EpY epY) {
        this.A00 = epY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.A01;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }
}
