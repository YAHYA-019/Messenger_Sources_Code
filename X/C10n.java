package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.10n, reason: invalid class name */
/* loaded from: 10n.class */
public abstract class C10n {
    public static Uri A00(Context context, C10y c10y, C10G c10g) {
        11T.A0F(context, 0);
        Uri build = C1AJ.A00(context).A05(c10y).buildUpon().appendQueryParameter(K93.__redex_internal_original_name, String.valueOf(c10g.A00.intValue())).build();
        11T.A0A(build);
        return build;
    }
}
