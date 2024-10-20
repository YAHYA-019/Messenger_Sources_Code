package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Bae.class */
public final class Bae {
    public final CMY A00;

    public Bae(Context context, 1Iw r303, C0e c0e, MigColorScheme migColorScheme, ImmutableList immutableList, String str, int i, boolean z) {
        if (!str.equals("IndexRail")) {
            throw 1BL.A0l(str);
        }
        this.A00 = new CMY(context, r303, c0e, migColorScheme, immutableList, i, z);
    }
}
