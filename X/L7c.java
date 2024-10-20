package X;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: L7c.class */
public final class L7c {
    public static final Interpolator A03 = new PathInterpolator(0.3f, 0.1f, 0.0f, 1.0f);
    public final 1Br A02 = 1Bu.A00(131199);
    public final L8i A00 = A00(1.0f);
    public final L8i A01 = A00(0.0f);

    private final L8i A00(float f) {
        L8i l8i = new L8i();
        C00i c00i = this.A02.A00;
        l8i.A03((float) 1Br.A07(((6Ne) c00i.get()).A00).Ai7(37160323333030291L));
        l8i.A02((float) 1Br.A07(((6Ne) c00i.get()).A00).Ai7(37160323333095828L));
        l8i.A02 = f;
        return l8i;
    }
}
