package X;

import android.view.View;
import java.util.ArrayList;

/* loaded from: Itw.class */
public final class Itw implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$play$1";
    public final /* synthetic */ IhE A00;

    public Itw(IhE ihE) {
        this.A00 = ihE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr;
        String str;
        IhE ihE = this.A00;
        if (ihE.A0O.A0W()) {
            ArrayList A0s = AnonymousClass001.A0s();
            View view = ihE.A05;
            if (view == null || !I6G.A02(view.getContext(), A0s)) {
                11T.A0A(I6G.A00(A0s));
                objArr = new Object[]{I6G.A00(A0s)};
                str = "Failed to set secure Groot window for DRM video : %s";
            } else {
                objArr = new Object[0];
                str = "Groot window successfully set as secure for DRM video";
            }
            C51f.A01("GrootPlayer", str, objArr);
        }
    }
}
