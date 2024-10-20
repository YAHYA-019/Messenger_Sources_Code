package X;

import android.view.animation.PathInterpolator;
import com.facebook.rtc.views.omnigrid.GridItemType;
import java.util.Iterator;

/* loaded from: Hwo.class */
public abstract class Hwo {
    public static final DqJ A00;
    public static final 8Lm A01;

    static {
        C0ty c0ty = C0ty.A00;
        03W A0G = 04R.A0G();
        8Lu r0 = new 8Lu(C2631Gjg.A00(), J8h.A00);
        Integer num = 0S2.A00;
        GzB gzB = HNT.A00;
        A01 = new 8Lm(r0, new GjX(gzB, gzB, gzB, gzB, num, 1.0f, 0.25f), (Integer) null, c0ty, A0G, 48);
        A00 = new DqJ(180L, new PathInterpolator(0.2f, 0.12f, 0.0f, 1.0f), 2);
    }

    public static final C2621GjB A00(8Lm r301) {
        Object obj;
        Iterator A1G = GOn.A1G(r301.A05);
        while (true) {
            if (!A1G.hasNext()) {
                obj = null;
                break;
            }
            obj = A1G.next();
            if (((C2621GjB) obj).A02 == GridItemType.SELF_VIEW) {
                break;
            }
        }
        return (C2621GjB) obj;
    }
}
