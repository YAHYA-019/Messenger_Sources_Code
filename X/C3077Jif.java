package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.Jif, reason: case insensitive filesystem */
/* loaded from: Jif.class */
public class C3077Jif extends AbstractC3078Jig {
    public static boolean A00 = true;

    public void A05(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.A05(view, i);
        } else if (A00) {
            try {
                KVP.A00(view, i);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
