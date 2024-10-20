package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* loaded from: L09.class */
public final class L09 {
    public static final Object A03 = AnonymousClass001.A0R();
    public final Context A00;
    public final String A01;
    public final java.util.Map A02;

    public L09(Drawable.Callback callback, String str, java.util.Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = 0Pz.A0J(str, '/');
        }
        this.A01 = str;
        this.A02 = map;
        this.A00 = !(callback instanceof View) ? null : ((View) callback).getContext().getApplicationContext();
    }
}
