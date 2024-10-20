package X;

import androidx.lifecycle.LiveData;
import java.util.List;

/* renamed from: X.9iJ, reason: invalid class name */
/* loaded from: 9iJ.class */
public abstract class C9iJ {
    public static final Object A00(LiveData liveData, C2k5 c2k5) {
        return A01(liveData, c2k5, new DKb(liveData, 31), new Object[7zP.A1X(liveData)]);
    }

    public static final Object A01(LiveData liveData, C2k5 c2k5, C00m c00m, Object[] objArr) {
        Object A01 = 3vP.A01(c2k5, C3oi.A00);
        if (A01 == null) {
            throw AnonymousClass001.A0N("There is no lifecycle owner. Make you created your LithoView with an AOSPLithoVisibilityEventsController.");
        }
        C2lh A00 = C2lc.A00(c2k5, new DKb(c00m, 32));
        4FL.A00(c2k5, new 85O(17, A01, liveData, A00), new Object[]{A01, objArr});
        return A00.A02;
    }

    public static List A02(LiveData liveData, C2k5 c2k5) {
        List list = (List) A00(liveData, c2k5);
        if (list == null) {
            list = C0ty.A00;
        }
        return list;
    }
}
