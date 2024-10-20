package X;

import android.net.Uri;
import android.view.View;

/* renamed from: X.7uL, reason: invalid class name */
/* loaded from: 7uL.class */
public abstract class C7uL {
    public static final void A00(Uri uri, View view, C06974ih c06974ih, Object obj) {
        1BK.A1J(c06974ih, 1, view);
        C1iM.A01(view, null, c06974ih, 5Bm.A01(uri, (java.util.Map) null), obj);
    }

    public static final void A01(View view) {
        5C4 A00 = C1iM.A00(view);
        if (A00 != null) {
            5BS.A01().Ccn(A00);
            A00.Ctj((Runnable) null);
        }
    }

    public static final void A02(View view, C06974ih c06974ih, 5BO r303, Object obj) {
        C1iM.A01(view, null, c06974ih, r303, obj);
    }
}
