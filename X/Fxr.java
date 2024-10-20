package X;

import android.app.Activity;
import android.content.Context;

/* loaded from: Fxr.class */
public final class Fxr implements GHI {
    public final int A00;
    public final Object A01;

    public Fxr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCancel() {
        GDy gDy;
        switch (this.A00) {
            case 0:
                FJ1 fj1 = (FJ1) this.A01;
                if (fj1.A09 != EP2.A05 || (gDy = fj1.A01) == null) {
                    DMU dmu = fj1.A08;
                    if (dmu != null) {
                        dmu.dismiss();
                    }
                } else {
                    gDy.BuG();
                }
                fj1.A00 = 6;
                return;
            case 1:
                Context context = ((FFA) this.A01).A01;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                    return;
                }
                return;
            default:
                7zL.A1R(this.A01);
                return;
        }
    }
}
