package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.2qw, reason: invalid class name */
/* loaded from: 2qw.class */
public final class C2qw {
    public static final /* synthetic */ C2qw A00 = new Object();

    public static final void A00(1tI r301, 1tI r302) {
        List<Pair> Ake;
        if (r302 == null || r301 == null || (Ake = r301.Ake()) == null) {
            return;
        }
        for (Pair pair : Ake) {
            Object obj = pair.first;
            11T.A09(obj);
            String str = (String) obj;
            Object obj2 = pair.second;
            11T.A09(obj2);
            r302.CbU((1Im) obj2, str);
        }
    }
}
