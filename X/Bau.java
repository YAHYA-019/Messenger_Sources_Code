package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: Bau.class */
public final class Bau {
    public final BwM A00;

    public Bau(Context context, Fragment fragment, String str) {
        if (!AbF.A1Z(str)) {
            throw 1BL.A0l(str);
        }
        this.A00 = new BwM(context, fragment);
    }
}
