package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: Hwc.class */
public abstract class Hwc {
    public static final java.util.Map A00;

    static {
        HashMap A0u = AnonymousClass001.A0u();
        A00 = A0u;
        A0u.put("669501923132281", 2131966375);
        A0u.put("856119944401477", 2131966376);
        A0u.put("557948687649549", 2131966377);
        A0u.put("726891670711210", 2131966374);
        A0u.put("245800698877618", 2131966372);
        A0u.put("678353922211749", 2131966370);
        A0u.put("847909358556595", 2131966379);
        A0u.put("818703164807551", 2131966378);
        A0u.put("665788383491047", 2131966371);
        A0u.put("749563621732178", 2131966373);
    }

    public static String A00(Context context, String str) {
        Number A0o = 1BK.A0o(str, A00);
        if (A0o == null) {
            return null;
        }
        return context.getString(A0o.intValue());
    }
}
