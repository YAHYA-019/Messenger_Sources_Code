package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: Gza.class */
public abstract class Gza extends Gzc {
    public static final String __redex_internal_original_name = "CaptureOverlayFragment";
    public WeakReference A00;

    @Override // X.Gzc
    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super.onAttach(context);
        if (context instanceof JGX) {
            this.A00 = 7zL.A14(context);
        }
    }
}
