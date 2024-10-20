package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;

/* loaded from: Hwi.class */
public abstract class Hwi {
    public static final java.util.Map A00 = 1BK.A1D("component_tag", "vito2");
    public static final java.util.Map A01 = 4YW.A0A("origin_sub", "shortcut", 1BK.A1G("origin", "memory_bitmap"));

    public static final 5CI A00(2EU r301, 1OW r302, GSl gSl) {
        boolean z;
        Uri uri;
        2Ed r0;
        java.util.Map map = A00;
        java.util.Map map2 = A01;
        java.util.Map map3 = r302 != null ? ((1OV) r302).A04 : null;
        Rect rect = gSl.A01;
        5BR r02 = gSl.A02;
        String valueOf = String.valueOf(r02 != null ? ((C06984ii) r02.A02).A02 : null);
        5BR r03 = gSl.A02;
        PointF pointF = r03 != null ? ((C06984ii) r03.A02).A01 : null;
        java.util.Map AlR = (r301 == null || (r0 = (2Ed) r301.A09()) == null) ? null : r0.AlR();
        Object obj = gSl.A05;
        5BR r04 = gSl.A02;
        if (r04 != null) {
            z = r04.A06;
            2Dp r05 = r04.A04;
            if (r05 != null) {
                uri = r05.A05;
                return 5CH.A00(pointF, rect, uri, obj, valueOf, map, map2, map3, (java.util.Map) null, AlR, z);
            }
        } else {
            z = false;
        }
        uri = null;
        return 5CH.A00(pointF, rect, uri, obj, valueOf, map, map2, map3, (java.util.Map) null, AlR, z);
    }
}
